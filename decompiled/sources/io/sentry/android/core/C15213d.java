package io.sentry.android.core;

import io.sentry.C15134J0;
import io.sentry.InterfaceC15137K0;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: io.sentry.android.core.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15213d implements InterfaceC15137K0 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47461Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f47462Z;

    public /* synthetic */ C15213d(String str, int i10) {
        this.f47461Y = i10;
        this.f47462Z = str;
    }

    @Override // io.sentry.InterfaceC15137K0
    /* JADX INFO: renamed from: f */
    public final void mo390f(C15134J0 it) {
        switch (this.f47461Y) {
            case 0:
                it.m16306c(this.f47462Z);
                break;
            default:
                AbstractC16544l.m18094g(it, "it");
                it.m16306c(this.f47462Z);
                break;
        }
    }
}
