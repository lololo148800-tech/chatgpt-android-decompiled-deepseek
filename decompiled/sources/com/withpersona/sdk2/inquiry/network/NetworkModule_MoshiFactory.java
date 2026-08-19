package com.withpersona.sdk2.inquiry.network;

import bj.C11447L;
import bj.InterfaceC11470q;
import java.util.Set;
import p248Jk.InterfaceC4473d;
import p544W9.AbstractC8446A2;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_MoshiFactory implements InterfaceC4473d {
    private final InterfaceC17068a jsonAdapterBindingsProvider;
    private final InterfaceC17068a jsonAdapterFactoryProvider;
    private final InterfaceC17068a jsonAdaptersProvider;
    private final NetworkModule module;

    public NetworkModule_MoshiFactory(NetworkModule networkModule, InterfaceC17068a interfaceC17068a, InterfaceC17068a interfaceC17068a2, InterfaceC17068a interfaceC17068a3) {
        this.module = networkModule;
        this.jsonAdaptersProvider = interfaceC17068a;
        this.jsonAdapterBindingsProvider = interfaceC17068a2;
        this.jsonAdapterFactoryProvider = interfaceC17068a3;
    }

    public static NetworkModule_MoshiFactory create(NetworkModule networkModule, InterfaceC17068a interfaceC17068a, InterfaceC17068a interfaceC17068a2, InterfaceC17068a interfaceC17068a3) {
        return new NetworkModule_MoshiFactory(networkModule, interfaceC17068a, interfaceC17068a2, interfaceC17068a3);
    }

    public static C11447L moshi(NetworkModule networkModule, Set<Object> set, Set<JsonAdapterBinding<?>> set2, Set<InterfaceC11470q> set3) {
        C11447L c11447lMoshi = networkModule.moshi(set, set2, set3);
        AbstractC8446A2.m9048a(c11447lMoshi);
        return c11447lMoshi;
    }

    @Override // p876lm.InterfaceC17068a
    public C11447L get() {
        return moshi(this.module, (Set) this.jsonAdaptersProvider.get(), (Set) this.jsonAdapterBindingsProvider.get(), (Set) this.jsonAdapterFactoryProvider.get());
    }
}
