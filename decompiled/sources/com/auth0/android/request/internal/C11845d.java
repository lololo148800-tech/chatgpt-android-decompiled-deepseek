package com.auth0.android.request.internal;

import com.auth0.android.result.Credentials;
import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.C3669l;
import p959q8.C18639a;

/* JADX INFO: renamed from: com.auth0.android.request.internal.d */
/* JADX INFO: loaded from: classes.dex */
public final class C11845d {

    /* JADX INFO: renamed from: b */
    public static final C18639a f35974b = new C18639a(23);

    /* JADX INFO: renamed from: c */
    public static volatile C11845d f35975c;

    /* JADX INFO: renamed from: a */
    public final Object f35976a;

    public /* synthetic */ C11845d(Object obj) {
        this.f35976a = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11845d(C3669l gson, TypeToken typeToken) {
        this(gson.m4372f(typeToken));
        AbstractC16544l.m18094g(gson, "gson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11845d(C3669l gson) {
        this(gson.m4372f(TypeToken.get(Credentials.class)));
        AbstractC16544l.m18094g(gson, "gson");
    }
}
