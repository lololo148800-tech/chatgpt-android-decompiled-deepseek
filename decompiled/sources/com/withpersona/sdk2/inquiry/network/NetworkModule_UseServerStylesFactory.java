package com.withpersona.sdk2.inquiry.network;

import p248Jk.InterfaceC4473d;
import p544W9.AbstractC8446A2;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_UseServerStylesFactory implements InterfaceC4473d {
    private final NetworkModule module;

    public NetworkModule_UseServerStylesFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_UseServerStylesFactory create(NetworkModule networkModule) {
        return new NetworkModule_UseServerStylesFactory(networkModule);
    }

    public static String useServerStyles(NetworkModule networkModule) {
        String strUseServerStyles = networkModule.useServerStyles();
        AbstractC8446A2.m9048a(strUseServerStyles);
        return strUseServerStyles;
    }

    @Override // p876lm.InterfaceC17068a
    public String get() {
        return useServerStyles(this.module);
    }
}
