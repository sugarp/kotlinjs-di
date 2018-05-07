package com.ps.di

object DI {
    var mapping : MutableMap<dynamic, dynamic> = mutableMapOf()

    inline fun<reified T : Any> define(noinline fn: () -> T) {
        mapping[T::class] = fn
    }

    inline fun<reified T : Any> define(obj: T) {
        mapping[T::class] = obj
    }

    inline fun<reified T : Any> inject() : T {
        var c : dynamic = null
        var maps = this.mapping
        var kclass = T::class

        for(pair in maps) {
            if(pair.key == kclass) {
                c = pair.value
                break
            }
        }

        if(c == null) throw NotImplementedError("Oh come on, man! There is no implementation defined for specified type: $kclass ")

        return if(js("typeof(c) === 'function'") as Boolean) {
            c() as T
        } else {
            c as T
        }
    }
}