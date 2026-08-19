package p571X9;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Build;
import androidx.compose.p650ui.input.nestedscroll.AbstractC10866a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.notification.NotificationSettingsViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import fo.C13711h;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import no.AbstractC17708b;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p026Ao.C0675i;
import p049Bm.InterfaceC1426a;
import p098Di.InterfaceC2062k;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p124Ei.C2465M0;
import p124Ei.C2494b;
import p193Hf.C3323O;
import p229J0.AbstractC3917G4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4141u3;
import p229J0.C4055g1;
import p229J0.C4135t3;
import p243Jf.C4334d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p382Pf.C6401d;
import p455Sf.C7126k;
import p507Uh.C7688n;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p594Y9.AbstractC9856b0;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: X9.A3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9100A3 {
    /* JADX INFO: renamed from: a */
    public static final void m9627a(InterfaceC10459q interfaceC10459q, NotificationSettingsViewModel notificationSettingsViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        NotificationSettingsViewModel notificationSettingsViewModel2;
        boolean z6;
        Object objM10507b;
        c6021p.m6526U(2000474477);
        int i11 = i10 | 6;
        if ((i10 & 48) == 0) {
            i11 = i10 | 22;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            notificationSettingsViewModel2 = notificationSettingsViewModel;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C7126k.class));
                } else {
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    interfaceC2062k = null;
                }
                c6021p.m6553p(false);
                LocalViewModelStoreOwner.f33491a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                C16527D c16527d = AbstractC16526C.f51263a;
                Object objMo5693b = c16527d.mo5693b(NotificationSettingsViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C7126k.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C7126k.class), c16527d.mo5693b(NotificationSettingsViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(NotificationSettingsViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                interfaceC10459q2 = c10456n;
                notificationSettingsViewModel2 = (NotificationSettingsViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                notificationSettingsViewModel2 = notificationSettingsViewModel;
            }
            c6021p.m6554q();
            InterfaceC5985X interfaceC5985XM9642d = AbstractC9112C3.m9642d(notificationSettingsViewModel2.f40343c, c6021p);
            C13711h c13711hM4618d = AbstractC3917G4.m4618d(c6021p);
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            boolean zBooleanValue2 = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            if (zBooleanValue2) {
                c6021p.m6524S(896828185);
                c6021p.m6524S(-89185910);
                objM10507b = new C7688n();
                c6021p.m6553p(false);
                c6021p.m6553p(false);
            } else {
                if (zBooleanValue2) {
                    c6021p.m6524S(896743350);
                    c6021p.m6553p(false);
                    throw new C0644w();
                }
                c6021p.m6524S(896830202);
                if (Build.VERSION.SDK_INT >= 33) {
                    c6021p.m6524S(2031986893);
                    objM10507b = AbstractC9856b0.m10508c("android.permission.POST_NOTIFICATIONS", null, c6021p, 6, 2);
                    z6 = false;
                    c6021p.m6553p(false);
                } else {
                    z6 = false;
                    c6021p.m6524S(2032086248);
                    objM10507b = AbstractC9856b0.m10507b(c6021p);
                    c6021p.m6553p(false);
                }
                c6021p.m6553p(z6);
            }
            AbstractC8662k3.m9350a(AbstractC10866a.m11313a(interfaceC10459q2, (C4055g1) c13711hM4618d.f43261p0, null), null, 0L, AbstractC8411c.m8969c(1579994724, c6021p, new C4334d(c8870f, 13)), false, AbstractC8411c.m8969c(-1278294871, c6021p, new C2494b(objM10507b, (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a), notificationSettingsViewModel2, interfaceC5985XM9642d, c8870f, 4)), c6021p, 199680, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(interfaceC10459q2, notificationSettingsViewModel2, i10, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9628b(int i10, InterfaceC1426a interfaceC1426a, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        c6021p.m6526U(1420744761);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC3984T1.m4687f(interfaceC10459q, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13380d, null, null, null, AbstractC8411c.m8969c(-621397241, c6021p, new C3323O(1, interfaceC1426a)), c6021p, ((i11 >> 3) & 14) | 196608, 28);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2465M0(interfaceC1426a, interfaceC10459q, i10, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[LOOP:2: B:25:0x004c->B:50:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1 A[LOOP:1: B:56:0x00a5->B:59:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x00b7 A[EDGE_INSN: B:82:0x00b7->B:60:0x00b7 BREAK  A[LOOP:1: B:56:0x00a5->B:59:0x00b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX INFO: renamed from: c */
    public static final InetAddress m9629c(int i10, int i11, String str) {
        int i12;
        ?? r14;
        int i13;
        char cCharAt;
        int i14;
        int i15;
        int i16;
        int iM19427s;
        int i17 = 16;
        byte[] bArr = new byte[16];
        boolean z6 = false;
        int i18 = i10;
        int i19 = 0;
        int i20 = -1;
        int i21 = -1;
        while (true) {
            if (i18 >= i11) {
                i12 = i17;
                break;
            }
            if (i19 == i17) {
                return null;
            }
            int i22 = i18 + 2;
            if (i22 <= i11 && AbstractC21329w.m21733t(i18, str, "::", z6)) {
                if (i20 != -1) {
                    return null;
                }
                i19 += 2;
                if (i22 == i11) {
                    i12 = i17;
                    i20 = i19;
                    break;
                }
                i20 = i19;
                i21 = i22;
                i18 = i21;
                i15 = 0;
                while (i18 < i11) {
                    iM19427s = AbstractC17708b.m19427s(str.charAt(i18));
                    if (iM19427s != -1) {
                        break;
                        break;
                    }
                    i15 = (i15 << 4) + iM19427s;
                    i18++;
                }
                i16 = i18 - i21;
                if (i16 != 0) {
                }
                return null;
            }
            if (i19 != 0) {
                if (!AbstractC21329w.m21733t(i18, str, ":", z6)) {
                    if (AbstractC21329w.m21733t(i18, str, Separators.DOT, z6)) {
                        int i23 = i19 - 2;
                        int i24 = i23;
                        while (i21 < i11) {
                            if (i24 != i17) {
                                if (i24 == i23) {
                                    r14 = z6;
                                    i13 = i21;
                                    while (i13 < i11) {
                                        cCharAt = str.charAt(i13);
                                        if (AbstractC16544l.m18096i(cCharAt, 48) < 0 || AbstractC16544l.m18096i(cCharAt, 57) > 0) {
                                            break;
                                        }
                                        if ((r14 != 0 || i21 == i13) && (i14 = ((r14 * 10) + cCharAt) - 48) <= 255) {
                                            i13++;
                                            r14 = i14;
                                        }
                                    }
                                    if (i13 - i21 == 0) {
                                        bArr[i24] = (byte) r14;
                                        i24++;
                                        i21 = i13;
                                        i17 = 16;
                                        z6 = false;
                                    }
                                } else if (str.charAt(i21) == '.') {
                                    i21++;
                                    r14 = z6;
                                    i13 = i21;
                                    while (i13 < i11) {
                                        cCharAt = str.charAt(i13);
                                        if (AbstractC16544l.m18096i(cCharAt, 48) < 0) {
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                    if (i13 - i21 == 0) {
                                        bArr[i24] = (byte) r14;
                                        i24++;
                                        i21 = i13;
                                        i17 = 16;
                                        z6 = false;
                                    }
                                }
                            }
                        }
                        if (i24 == i19 + 2) {
                            i19 += 2;
                            i12 = 16;
                            break;
                        }
                    }
                    return null;
                }
                i18++;
            }
            i21 = i18;
            i18 = i21;
            i15 = 0;
            while (i18 < i11) {
                iM19427s = AbstractC17708b.m19427s(str.charAt(i18));
                if (iM19427s != -1) {
                    break;
                }
                i15 = (i15 << 4) + iM19427s;
                i18++;
            }
            i16 = i18 - i21;
            if (i16 != 0 || i16 > 4) {
                return null;
            }
            int i25 = i19 + 1;
            bArr[i19] = (byte) ((i15 >>> 8) & 255);
            i19 += 2;
            bArr[i25] = (byte) (i15 & 255);
            i17 = 16;
            z6 = false;
        }
        if (i19 != i12) {
            if (i20 == -1) {
                return null;
            }
            int i26 = i19 - i20;
            System.arraycopy(bArr, i20, bArr, 16 - i26, i26);
            Arrays.fill(bArr, i20, (16 - i19) + i20, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    /* JADX INFO: renamed from: d */
    public static final String m9630d(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        int i10 = 0;
        int i11 = -1;
        if (!AbstractC21322p.m21667A(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                AbstractC16544l.m18093f(ascii, "toASCII(host)");
                Locale US = Locale.US;
                AbstractC16544l.m18093f(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i12 = 0; i12 < length; i12++) {
                    char cCharAt = lowerCase.charAt(i12);
                    if (AbstractC16544l.m18096i(cCharAt, 31) <= 0 || AbstractC16544l.m18096i(cCharAt, 127) >= 0 || AbstractC21322p.m21678L(" #%/:?@[\\]", cCharAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM9629c = (AbstractC21329w.m21734u(str, "[", false) && AbstractC21329w.m21725l(str, "]", false)) ? m9629c(1, str.length() - 1, str) : m9629c(0, str.length(), str);
        if (inetAddressM9629c == null) {
            return null;
        }
        byte[] address = inetAddressM9629c.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressM9629c.getHostAddress();
            }
            throw new AssertionError(AbstractC10763a.m11047e('\'', "Invalid IPv6 address: '", str));
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < address.length) {
            int i15 = i13;
            while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i11 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        C0675i c0675i = new C0675i();
        while (i10 < address.length) {
            if (i10 == i11) {
                c0675i.m1436f1(58);
                i10 += i14;
                if (i10 == 16) {
                    c0675i.m1436f1(58);
                }
            } else {
                if (i10 > 0) {
                    c0675i.m1436f1(58);
                }
                byte b = address[i10];
                byte[] bArr = AbstractC17708b.f56536a;
                c0675i.m1438h1(((b & 255) << 8) | (address[i10 + 1] & 255));
                i10 += 2;
            }
        }
        return c0675i.m1428Z0();
    }
}
