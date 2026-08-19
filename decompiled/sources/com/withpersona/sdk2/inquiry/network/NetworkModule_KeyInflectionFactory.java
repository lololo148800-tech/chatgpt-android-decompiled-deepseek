package com.withpersona.sdk2.inquiry.network;

import p248Jk.InterfaceC4473d;
import p544W9.AbstractC8446A2;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_KeyInflectionFactory implements InterfaceC4473d {
    private final NetworkModule module;

    public NetworkModule_KeyInflectionFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_KeyInflectionFactory create(NetworkModule networkModule) {
        return new NetworkModule_KeyInflectionFactory(networkModule);
    }

    public static String keyInflection(NetworkModule networkModule) {
        String strKeyInflection = networkModule.keyInflection();
        AbstractC8446A2.m9048a(strKeyInflection);
        return strKeyInflection;
    }

    @Override // p876lm.InterfaceC17068a
    public String get() {
        return keyInflection(this.module);
    }
}
