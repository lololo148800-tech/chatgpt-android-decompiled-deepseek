package p326N;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p001A.C0053b0;
import p178H.InterfaceC3122O;
import p523V9.AbstractC8072d6;

/* JADX INFO: renamed from: N.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5567i implements InterfaceC3122O {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3122O f18056a;

    /* JADX INFO: renamed from: b */
    public final Object f18057b = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f18058c;

    /* JADX INFO: renamed from: d */
    public C0053b0 f18059d;

    public C5567i(InterfaceC3122O interfaceC3122O) {
        this.f18056a = interfaceC3122O;
    }

    @Override // p178H.InterfaceC3122O
    /* JADX INFO: renamed from: a */
    public final void mo3954a(long j10, C0053b0 screenFlashListener) {
        C17296C c17296c;
        AbstractC16544l.m18094g(screenFlashListener, "screenFlashListener");
        synchronized (this.f18057b) {
            this.f18058c = true;
            this.f18059d = screenFlashListener;
        }
        InterfaceC3122O interfaceC3122O = this.f18056a;
        if (interfaceC3122O != null) {
            interfaceC3122O.mo3954a(j10, new C0053b0(this, 1));
            c17296c = C17296C.f55119a;
        } else {
            c17296c = null;
        }
        if (c17296c == null) {
            AbstractC8072d6.m8487d("ScreenFlashWrapper", "apply: screenFlash is null!");
            m5976c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5975b() {
        C17296C c17296c;
        synchronized (this.f18057b) {
            try {
                if (this.f18058c) {
                    InterfaceC3122O interfaceC3122O = this.f18056a;
                    if (interfaceC3122O != null) {
                        interfaceC3122O.clear();
                        c17296c = C17296C.f55119a;
                    } else {
                        c17296c = null;
                    }
                    if (c17296c == null) {
                        AbstractC8072d6.m8487d("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    AbstractC8072d6.m8492i("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f18058c = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5976c() {
        synchronized (this.f18057b) {
            try {
                C0053b0 c0053b0 = this.f18059d;
                if (c0053b0 != null) {
                    c0053b0.m235a();
                }
                this.f18059d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p178H.InterfaceC3122O
    public final void clear() {
        m5975b();
    }
}
