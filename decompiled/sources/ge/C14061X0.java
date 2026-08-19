package ge;

import kotlin.jvm.internal.AbstractC16544l;
import p148Fi.AbstractC2792U0;
import p148Fi.AbstractC2829i1;
import p148Fi.C2820f1;

/* JADX INFO: renamed from: ge.X0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14061X0 {

    /* JADX INFO: renamed from: a */
    public final boolean f44208a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2829i1 f44209b;

    /* JADX INFO: renamed from: c */
    public final boolean f44210c;

    /* JADX INFO: renamed from: d */
    public final boolean f44211d;

    /* JADX INFO: renamed from: e */
    public final boolean f44212e;

    public C14061X0(boolean z6, AbstractC2829i1 voiceState, boolean z10, boolean z11) {
        AbstractC16544l.m18094g(voiceState, "voiceState");
        this.f44208a = z6;
        this.f44209b = voiceState;
        this.f44210c = z10;
        this.f44211d = z11;
        this.f44212e = AbstractC2792U0.m3710a(voiceState);
    }

    /* JADX INFO: renamed from: a */
    public static C14061X0 m15484a(C14061X0 c14061x0, boolean z6, AbstractC2829i1 voiceState, boolean z10, boolean z11, int i10) {
        if ((i10 & 1) != 0) {
            z6 = c14061x0.f44208a;
        }
        if ((i10 & 2) != 0) {
            voiceState = c14061x0.f44209b;
        }
        if ((i10 & 4) != 0) {
            z10 = c14061x0.f44210c;
        }
        if ((i10 & 8) != 0) {
            z11 = c14061x0.f44211d;
        }
        c14061x0.getClass();
        AbstractC16544l.m18094g(voiceState, "voiceState");
        return new C14061X0(z6, voiceState, z10, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14061X0)) {
            return false;
        }
        C14061X0 c14061x0 = (C14061X0) obj;
        return this.f44208a == c14061x0.f44208a && AbstractC16544l.m18089b(this.f44209b, c14061x0.f44209b) && this.f44210c == c14061x0.f44210c && this.f44211d == c14061x0.f44211d;
    }

    public final int hashCode() {
        return ((((this.f44209b.hashCode() + ((this.f44208a ? 1231 : 1237) * 31)) * 31) + (this.f44210c ? 1231 : 1237)) * 31) + (this.f44211d ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C14061X0(boolean z6, int i10) {
        this(false, C2820f1.f8553a, (i10 & 4) != 0 ? false : z6, false);
    }
}
