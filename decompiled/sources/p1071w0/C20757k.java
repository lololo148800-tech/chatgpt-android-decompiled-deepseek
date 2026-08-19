package p1071w0;

import android.view.KeyEvent;
import p1116y0.InterfaceC21354c;
import p349O0.C6018n0;
import p349O0.C6021p;
import p479Td.AbstractC7360k;
import p537W0.C8410b;
import p963qd.C18685n;
import p978r1.AbstractC18857c;
import p978r1.C18855a;

/* JADX INFO: renamed from: w0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C20757k implements InterfaceC21354c, InterfaceC20735Y {

    /* JADX INFO: renamed from: Z */
    public static final C20757k f65888Z = new C20757k(0);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65889Y;

    public /* synthetic */ C20757k(int i10) {
        this.f65889Y = i10;
    }

    @Override // p1071w0.InterfaceC20735Y
    /* JADX INFO: renamed from: e */
    public int mo10666e(KeyEvent keyEvent) {
        int i10 = 0;
        switch (this.f65889Y) {
            case 1:
                int i11 = C20736Z.f65741Y;
                if (!keyEvent.isCtrlPressed() || !keyEvent.isShiftPressed()) {
                    if (keyEvent.isCtrlPressed()) {
                        long jM20157d = AbstractC18857c.m20157d(keyEvent);
                        if (!(C18855a.m20153a(jM20157d, AbstractC20766o0.f65914b) ? true : C18855a.m20153a(jM20157d, AbstractC20766o0.f65929q))) {
                            if (!C18855a.m20153a(jM20157d, AbstractC20766o0.f65916d)) {
                                if (!C18855a.m20153a(jM20157d, AbstractC20766o0.f65918f)) {
                                    if (C18855a.m20153a(jM20157d, AbstractC20766o0.f65913a)) {
                                        return 26;
                                    }
                                    if (!C18855a.m20153a(jM20157d, AbstractC20766o0.f65917e)) {
                                        return C18855a.m20153a(jM20157d, AbstractC20766o0.f65919g) ? 46 : 0;
                                    }
                                }
                                return 19;
                            }
                            return 18;
                        }
                        return 17;
                    }
                    if (keyEvent.isCtrlPressed()) {
                        return 0;
                    }
                    if (keyEvent.isShiftPressed()) {
                        long jM7784a = AbstractC7360k.m7784a(keyEvent.getKeyCode());
                        if (C18855a.m20153a(jM7784a, AbstractC20766o0.f65921i)) {
                            return 27;
                        }
                        if (C18855a.m20153a(jM7784a, AbstractC20766o0.f65922j)) {
                            return 28;
                        }
                        if (C18855a.m20153a(jM7784a, AbstractC20766o0.f65923k)) {
                            return 29;
                        }
                        if (C18855a.m20153a(jM7784a, AbstractC20766o0.f65924l)) {
                            return 30;
                        }
                        if (C18855a.m20153a(jM7784a, AbstractC20766o0.f65925m)) {
                            return 31;
                        }
                        if (C18855a.m20153a(jM7784a, AbstractC20766o0.f65926n)) {
                            return 32;
                        }
                        if (C18855a.m20153a(jM7784a, AbstractC20766o0.f65927o)) {
                            return 39;
                        }
                        if (C18855a.m20153a(jM7784a, AbstractC20766o0.f65928p)) {
                            return 40;
                        }
                        if (!C18855a.m20153a(jM7784a, AbstractC20766o0.f65929q)) {
                            return 0;
                        }
                    } else {
                        long jM7784a2 = AbstractC7360k.m7784a(keyEvent.getKeyCode());
                        if (C18855a.m20153a(jM7784a2, AbstractC20766o0.f65921i)) {
                            return 1;
                        }
                        if (C18855a.m20153a(jM7784a2, AbstractC20766o0.f65922j)) {
                            return 2;
                        }
                        if (C18855a.m20153a(jM7784a2, AbstractC20766o0.f65923k)) {
                            return 11;
                        }
                        if (C18855a.m20153a(jM7784a2, AbstractC20766o0.f65924l)) {
                            return 12;
                        }
                        if (C18855a.m20153a(jM7784a2, AbstractC20766o0.f65925m)) {
                            return 13;
                        }
                        if (C18855a.m20153a(jM7784a2, AbstractC20766o0.f65926n)) {
                            return 14;
                        }
                        if (C18855a.m20153a(jM7784a2, AbstractC20766o0.f65927o)) {
                            return 7;
                        }
                        if (C18855a.m20153a(jM7784a2, AbstractC20766o0.f65928p)) {
                            return 8;
                        }
                        if (C18855a.m20153a(jM7784a2, AbstractC20766o0.f65930r)) {
                            return 44;
                        }
                        if (C18855a.m20153a(jM7784a2, AbstractC20766o0.f65931s)) {
                            return 20;
                        }
                        if (C18855a.m20153a(jM7784a2, AbstractC20766o0.f65932t)) {
                            return 21;
                        }
                        if (!C18855a.m20153a(jM7784a2, AbstractC20766o0.f65933u)) {
                            if (!C18855a.m20153a(jM7784a2, AbstractC20766o0.f65934v)) {
                                if (!C18855a.m20153a(jM7784a2, AbstractC20766o0.f65935w)) {
                                    return C18855a.m20153a(jM7784a2, AbstractC20766o0.f65936x) ? 45 : 0;
                                }
                                return 17;
                            }
                            return 19;
                        }
                    }
                    return 18;
                }
                if (!C18855a.m20153a(AbstractC7360k.m7784a(keyEvent.getKeyCode()), AbstractC20766o0.f65919g)) {
                    return 0;
                }
                return 47;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long jM7784a3 = AbstractC7360k.m7784a(keyEvent.getKeyCode());
                    if (C18855a.m20153a(jM7784a3, AbstractC20766o0.f65921i)) {
                        i10 = 41;
                    } else if (C18855a.m20153a(jM7784a3, AbstractC20766o0.f65922j)) {
                        i10 = 42;
                    } else if (C18855a.m20153a(jM7784a3, AbstractC20766o0.f65923k)) {
                        i10 = 33;
                    } else if (C18855a.m20153a(jM7784a3, AbstractC20766o0.f65924l)) {
                        i10 = 34;
                    }
                } else if (keyEvent.isAltPressed()) {
                    long jM7784a4 = AbstractC7360k.m7784a(keyEvent.getKeyCode());
                    if (C18855a.m20153a(jM7784a4, AbstractC20766o0.f65921i)) {
                        i10 = 9;
                    } else if (C18855a.m20153a(jM7784a4, AbstractC20766o0.f65922j)) {
                        i10 = 10;
                    } else if (C18855a.m20153a(jM7784a4, AbstractC20766o0.f65923k)) {
                        i10 = 15;
                    } else if (C18855a.m20153a(jM7784a4, AbstractC20766o0.f65924l)) {
                        i10 = 16;
                    }
                }
                return i10 == 0 ? AbstractC20738a0.f65743a.mo10666e(keyEvent) : i10;
        }
    }

    @Override // p1116y0.InterfaceC21354c
    /* JADX INFO: renamed from: k */
    public void mo5856k(C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1669748801);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c8410b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c8410b.invoke(c6021p, Integer.valueOf(i11 & 14));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18685n(this, c8410b, i10, 4);
        }
    }
}
