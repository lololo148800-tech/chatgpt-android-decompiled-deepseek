package p1016t3;

import java.util.Arrays;
import p1073w3.AbstractC20817s;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: t3.A */
/* JADX INFO: loaded from: classes.dex */
public final class C19751A {

    /* JADX INFO: renamed from: y */
    public static final C19751A f62530y = new C19751A(new C19799z());

    /* JADX INFO: renamed from: a */
    public final CharSequence f62531a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f62532b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f62533c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f62534d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f62535e;

    /* JADX INFO: renamed from: f */
    public final byte[] f62536f;

    /* JADX INFO: renamed from: g */
    public final Integer f62537g;

    /* JADX INFO: renamed from: h */
    public final Integer f62538h;

    /* JADX INFO: renamed from: i */
    public final Integer f62539i;

    /* JADX INFO: renamed from: j */
    public final Integer f62540j;

    /* JADX INFO: renamed from: k */
    public final Boolean f62541k;

    /* JADX INFO: renamed from: l */
    public final Integer f62542l;

    /* JADX INFO: renamed from: m */
    public final Integer f62543m;

    /* JADX INFO: renamed from: n */
    public final Integer f62544n;

    /* JADX INFO: renamed from: o */
    public final Integer f62545o;

    /* JADX INFO: renamed from: p */
    public final Integer f62546p;

    /* JADX INFO: renamed from: q */
    public final Integer f62547q;

    /* JADX INFO: renamed from: r */
    public final Integer f62548r;

    /* JADX INFO: renamed from: s */
    public final CharSequence f62549s;

    /* JADX INFO: renamed from: t */
    public final CharSequence f62550t;

    /* JADX INFO: renamed from: u */
    public final CharSequence f62551u;

    /* JADX INFO: renamed from: v */
    public final CharSequence f62552v;

    /* JADX INFO: renamed from: w */
    public final CharSequence f62553w;

    /* JADX INFO: renamed from: x */
    public final Integer f62554x;

    static {
        AbstractC17792x.m19540w(0, 1, 2, 3, 4);
        AbstractC17792x.m19540w(5, 6, 8, 9, 10);
        AbstractC17792x.m19540w(11, 12, 13, 14, 15);
        AbstractC17792x.m19540w(16, 17, 18, 19, 20);
        AbstractC17792x.m19540w(21, 22, 23, 24, 25);
        AbstractC17792x.m19540w(26, 27, 28, 29, 30);
        AbstractC20817s.m21425z(31);
        AbstractC20817s.m21425z(32);
        AbstractC20817s.m21425z(33);
        AbstractC20817s.m21425z(1000);
    }

    public C19751A(C19799z c19799z) {
        Boolean boolValueOf = c19799z.f62803k;
        Integer numValueOf = c19799z.f62802j;
        Integer numValueOf2 = c19799z.f62815w;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i10 = 0;
                            break;
                        case 21:
                            i10 = 2;
                            break;
                        case 22:
                            i10 = 3;
                            break;
                        case 23:
                            i10 = 4;
                            break;
                        case 24:
                            i10 = 5;
                            break;
                        case 25:
                            i10 = 6;
                            break;
                    }
                    i12 = i10;
                }
                numValueOf = Integer.valueOf(i12);
            }
        } else if (numValueOf != null) {
            boolean z6 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z6);
            if (z6 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i11 = 21;
                        break;
                    case 3:
                        i11 = 22;
                        break;
                    case 4:
                        i11 = 23;
                        break;
                    case 5:
                        i11 = 24;
                        break;
                    case 6:
                        i11 = 25;
                        break;
                    default:
                        i11 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i11);
            }
        }
        this.f62531a = c19799z.f62793a;
        this.f62532b = c19799z.f62794b;
        this.f62533c = c19799z.f62795c;
        this.f62534d = c19799z.f62796d;
        this.f62535e = c19799z.f62797e;
        this.f62536f = c19799z.f62798f;
        this.f62537g = c19799z.f62799g;
        this.f62538h = c19799z.f62800h;
        this.f62539i = c19799z.f62801i;
        this.f62540j = numValueOf;
        this.f62541k = boolValueOf;
        Integer num = c19799z.f62804l;
        this.f62542l = num;
        this.f62543m = num;
        this.f62544n = c19799z.f62805m;
        this.f62545o = c19799z.f62806n;
        this.f62546p = c19799z.f62807o;
        this.f62547q = c19799z.f62808p;
        this.f62548r = c19799z.f62809q;
        this.f62549s = c19799z.f62810r;
        this.f62550t = c19799z.f62811s;
        this.f62551u = c19799z.f62812t;
        this.f62552v = c19799z.f62813u;
        this.f62553w = c19799z.f62814v;
        this.f62554x = numValueOf2;
    }

    /* JADX INFO: renamed from: a */
    public final C19799z m20700a() {
        C19799z c19799z = new C19799z();
        c19799z.f62793a = this.f62531a;
        c19799z.f62794b = this.f62532b;
        c19799z.f62795c = this.f62533c;
        c19799z.f62796d = this.f62534d;
        c19799z.f62797e = this.f62535e;
        c19799z.f62798f = this.f62536f;
        c19799z.f62799g = this.f62537g;
        c19799z.f62800h = this.f62538h;
        c19799z.f62801i = this.f62539i;
        c19799z.f62802j = this.f62540j;
        c19799z.f62803k = this.f62541k;
        c19799z.f62804l = this.f62543m;
        c19799z.f62805m = this.f62544n;
        c19799z.f62806n = this.f62545o;
        c19799z.f62807o = this.f62546p;
        c19799z.f62808p = this.f62547q;
        c19799z.f62809q = this.f62548r;
        c19799z.f62810r = this.f62549s;
        c19799z.f62811s = this.f62550t;
        c19799z.f62812t = this.f62551u;
        c19799z.f62813u = this.f62552v;
        c19799z.f62814v = this.f62553w;
        c19799z.f62815w = this.f62554x;
        return c19799z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19751A.class != obj.getClass()) {
            return false;
        }
        C19751A c19751a = (C19751A) obj;
        return AbstractC20817s.m21400a(this.f62531a, c19751a.f62531a) && AbstractC20817s.m21400a(this.f62532b, c19751a.f62532b) && AbstractC20817s.m21400a(this.f62533c, c19751a.f62533c) && AbstractC20817s.m21400a(this.f62534d, c19751a.f62534d) && AbstractC20817s.m21400a(null, null) && AbstractC20817s.m21400a(null, null) && AbstractC20817s.m21400a(this.f62535e, c19751a.f62535e) && AbstractC20817s.m21400a(null, null) && AbstractC20817s.m21400a(null, null) && AbstractC20817s.m21400a(null, null) && Arrays.equals(this.f62536f, c19751a.f62536f) && AbstractC20817s.m21400a(this.f62537g, c19751a.f62537g) && AbstractC20817s.m21400a(null, null) && AbstractC20817s.m21400a(this.f62538h, c19751a.f62538h) && AbstractC20817s.m21400a(this.f62539i, c19751a.f62539i) && AbstractC20817s.m21400a(this.f62540j, c19751a.f62540j) && AbstractC20817s.m21400a(this.f62541k, c19751a.f62541k) && AbstractC20817s.m21400a(null, null) && AbstractC20817s.m21400a(this.f62543m, c19751a.f62543m) && AbstractC20817s.m21400a(this.f62544n, c19751a.f62544n) && AbstractC20817s.m21400a(this.f62545o, c19751a.f62545o) && AbstractC20817s.m21400a(this.f62546p, c19751a.f62546p) && AbstractC20817s.m21400a(this.f62547q, c19751a.f62547q) && AbstractC20817s.m21400a(this.f62548r, c19751a.f62548r) && AbstractC20817s.m21400a(this.f62549s, c19751a.f62549s) && AbstractC20817s.m21400a(this.f62550t, c19751a.f62550t) && AbstractC20817s.m21400a(this.f62551u, c19751a.f62551u) && AbstractC20817s.m21400a(null, null) && AbstractC20817s.m21400a(null, null) && AbstractC20817s.m21400a(this.f62552v, c19751a.f62552v) && AbstractC20817s.m21400a(null, null) && AbstractC20817s.m21400a(this.f62553w, c19751a.f62553w) && AbstractC20817s.m21400a(this.f62554x, c19751a.f62554x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f62531a, this.f62532b, this.f62533c, this.f62534d, null, null, this.f62535e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f62536f)), this.f62537g, null, this.f62538h, this.f62539i, this.f62540j, this.f62541k, null, this.f62543m, this.f62544n, this.f62545o, this.f62546p, this.f62547q, this.f62548r, this.f62549s, this.f62550t, this.f62551u, null, null, this.f62552v, null, this.f62553w, this.f62554x, true});
    }
}
