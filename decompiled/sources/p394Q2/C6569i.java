package p394Q2;

import androidx.datastore.preferences.protobuf.AbstractC10983s;
import androidx.datastore.preferences.protobuf.AbstractC10987u;
import androidx.datastore.preferences.protobuf.C10946Z;
import androidx.datastore.preferences.protobuf.C10985t;
import androidx.datastore.preferences.protobuf.InterfaceC10942V;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: Q2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6569i extends AbstractC10987u {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final C6569i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC10942V PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        C6569i c6569i = new C6569i();
        DEFAULT_INSTANCE = c6569i;
        AbstractC10987u.m11717h(C6569i.class, c6569i);
    }

    /* JADX INFO: renamed from: i */
    public static void m7135i(C6569i c6569i, long j10) {
        c6569i.valueCase_ = 4;
        c6569i.value_ = Long.valueOf(j10);
    }

    /* JADX INFO: renamed from: j */
    public static void m7136j(C6569i c6569i, String str) {
        c6569i.getClass();
        str.getClass();
        c6569i.valueCase_ = 5;
        c6569i.value_ = str;
    }

    /* JADX INFO: renamed from: k */
    public static void m7137k(C6569i c6569i, C6566f c6566f) {
        c6569i.getClass();
        c6569i.value_ = c6566f.m11711a();
        c6569i.valueCase_ = 6;
    }

    /* JADX INFO: renamed from: l */
    public static void m7138l(C6569i c6569i, double d10) {
        c6569i.valueCase_ = 7;
        c6569i.value_ = Double.valueOf(d10);
    }

    /* JADX INFO: renamed from: m */
    public static void m7139m(C6569i c6569i, boolean z6) {
        c6569i.valueCase_ = 1;
        c6569i.value_ = Boolean.valueOf(z6);
    }

    /* JADX INFO: renamed from: n */
    public static void m7140n(C6569i c6569i, float f10) {
        c6569i.valueCase_ = 2;
        c6569i.value_ = Float.valueOf(f10);
    }

    /* JADX INFO: renamed from: o */
    public static void m7141o(C6569i c6569i, int i10) {
        c6569i.valueCase_ = 3;
        c6569i.value_ = Integer.valueOf(i10);
    }

    /* JADX INFO: renamed from: q */
    public static C6569i m7142q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static C6568h m7143y() {
        return (C6568h) ((AbstractC10983s) DEFAULT_INSTANCE.mo7129d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10987u
    /* JADX INFO: renamed from: d */
    public final Object mo7129d(int i10) {
        switch (AbstractC0010F.m24h(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C10946Z(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C6567g.class});
            case 3:
                return new C6569i();
            case 4:
                return new C6568h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC10942V c10985t = PARSER;
                if (c10985t == null) {
                    synchronized (C6569i.class) {
                        try {
                            c10985t = PARSER;
                            if (c10985t == null) {
                                c10985t = new C10985t();
                                PARSER = c10985t;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return c10985t;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m7144p() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final double m7145r() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: s */
    public final float m7146s() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: t */
    public final int m7147t() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public final long m7148u() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: v */
    public final String m7149v() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: w */
    public final C6567g m7150w() {
        return this.valueCase_ == 6 ? (C6567g) this.value_ : C6567g.m7132j();
    }

    /* JADX INFO: renamed from: x */
    public final int m7151x() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }
}
