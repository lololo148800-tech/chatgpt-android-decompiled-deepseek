package com.withpersona.sdk2.inquiry.network;

import bj.C11447L;
import mo.C17356w;
import p1027tp.C20050O;
import p248Jk.InterfaceC4473d;
import p544W9.AbstractC8446A2;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_RetrofitFactory implements InterfaceC4473d {
    private final NetworkModule module;
    private final InterfaceC17068a moshiProvider;
    private final InterfaceC17068a okHttpClientProvider;
    private final InterfaceC17068a serverEndpointProvider;

    public NetworkModule_RetrofitFactory(NetworkModule networkModule, InterfaceC17068a interfaceC17068a, InterfaceC17068a interfaceC17068a2, InterfaceC17068a interfaceC17068a3) {
        this.module = networkModule;
        this.serverEndpointProvider = interfaceC17068a;
        this.okHttpClientProvider = interfaceC17068a2;
        this.moshiProvider = interfaceC17068a3;
    }

    public static NetworkModule_RetrofitFactory create(NetworkModule networkModule, InterfaceC17068a interfaceC17068a, InterfaceC17068a interfaceC17068a2, InterfaceC17068a interfaceC17068a3) {
        return new NetworkModule_RetrofitFactory(networkModule, interfaceC17068a, interfaceC17068a2, interfaceC17068a3);
    }

    public static C20050O retrofit(NetworkModule networkModule, String str, C17356w c17356w, C11447L c11447l) {
        C20050O c20050oRetrofit = networkModule.retrofit(str, c17356w, c11447l);
        AbstractC8446A2.m9048a(c20050oRetrofit);
        return c20050oRetrofit;
    }

    @Override // p876lm.InterfaceC17068a
    public C20050O get() {
        return retrofit(this.module, (String) this.serverEndpointProvider.get(), (C17356w) this.okHttpClientProvider.get(), (C11447L) this.moshiProvider.get());
    }
}
