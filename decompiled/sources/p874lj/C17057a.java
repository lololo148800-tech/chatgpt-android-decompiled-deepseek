package p874lj;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import mp.C17360a;
import mp.InterfaceC17361b;
import p028B.C0700g;
import p1145z7.C21812i;
import p1145z7.InterfaceC21813j;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p765g7.InterfaceC13823a;
import p854kf.AbstractC16393k;
import p879lp.EnumC17120c;
import p959q8.InterfaceC18645g;
import p972qm.C18778k;
import p993rj.C19028H;
import p993rj.C19031K;
import p993rj.C19032L;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: lj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C17057a implements InterfaceC17361b, InterfaceC18645g, InterfaceC21813j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54520Y;

    public /* synthetic */ C17057a(int i10) {
        this.f54520Y = i10;
    }

    @Override // p959q8.InterfaceC18645g
    /* JADX INFO: renamed from: a */
    public void mo15102a(Context context) {
        int i10 = this.f54520Y;
    }

    @Override // p1145z7.InterfaceC21813j
    /* JADX INFO: renamed from: b */
    public C21812i mo18884b() {
        return new C21812i();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m18885c(C19032L c19032l, CameraCharacteristics cameraCharacteristics, ArrayList arrayList, CameraDevice cameraDevice, Handler handler, AbstractC19687c abstractC19687c) throws CameraAccessException {
        C19028H c19028h;
        C19031K c19031k;
        C19031K c19031k2;
        if (abstractC19687c instanceof C19028H) {
            c19028h = (C19028H) abstractC19687c;
            int i10 = c19028h.f60655q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19028h.f60655q0 = i10 - Integer.MIN_VALUE;
            } else {
                c19028h = new C19028H(this, abstractC19687c);
            }
        } else {
            c19028h = new C19028H(this, abstractC19687c);
        }
        Object obj = c19028h.f60653o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19028h.f60655q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C19031K c19031k3 = new C19031K(c19032l, arrayList, handler, cameraCharacteristics);
            c19028h.f60651Y = c19031k3;
            c19028h.f60652Z = c19031k3;
            c19028h.f60655q0 = 1;
            C18778k c18778k = new C18778k(AbstractC8154o0.m8714e(c19028h));
            C0700g c0700g = new C0700g(c18778k, cameraDevice);
            if (Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    OutputConfiguration outputConfigurationM17982e = AbstractC16393k.m17982e((Surface) it.next());
                    outputConfigurationM17982e.setDynamicRangeProfile(c19031k3.f60660a.f60675g.f60682a);
                    arrayList2.add(outputConfigurationM17982e);
                }
                cameraDevice.createCaptureSessionByOutputConfigurations(arrayList2, c0700g, handler);
            } else {
                cameraDevice.createCaptureSession(arrayList, c0700g, handler);
            }
            Object objM20051a = c18778k.m20051a();
            EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
            if (objM20051a == enumC19250a) {
                return enumC19250a;
            }
            c19031k = c19031k3;
            obj = objM20051a;
            c19031k2 = c19031k;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c19031k2 = c19028h.f60652Z;
            c19031k = c19028h.f60651Y;
            AbstractC9233X.m9807c(obj);
        }
        c19031k2.f60668i = (CameraCaptureSession) obj;
        return c19031k;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005c A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:40:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0065  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:58:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0099  */
    /* JADX WARN: Code duplicated, block: B:64:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:93:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00c8 A[SYNTHETIC] */
    @Override // mp.InterfaceC17361b
    /* JADX INFO: renamed from: d */
    public C17360a mo18886d(int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13;
        boolean z6;
        boolean z10;
        char cCharAt;
        int i14 = -1;
        boolean z11 = true;
        for (int i15 = i10 - 1; i15 >= i11; i15--) {
            char cCharAt2 = charSequence.charAt(i15);
            if ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < 'a' || cCharAt2 > 'z') && !((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 >= 128 || cCharAt2 == '!' || cCharAt2 == '-' || cCharAt2 == '/' || cCharAt2 == '=' || cCharAt2 == '?' || cCharAt2 == '*' || cCharAt2 == '+'))) {
                switch (cCharAt2) {
                    default:
                        switch (cCharAt2) {
                            default:
                                switch (cCharAt2) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        break;
                                    default:
                                        if (cCharAt2 == '.' && !z11) {
                                            z11 = true;
                                        }
                                        break;
                                }
                            case '^':
                            case '_':
                            case '`':
                                i14 = i15;
                                z11 = false;
                                continue;
                        }
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                        i14 = i15;
                        z11 = false;
                        continue;
                }
                if (i14 == -1) {
                    return null;
                }
                i12 = -1;
                i13 = -1;
                i12 = i10 + 1;
                z6 = true;
                z10 = false;
                while (i12 < charSequence.length()) {
                    cCharAt = charSequence.charAt(i12);
                    if (z6) {
                        if ((cCharAt >= 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt < 128))) {
                            if (i13 != -1 || i13 > i12) {
                                i12 = -1;
                            }
                            if (i12 == -1) {
                                return null;
                            }
                            return new C17360a(EnumC17120c.f54727Z, i14, i12 + 1);
                        }
                        z6 = false;
                        z10 = true;
                    } else if (cCharAt == '.') {
                        if (!z10) {
                            if (i13 != -1) {
                                i12 = -1;
                            } else {
                                i12 = -1;
                            }
                            if (i12 == -1) {
                                return null;
                            }
                            return new C17360a(EnumC17120c.f54727Z, i14, i12 + 1);
                        }
                        if (i13 == -1) {
                            i13 = i12;
                            z6 = true;
                        } else {
                            i13 = i13;
                            z6 = true;
                        }
                    } else if (cCharAt == '-') {
                        i13 = i13;
                        z10 = false;
                    } else {
                        if ((cCharAt >= 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < '0' || cCharAt > '9'))) {
                            if (cCharAt < 128) {
                                if (i13 != -1) {
                                    i12 = -1;
                                } else {
                                    i12 = -1;
                                }
                                if (i12 == -1) {
                                    return null;
                                }
                                return new C17360a(EnumC17120c.f54727Z, i14, i12 + 1);
                            }
                        }
                        z10 = true;
                    }
                    i12++;
                    z10 = z10;
                    i13 = i13;
                }
                if (i13 != -1) {
                    i12 = -1;
                } else {
                    i12 = -1;
                }
                if (i12 == -1) {
                    return null;
                }
                return new C17360a(EnumC17120c.f54727Z, i14, i12 + 1);
            }
            i14 = i15;
            z11 = false;
            continue;
        }
        if (i14 == -1) {
            return null;
        }
        i12 = -1;
        i13 = -1;
        i12 = i10 + 1;
        z6 = true;
        z10 = false;
        while (i12 < charSequence.length()) {
            cCharAt = charSequence.charAt(i12);
            if (z6) {
                if (cCharAt >= 'A') {
                    if (i13 != -1) {
                        i12 = -1;
                    } else {
                        i12 = -1;
                    }
                    if (i12 == -1) {
                        return null;
                    }
                    return new C17360a(EnumC17120c.f54727Z, i14, i12 + 1);
                }
                if (i13 != -1) {
                    i12 = -1;
                } else {
                    i12 = -1;
                }
                if (i12 == -1) {
                    return null;
                }
                return new C17360a(EnumC17120c.f54727Z, i14, i12 + 1);
                z6 = false;
                z10 = true;
            } else if (cCharAt == '.') {
                if (!z10) {
                    if (i13 != -1) {
                        i12 = -1;
                    } else {
                        i12 = -1;
                    }
                    if (i12 == -1) {
                        return null;
                    }
                    return new C17360a(EnumC17120c.f54727Z, i14, i12 + 1);
                }
                if (i13 == -1) {
                    i13 = i12;
                    z6 = true;
                } else {
                    i13 = i13;
                    z6 = true;
                }
            } else if (cCharAt == '-') {
                i13 = i13;
                z10 = false;
            } else {
                if (cCharAt >= 'A') {
                    if (cCharAt < 128) {
                        if (i13 != -1) {
                            i12 = -1;
                        } else {
                            i12 = -1;
                        }
                        if (i12 == -1) {
                            return null;
                        }
                        return new C17360a(EnumC17120c.f54727Z, i14, i12 + 1);
                    }
                } else if (cCharAt < 128) {
                    if (i13 != -1) {
                        i12 = -1;
                    } else {
                        i12 = -1;
                    }
                    if (i12 == -1) {
                        return null;
                    }
                    return new C17360a(EnumC17120c.f54727Z, i14, i12 + 1);
                }
                z10 = true;
            }
            i12++;
            z10 = z10;
            i13 = i13;
        }
        if (i13 != -1) {
            i12 = -1;
        } else {
            i12 = -1;
        }
        if (i12 == -1) {
            return null;
        }
        return new C17360a(EnumC17120c.f54727Z, i14, i12 + 1);
    }

    @Override // p959q8.InterfaceC18645g
    /* JADX INFO: renamed from: e */
    public void mo15103e(InterfaceC13823a interfaceC13823a, Context context) {
        AbstractC16544l.m18094g(context, "context");
    }

    /* JADX INFO: renamed from: f */
    private final void m18882f(Context context) {
    }

    /* JADX INFO: renamed from: g */
    private final void m18883g(Context context) {
    }
}
