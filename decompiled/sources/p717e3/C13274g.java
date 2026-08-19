package p717e3;

import androidx.glance.appwidget.protobuf.AbstractC11057s;
import androidx.glance.appwidget.protobuf.AbstractC11059u;
import androidx.glance.appwidget.protobuf.C11025V;
import androidx.glance.appwidget.protobuf.C11058t;
import androidx.glance.appwidget.protobuf.InterfaceC11022S;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: e3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C13274g extends AbstractC11059u {
    private static final C13274g DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile InterfaceC11022S PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private C13276i layout_;

    static {
        C13274g c13274g = new C13274g();
        DEFAULT_INSTANCE = c13274g;
        AbstractC11059u.m12098k(C13274g.class, c13274g);
    }

    /* JADX INFO: renamed from: m */
    public static void m14879m(C13274g c13274g, C13276i c13276i) {
        c13274g.getClass();
        c13276i.getClass();
        c13274g.layout_ = c13276i;
        c13274g.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: n */
    public static void m14880n(C13274g c13274g, int i10) {
        c13274g.layoutIndex_ = i10;
    }

    /* JADX INFO: renamed from: q */
    public static C13273f m14881q() {
        return (C13273f) ((AbstractC11057s) DEFAULT_INSTANCE.mo12101d(5));
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11059u
    /* JADX INFO: renamed from: d */
    public final Object mo12101d(int i10) {
        switch (AbstractC0010F.m24h(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C11025V(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new C13274g();
            case 4:
                return new C13273f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC11022S c11058t = PARSER;
                if (c11058t == null) {
                    synchronized (C13274g.class) {
                        try {
                            c11058t = PARSER;
                            if (c11058t == null) {
                                c11058t = new C11058t();
                                PARSER = c11058t;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return c11058t;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: o */
    public final C13276i m14882o() {
        C13276i c13276i = this.layout_;
        return c13276i == null ? C13276i.m14895x() : c13276i;
    }

    /* JADX INFO: renamed from: p */
    public final int m14883p() {
        return this.layoutIndex_;
    }
}
