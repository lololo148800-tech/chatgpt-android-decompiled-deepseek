package p571X9;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17297D;
import mm.C17313p;
import mm.C17314q;
import mm.C17323z;
import mm.EnumC17307j;
import mm.InterfaceC17306i;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p138F8.vJO.vRJidSveZHcTw;

/* JADX INFO: renamed from: X9.W */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9227W {
    /* JADX INFO: renamed from: b */
    public static InterfaceC17306i m9799b(EnumC17307j enumC17307j, InterfaceC1426a initializer) {
        AbstractC16544l.m18094g(initializer, "initializer");
        int iOrdinal = enumC17307j.ordinal();
        if (iOrdinal == 0) {
            return new C17314q(initializer);
        }
        C17323z c17323z = C17323z.f55155a;
        if (iOrdinal == 1) {
            C17313p c17313p = new C17313p();
            c17313p.f55141Y = initializer;
            c17313p.f55142Z = c17323z;
            return c17313p;
        }
        if (iOrdinal != 2) {
            throw new C0644w();
        }
        C17297D c17297d = new C17297D();
        c17297d.f55120Y = initializer;
        c17297d.f55121Z = c17323z;
        return c17297d;
    }

    /* JADX INFO: renamed from: c */
    public static C17314q m9800c(InterfaceC1426a initializer) {
        AbstractC16544l.m18094g(initializer, "initializer");
        return new C17314q(initializer);
    }

    /* JADX INFO: renamed from: a */
    public static String m9798a(int i10, String str) {
        String strM9889h;
        switch (i10) {
            case 12288:
                strM9889h = vRJidSveZHcTw.gawCXVCLQMPDlY;
                break;
            case 12289:
                strM9889h = "EGL_NOT_INITIALIZED";
                break;
            case 12290:
                strM9889h = "EGL_BAD_ACCESS";
                break;
            case 12291:
                strM9889h = "EGL_BAD_ALLOC";
                break;
            case 12292:
                strM9889h = "EGL_BAD_ATTRIBUTE";
                break;
            case 12293:
                strM9889h = "EGL_BAD_CONFIG";
                break;
            case 12294:
                strM9889h = "EGL_BAD_CONTEXT";
                break;
            case 12295:
                strM9889h = "EGL_BAD_CURRENT_SURFACE";
                break;
            case 12296:
                strM9889h = "EGL_BAD_DISPLAY";
                break;
            case 12297:
                strM9889h = "EGL_BAD_MATCH";
                break;
            case 12298:
                strM9889h = "EGL_BAD_NATIVE_PIXMAP";
                break;
            case 12299:
                strM9889h = "EGL_BAD_NATIVE_WINDOW";
                break;
            case 12300:
                strM9889h = "EGL_BAD_PARAMETER";
                break;
            case 12301:
                strM9889h = "EGL_BAD_SURFACE";
                break;
            case 12302:
                strM9889h = "EGL_CONTEXT_LOST";
                break;
            default:
                strM9889h = AbstractC9306j0.m9889h("0x", Integer.toHexString(i10));
                break;
        }
        return AbstractC9306j0.m9890i(str, " failed: ", strM9889h);
    }
}
