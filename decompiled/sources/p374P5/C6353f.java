package p374P5;

import kotlin.jvm.internal.AbstractC16544l;
import p397Q5.EnumC6575d;
import p397Q5.EnumC6578g;
import p397Q5.InterfaceC6580i;
import p496U5.C7567i;
import p972qm.C18777j;

/* JADX INFO: renamed from: P5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6353f {

    /* JADX INFO: renamed from: a */
    public final C18777j f20652a;

    /* JADX INFO: renamed from: b */
    public final C18777j f20653b;

    /* JADX INFO: renamed from: c */
    public final C18777j f20654c;

    /* JADX INFO: renamed from: d */
    public final C7567i f20655d;

    /* JADX INFO: renamed from: e */
    public final C7567i f20656e;

    /* JADX INFO: renamed from: f */
    public final C7567i f20657f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6580i f20658g;

    /* JADX INFO: renamed from: h */
    public final EnumC6578g f20659h;

    /* JADX INFO: renamed from: i */
    public final EnumC6575d f20660i;

    public C6353f(C18777j c18777j, C18777j c18777j2, C18777j c18777j3, C7567i c7567i, C7567i c7567i2, C7567i c7567i3, InterfaceC6580i interfaceC6580i, EnumC6578g enumC6578g, EnumC6575d enumC6575d) {
        this.f20652a = c18777j;
        this.f20653b = c18777j2;
        this.f20654c = c18777j3;
        this.f20655d = c7567i;
        this.f20656e = c7567i2;
        this.f20657f = c7567i3;
        this.f20658g = interfaceC6580i;
        this.f20659h = enumC6578g;
        this.f20660i = enumC6575d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6353f)) {
            return false;
        }
        C6353f c6353f = (C6353f) obj;
        c6353f.getClass();
        return AbstractC16544l.m18089b(null, null) && AbstractC16544l.m18089b(this.f20652a, c6353f.f20652a) && AbstractC16544l.m18089b(this.f20653b, c6353f.f20653b) && AbstractC16544l.m18089b(this.f20654c, c6353f.f20654c) && AbstractC16544l.m18089b(this.f20655d, c6353f.f20655d) && AbstractC16544l.m18089b(this.f20656e, c6353f.f20656e) && AbstractC16544l.m18089b(this.f20657f, c6353f.f20657f) && AbstractC16544l.m18089b(this.f20658g, c6353f.f20658g) && this.f20659h == c6353f.f20659h && this.f20660i == c6353f.f20660i;
    }

    public final int hashCode() {
        C7567i c7567i = this.f20655d;
        int iHashCode = (c7567i == null ? 0 : c7567i.hashCode()) * 31;
        C7567i c7567i2 = this.f20656e;
        int iHashCode2 = (iHashCode + (c7567i2 == null ? 0 : c7567i2.hashCode())) * 31;
        C7567i c7567i3 = this.f20657f;
        int iHashCode3 = (iHashCode2 + (c7567i3 == null ? 0 : c7567i3.hashCode())) * 31;
        InterfaceC6580i interfaceC6580i = this.f20658g;
        int iHashCode4 = (iHashCode3 + (interfaceC6580i == null ? 0 : interfaceC6580i.hashCode())) * 31;
        EnumC6578g enumC6578g = this.f20659h;
        int iHashCode5 = (iHashCode4 + (enumC6578g == null ? 0 : enumC6578g.hashCode())) * 31;
        EnumC6575d enumC6575d = this.f20660i;
        return iHashCode5 + (enumC6575d != null ? enumC6575d.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.f20652a + ", fetcherCoroutineContext=" + this.f20653b + ", decoderCoroutineContext=" + this.f20654c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + this.f20655d + ", errorFactory=" + this.f20656e + ", fallbackFactory=" + this.f20657f + ", sizeResolver=" + this.f20658g + ", scale=" + this.f20659h + ", precision=" + this.f20660i + ')';
    }
}
