package ai;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: ai.j */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10619j {
    public static final C10615f Companion = new C10615f();

    /* JADX INFO: renamed from: i */
    public static final KSerializer[] f31502i = {EnumC10617h.Companion.serializer(), null, null, null, EnumC10612c.Companion.serializer(), null, null, null};

    /* JADX INFO: renamed from: a */
    public final EnumC10617h f31503a;

    /* JADX INFO: renamed from: b */
    public final Integer f31504b;

    /* JADX INFO: renamed from: c */
    public final Integer f31505c;

    /* JADX INFO: renamed from: d */
    public final Integer f31506d;

    /* JADX INFO: renamed from: e */
    public final EnumC10612c f31507e;

    /* JADX INFO: renamed from: f */
    public final Integer f31508f;

    /* JADX INFO: renamed from: g */
    public final Integer f31509g;

    /* JADX INFO: renamed from: h */
    public final Integer f31510h;

    public /* synthetic */ C10619j(int i10, EnumC10617h enumC10617h, Integer num, Integer num2, Integer num3, EnumC10612c enumC10612c, Integer num4, Integer num5, Integer num6) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C10614e.f31495a.getDescriptor());
            throw null;
        }
        this.f31503a = enumC10617h;
        if ((i10 & 2) == 0) {
            this.f31504b = null;
        } else {
            this.f31504b = num;
        }
        if ((i10 & 4) == 0) {
            this.f31505c = null;
        } else {
            this.f31505c = num2;
        }
        if ((i10 & 8) == 0) {
            this.f31506d = null;
        } else {
            this.f31506d = num3;
        }
        if ((i10 & 16) == 0) {
            this.f31507e = null;
        } else {
            this.f31507e = enumC10612c;
        }
        if ((i10 & 32) == 0) {
            this.f31508f = null;
        } else {
            this.f31508f = num4;
        }
        if ((i10 & 64) == 0) {
            this.f31509g = null;
        } else {
            this.f31509g = num5;
        }
        if ((i10 & 128) == 0) {
            this.f31510h = null;
        } else {
            this.f31510h = num6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10619j)) {
            return false;
        }
        C10619j c10619j = (C10619j) obj;
        return this.f31503a == c10619j.f31503a && AbstractC16544l.m18089b(this.f31504b, c10619j.f31504b) && AbstractC16544l.m18089b(this.f31505c, c10619j.f31505c) && AbstractC16544l.m18089b(this.f31506d, c10619j.f31506d) && this.f31507e == c10619j.f31507e && AbstractC16544l.m18089b(this.f31508f, c10619j.f31508f) && AbstractC16544l.m18089b(this.f31509g, c10619j.f31509g) && AbstractC16544l.m18089b(this.f31510h, c10619j.f31510h);
    }

    public final int hashCode() {
        int iHashCode = this.f31503a.hashCode() * 31;
        Integer num = this.f31504b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f31505c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f31506d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        EnumC10612c enumC10612c = this.f31507e;
        int iHashCode5 = (iHashCode4 + (enumC10612c == null ? 0 : enumC10612c.hashCode())) * 31;
        Integer num4 = this.f31508f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f31509g;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f31510h;
        return iHashCode7 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C10619j(EnumC10612c enumC10612c) {
        this.f31503a = EnumC10617h.Weekly;
        this.f31504b = 23;
        this.f31505c = 40;
        this.f31506d = 2;
        this.f31507e = enumC10612c;
        this.f31508f = null;
        this.f31509g = null;
        this.f31510h = null;
    }
}
