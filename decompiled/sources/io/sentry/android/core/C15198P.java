package io.sentry.android.core;

import android.util.Log;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;

/* JADX INFO: renamed from: io.sentry.android.core.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C15198P implements InterfaceC15190H, InterfaceC15127H {

    /* JADX INFO: renamed from: Y */
    public static final C15198P f47371Y = new C15198P();

    /* JADX INFO: renamed from: a */
    public static boolean m16403a(C15524y1 c15524y1, String str) {
        return m16404b(str, c15524y1 != null ? c15524y1.getLogger() : null) != null;
    }

    /* JADX INFO: renamed from: b */
    public static Class m16404b(String str, InterfaceC15127H interfaceC15127H) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            if (interfaceC15127H == null) {
                return null;
            }
            interfaceC15127H.mo16297h(EnumC15375i1.DEBUG, "Class not available:".concat(str), e10);
            return null;
        } catch (UnsatisfiedLinkError e11) {
            if (interfaceC15127H == null) {
                return null;
            }
            interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e11);
            return null;
        } catch (Throwable th2) {
            if (interfaceC15127H == null) {
                return null;
            }
            interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Failed to initialize ".concat(str), th2);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC15127H
    /* JADX INFO: renamed from: g */
    public void mo16296g(EnumC15375i1 enumC15375i1, Throwable th2, String str, Object... objArr) {
        if (objArr.length == 0) {
            mo16297h(enumC15375i1, str, th2);
        } else {
            mo16297h(enumC15375i1, String.format(str, objArr), th2);
        }
    }

    @Override // io.sentry.InterfaceC15127H
    /* JADX INFO: renamed from: h */
    public void mo16297h(EnumC15375i1 enumC15375i1, String str, Throwable th2) {
        int i10 = AbstractC15241j.f47567a[enumC15375i1.ordinal()];
        if (i10 == 1) {
            Log.i("Sentry", str, th2);
            return;
        }
        if (i10 == 2) {
            Log.w("Sentry", str, th2);
            return;
        }
        if (i10 == 3) {
            Log.e("Sentry", str, th2);
        } else if (i10 != 4) {
            Log.d("Sentry", str, th2);
        } else {
            Log.wtf("Sentry", str, th2);
        }
    }

    @Override // io.sentry.InterfaceC15127H
    /* JADX INFO: renamed from: o */
    public void mo16298o(EnumC15375i1 enumC15375i1, String str, Object... objArr) {
        int i10 = 5;
        if (objArr.length == 0) {
            int i11 = AbstractC15241j.f47567a[enumC15375i1.ordinal()];
            if (i11 == 1) {
                i10 = 4;
            } else if (i11 != 2) {
                i10 = i11 != 4 ? 3 : 7;
            }
            Log.println(i10, "Sentry", str);
            return;
        }
        int i12 = AbstractC15241j.f47567a[enumC15375i1.ordinal()];
        if (i12 == 1) {
            i10 = 4;
        } else if (i12 != 2) {
            i10 = i12 != 4 ? 3 : 7;
        }
        Log.println(i10, "Sentry", String.format(str, objArr));
    }

    @Override // io.sentry.InterfaceC15127H
    /* JADX INFO: renamed from: p */
    public boolean mo16299p(EnumC15375i1 enumC15375i1) {
        return true;
    }
}
