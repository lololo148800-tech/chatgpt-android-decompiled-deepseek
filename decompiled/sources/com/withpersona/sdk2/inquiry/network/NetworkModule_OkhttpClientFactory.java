package com.withpersona.sdk2.inquiry.network;

import android.content.Context;
import java.util.Map;
import java.util.Set;
import mo.C17356w;
import mo.InterfaceC17351r;
import p248Jk.InterfaceC4473d;
import p544W9.AbstractC8446A2;
import p814ik.InterfaceC15029a;
import p814ik.InterfaceC15030b;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_OkhttpClientFactory implements InterfaceC4473d {
    private final InterfaceC17068a appSetIDHelperProvider;
    private final InterfaceC17068a contextProvider;
    private final InterfaceC17068a deviceInfoProvider;
    private final InterfaceC17068a headersProvider;
    private final InterfaceC17068a interceptorsProvider;
    private final NetworkModule module;

    public NetworkModule_OkhttpClientFactory(NetworkModule networkModule, InterfaceC17068a interfaceC17068a, InterfaceC17068a interfaceC17068a2, InterfaceC17068a interfaceC17068a3, InterfaceC17068a interfaceC17068a4, InterfaceC17068a interfaceC17068a5) {
        this.module = networkModule;
        this.interceptorsProvider = interfaceC17068a;
        this.headersProvider = interfaceC17068a2;
        this.contextProvider = interfaceC17068a3;
        this.appSetIDHelperProvider = interfaceC17068a4;
        this.deviceInfoProvider = interfaceC17068a5;
    }

    public static NetworkModule_OkhttpClientFactory create(NetworkModule networkModule, InterfaceC17068a interfaceC17068a, InterfaceC17068a interfaceC17068a2, InterfaceC17068a interfaceC17068a3, InterfaceC17068a interfaceC17068a4, InterfaceC17068a interfaceC17068a5) {
        return new NetworkModule_OkhttpClientFactory(networkModule, interfaceC17068a, interfaceC17068a2, interfaceC17068a3, interfaceC17068a4, interfaceC17068a5);
    }

    public static C17356w okhttpClient(NetworkModule networkModule, Set<InterfaceC17351r> set, Map<String, String> map, Context context, InterfaceC15029a interfaceC15029a, InterfaceC15030b interfaceC15030b) {
        C17356w c17356wOkhttpClient = networkModule.okhttpClient(set, map, context, interfaceC15029a, interfaceC15030b);
        AbstractC8446A2.m9048a(c17356wOkhttpClient);
        return c17356wOkhttpClient;
    }

    @Override // p876lm.InterfaceC17068a
    public C17356w get() {
        return okhttpClient(this.module, (Set) this.interceptorsProvider.get(), (Map) this.headersProvider.get(), (Context) this.contextProvider.get(), (InterfaceC15029a) this.appSetIDHelperProvider.get(), (InterfaceC15030b) this.deviceInfoProvider.get());
    }
}
