package p291Lf;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p1042uh.C20263a0;
import p269Kh.C4684k;
import p403Qd.AbstractC6659u;
import p403Qd.C6658t;
import p575Xd.C9436E;
import p621Zd.C10282c;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Lf.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C5024u {

    /* JADX INFO: renamed from: a */
    public final C10282c f16414a;

    /* JADX INFO: renamed from: b */
    public final C10282c f16415b;

    /* JADX INFO: renamed from: c */
    public final AbstractC6659u f16416c;

    /* JADX INFO: renamed from: d */
    public final boolean f16417d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1436k f16418e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC10459q f16419f;

    /* JADX INFO: renamed from: g */
    public final C4684k f16420g;

    /* JADX INFO: renamed from: h */
    public final boolean f16421h;

    /* JADX INFO: renamed from: i */
    public final boolean f16422i;

    /* JADX INFO: renamed from: j */
    public final boolean f16423j;

    /* JADX INFO: renamed from: k */
    public final boolean f16424k;

    /* JADX INFO: renamed from: l */
    public final boolean f16425l;

    /* JADX INFO: renamed from: m */
    public final C20263a0 f16426m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC1436k f16427n;

    /* JADX INFO: renamed from: o */
    public final C9436E f16428o;

    static {
        C6658t c6658t = AbstractC6659u.Companion;
    }

    public C5024u(C10282c c10282c, C10282c c10282c2, AbstractC6659u conversationItem, boolean z6, InterfaceC1436k onIntent, InterfaceC10459q modifier, C4684k c4684k, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, C20263a0 c20263a0, InterfaceC1436k onMessageAudioIntent, C9436E safeUrls) {
        AbstractC16544l.m18094g(conversationItem, "conversationItem");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        AbstractC16544l.m18094g(modifier, "modifier");
        AbstractC16544l.m18094g(onMessageAudioIntent, "onMessageAudioIntent");
        AbstractC16544l.m18094g(safeUrls, "safeUrls");
        this.f16414a = c10282c;
        this.f16415b = c10282c2;
        this.f16416c = conversationItem;
        this.f16417d = z6;
        this.f16418e = onIntent;
        this.f16419f = modifier;
        this.f16420g = c4684k;
        this.f16421h = z10;
        this.f16422i = z11;
        this.f16423j = z12;
        this.f16424k = z13;
        this.f16425l = z14;
        this.f16426m = c20263a0;
        this.f16427n = onMessageAudioIntent;
        this.f16428o = safeUrls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5024u)) {
            return false;
        }
        C5024u c5024u = (C5024u) obj;
        return AbstractC16544l.m18089b(this.f16414a, c5024u.f16414a) && AbstractC16544l.m18089b(this.f16415b, c5024u.f16415b) && AbstractC16544l.m18089b(this.f16416c, c5024u.f16416c) && this.f16417d == c5024u.f16417d && AbstractC16544l.m18089b(this.f16418e, c5024u.f16418e) && AbstractC16544l.m18089b(this.f16419f, c5024u.f16419f) && AbstractC16544l.m18089b(this.f16420g, c5024u.f16420g) && this.f16421h == c5024u.f16421h && this.f16422i == c5024u.f16422i && this.f16423j == c5024u.f16423j && this.f16424k == c5024u.f16424k && this.f16425l == c5024u.f16425l && AbstractC16544l.m18089b(this.f16426m, c5024u.f16426m) && AbstractC16544l.m18089b(this.f16427n, c5024u.f16427n) && AbstractC16544l.m18089b(this.f16428o, c5024u.f16428o);
    }

    public final int hashCode() {
        C10282c c10282c = this.f16414a;
        int iHashCode = (c10282c == null ? 0 : c10282c.hashCode()) * 31;
        C10282c c10282c2 = this.f16415b;
        int iHashCode2 = (this.f16419f.hashCode() + ((this.f16418e.hashCode() + ((((this.f16416c.hashCode() + ((iHashCode + (c10282c2 == null ? 0 : c10282c2.hashCode())) * 31)) * 31) + (this.f16417d ? 1231 : 1237)) * 31)) * 31)) * 31;
        C4684k c4684k = this.f16420g;
        int iHashCode3 = (((((((((((iHashCode2 + (c4684k == null ? 0 : c4684k.hashCode())) * 31) + (this.f16421h ? 1231 : 1237)) * 31) + (this.f16422i ? 1231 : 1237)) * 31) + (this.f16423j ? 1231 : 1237)) * 31) + (this.f16424k ? 1231 : 1237)) * 31) + (this.f16425l ? 1231 : 1237)) * 31;
        C20263a0 c20263a0 = this.f16426m;
        return this.f16428o.hashCode() + ((this.f16427n.hashCode() + ((iHashCode3 + (c20263a0 != null ? c20263a0.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
