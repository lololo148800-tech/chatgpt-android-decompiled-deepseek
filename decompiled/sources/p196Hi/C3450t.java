package p196Hi;

import android.service.voice.VoiceInteractionSession;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: Hi.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C3450t implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final VoiceInteractionSession.AssistState f10490a;

    /* JADX INFO: renamed from: b */
    public final Boolean f10491b;

    /* JADX INFO: renamed from: c */
    public final boolean f10492c;

    /* JADX INFO: renamed from: d */
    public final boolean f10493d;

    /* JADX INFO: renamed from: e */
    public final boolean f10494e;

    public C3450t(VoiceInteractionSession.AssistState assistState, Boolean bool, boolean z6, boolean z10, boolean z11) {
        this.f10490a = assistState;
        this.f10491b = bool;
        this.f10492c = z6;
        this.f10493d = z10;
        this.f10494e = z11;
    }

    /* JADX INFO: renamed from: e */
    public static C3450t m4192e(C3450t c3450t, Boolean bool, boolean z6, boolean z10, int i10) {
        VoiceInteractionSession.AssistState assistState = c3450t.f10490a;
        if ((i10 & 2) != 0) {
            bool = c3450t.f10491b;
        }
        Boolean bool2 = bool;
        if ((i10 & 4) != 0) {
            z6 = c3450t.f10492c;
        }
        boolean z11 = z6;
        if ((i10 & 8) != 0) {
            z10 = c3450t.f10493d;
        }
        boolean z12 = c3450t.f10494e;
        c3450t.getClass();
        return new C3450t(assistState, bool2, z11, z10, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3450t)) {
            return false;
        }
        C3450t c3450t = (C3450t) obj;
        return AbstractC16544l.m18089b(this.f10490a, c3450t.f10490a) && AbstractC16544l.m18089b(this.f10491b, c3450t.f10491b) && this.f10492c == c3450t.f10492c && this.f10493d == c3450t.f10493d && this.f10494e == c3450t.f10494e;
    }

    public final int hashCode() {
        VoiceInteractionSession.AssistState assistState = this.f10490a;
        int iHashCode = (assistState == null ? 0 : assistState.hashCode()) * 31;
        Boolean bool = this.f10491b;
        return ((((((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31) + (this.f10492c ? 1231 : 1237)) * 31) + (this.f10493d ? 1231 : 1237)) * 31) + (this.f10494e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
