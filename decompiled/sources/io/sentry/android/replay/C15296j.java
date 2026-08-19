package io.sentry.android.replay;

import io.sentry.C15134J0;
import io.sentry.InterfaceC15137K0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: io.sentry.android.replay.j */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15296j implements InterfaceC15137K0 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47784Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f47785Z;

    public /* synthetic */ C15296j(C16525B c16525b, int i10) {
        this.f47784Y = i10;
        this.f47785Z = c16525b;
    }

    @Override // io.sentry.InterfaceC15137K0
    /* JADX INFO: renamed from: f */
    public final void mo390f(C15134J0 it) {
        switch (this.f47784Y) {
            case 0:
                C16525B c16525b = this.f47785Z;
                AbstractC16544l.m18094g(it, "it");
                String str = it.f47115c;
                c16525b.f51262Y = str != null ? AbstractC21322p.m21703k0('.', str, str) : null;
                break;
            default:
                C16525B c16525b2 = this.f47785Z;
                AbstractC16544l.m18094g(it, "scope");
                c16525b2.f51262Y = new ArrayList(it.f47118f);
                break;
        }
    }
}
