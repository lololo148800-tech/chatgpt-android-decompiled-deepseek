package com.withpersona.sdk2.inquiry.network;

import bj.C11447L;
import mo.InterfaceC17351r;
import p248Jk.InterfaceC4473d;
import p544W9.AbstractC8446A2;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_InterceptorFactory implements InterfaceC4473d {
    private final NetworkModule module;
    private final InterfaceC17068a moshiProvider;

    public NetworkModule_InterceptorFactory(NetworkModule networkModule, InterfaceC17068a interfaceC17068a) {
        this.module = networkModule;
        this.moshiProvider = interfaceC17068a;
    }

    public static NetworkModule_InterceptorFactory create(NetworkModule networkModule, InterfaceC17068a interfaceC17068a) {
        return new NetworkModule_InterceptorFactory(networkModule, interfaceC17068a);
    }

    public static InterfaceC17351r interceptor(NetworkModule networkModule, C11447L c11447l) {
        InterfaceC17351r interfaceC17351rInterceptor = networkModule.interceptor(c11447l);
        AbstractC8446A2.m9048a(interfaceC17351rInterceptor);
        return interfaceC17351rInterceptor;
    }

    @Override // p876lm.InterfaceC17068a
    public InterfaceC17351r get() {
        return interceptor(this.module, (C11447L) this.moshiProvider.get());
    }
}
