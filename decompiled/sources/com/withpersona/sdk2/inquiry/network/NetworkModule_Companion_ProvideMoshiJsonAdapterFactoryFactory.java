package com.withpersona.sdk2.inquiry.network;

import bj.InterfaceC11470q;
import java.util.Set;
import p248Jk.InterfaceC4473d;
import p544W9.AbstractC8446A2;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkModule_Companion_ProvideMoshiJsonAdapterFactoryFactory implements InterfaceC4473d {

    public static final class InstanceHolder {
        private static final NetworkModule_Companion_ProvideMoshiJsonAdapterFactoryFactory INSTANCE = new NetworkModule_Companion_ProvideMoshiJsonAdapterFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkModule_Companion_ProvideMoshiJsonAdapterFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<InterfaceC11470q> provideMoshiJsonAdapterFactory() {
        Set<InterfaceC11470q> setProvideMoshiJsonAdapterFactory = NetworkModule.INSTANCE.provideMoshiJsonAdapterFactory();
        AbstractC8446A2.m9048a(setProvideMoshiJsonAdapterFactory);
        return setProvideMoshiJsonAdapterFactory;
    }

    @Override // p876lm.InterfaceC17068a
    public Set<InterfaceC11470q> get() {
        return provideMoshiJsonAdapterFactory();
    }
}
