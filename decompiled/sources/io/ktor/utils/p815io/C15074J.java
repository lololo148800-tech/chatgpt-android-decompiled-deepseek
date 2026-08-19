package io.ktor.utils.p815io;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.InterfaceC0571F;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: io.ktor.utils.io.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C15074J implements InterfaceC0571F {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC15066B f46837Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC18776i f46838Z;

    public C15074J(InterfaceC15066B interfaceC15066B, InterfaceC18776i coroutineContext) {
        AbstractC16544l.m18094g(coroutineContext, "coroutineContext");
        this.f46837Y = interfaceC15066B;
        this.f46838Z = coroutineContext;
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return this.f46838Z;
    }
}
