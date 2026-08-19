package p523V9;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.net.Uri;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.conversations.impl.compliance.ComplianceViewModel;
import com.openai.feature.messages.impl.listitem.content.spreadsheet.MessageSpreadsheetViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import ee.AbstractC13371f;
import ee.C13370e;
import ee.C13372g;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p002A0.C0148y;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0155B1;
import p006A4.C0339D;
import p011A9.p012Ra.ahZQMZ;
import p025An.C0644w;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p042Bf.C1275q;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1006s6.C19451a;
import p1006s6.C19452b;
import p1006s6.InterfaceC19456f;
import p1010sf.AbstractC19536b;
import p1057v6.C20462b;
import p1057v6.C20468h;
import p1113xn.AbstractC21322p;
import p1113xn.C21317k;
import p1113xn.C21319m;
import p1155zi.C21920H0;
import p1155zi.C22011h0;
import p124Ei.C2446D;
import p145Ff.AbstractC2725c;
import p145Ff.C2726d;
import p145Ff.C2727e;
import p145Ff.C2728f;
import p145Ff.C2730h;
import p145Ff.EnumC2731i;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3984T1;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p364Oh.AbstractC6224C;
import p364Oh.C6223B;
import p382Pf.C6401d;
import p482Tg.C7445b0;
import p537W0.AbstractC8411c;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9156K;
import p571X9.AbstractC9221V;
import p587Y1.C9588n;
import p594Y9.AbstractC9973t4;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p882m1.AbstractC17140a;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17667a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17662G;
import p959q8.C18639a;
import p991rh.C19003l;

/* JADX INFO: renamed from: V9.p5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8167p5 {
    /* JADX WARN: Code duplicated, block: B:103:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:112:0x020b  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:70:0x015b  */
    /* JADX WARN: Code duplicated, block: B:71:0x015d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0167  */
    /* JADX WARN: Code duplicated, block: B:75:0x016a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0174  */
    /* JADX WARN: Code duplicated, block: B:81:0x0177  */
    /* JADX WARN: Code duplicated, block: B:83:0x017a  */
    /* JADX WARN: Code duplicated, block: B:86:0x017e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0184  */
    /* JADX WARN: Code duplicated, block: B:89:0x018c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0194  */
    /* JADX WARN: Code duplicated, block: B:91:0x019c  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r35v0, types: [O0.p] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: a */
    public static final void m8741a(String str, EnumC2731i enumC2731i, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        InterfaceC10459q interfaceC10459q3;
        Object objM6514H;
        Object obj;
        InterfaceC5985X interfaceC5985X;
        ?? r6;
        ?? r10;
        String str2;
        int iOrdinal;
        Integer numValueOf;
        ?? r11;
        int i14;
        Object objM6514H2;
        InterfaceC10459q interfaceC10459q4;
        int iOrdinal2;
        Integer numValueOf2;
        Object objM6514H3;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(1395010422);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(enumC2731i) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(interfaceC1426a) ? 256 : 128;
        }
        int i15 = i11 & 8;
        if (i15 == 0) {
            if ((i10 & 3072) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 2048 : 1024;
            }
            i13 = i12;
            if ((i13 & 1171) == 1170 || !c6021p.m6562y()) {
                if (i15 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                c6021p.m6524S(-1738053035);
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                if (objM6514H == obj) {
                    objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(-1738050834);
                if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                    iOrdinal2 = enumC2731i.ordinal();
                    if (iOrdinal2 == 0) {
                        numValueOf2 = null;
                    } else if (iOrdinal2 == 1) {
                        numValueOf2 = Integer.valueOf(R.string.file_expired_description);
                    } else if (iOrdinal2 == 2) {
                        numValueOf2 = Integer.valueOf(R.string.file_unavailable_description);
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            throw new C0644w();
                        }
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(R.string.file_error_description);
                    }
                    if (numValueOf2 != null) {
                        int iIntValue = numValueOf2.intValue();
                        c6021p.m6524S(-1404586264);
                        objM6514H3 = c6021p.m6514H();
                        if (objM6514H3 == obj) {
                            objM6514H3 = new C0339D(interfaceC5985X, 8);
                            c6021p.m6537c0(objM6514H3);
                        }
                        c6021p.m6553p(false);
                        AbstractC3984T1.m4682a((InterfaceC1426a) objM6514H3, AbstractC8411c.m8969c(-1271681197, c6021p, new C2728f(interfaceC5985X, 0)), null, null, null, AbstractC2725c.f8368b, AbstractC8411c.m8969c(188725934, c6021p, new C2446D(iIntValue, 1)), null, 0L, 0L, 0L, 0L, 0.0f, null, c6021p, 1769526, 0, 16284);
                        r6 = 0;
                    } else {
                        r6 = 0;
                    }
                } else {
                    r6 = 0;
                }
                c6021p.m6553p(r6);
                if (enumC2731i == EnumC2731i.f8385Z) {
                    r10 = 1;
                } else {
                    r10 = r6;
                }
                AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.ic_spreadsheet, c6021p, r6);
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                iOrdinal = enumC2731i.ordinal();
                if (iOrdinal == 0) {
                    numValueOf = null;
                } else if (iOrdinal == 1) {
                    numValueOf = Integer.valueOf(R.string.file_expired);
                } else if (iOrdinal == 2) {
                    numValueOf = Integer.valueOf(R.string.file_unavailable);
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new C0644w();
                    }
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.file_error);
                }
                c6021p.m6524S(-1738004147);
                String strM8676d = numValueOf != null ? AbstractC8142m4.m8676d(numValueOf.intValue(), c6021p) : null;
                c6021p.m6553p(r6);
                c6021p.m6524S(-1738002540);
                if ((i13 & 112) == 32) {
                    r11 = 1;
                } else {
                    r11 = r6;
                }
                i14 = ((i13 & 896) != 256 ? r6 : 1) | r11;
                objM6514H2 = c6021p.m6514H();
                if (i14 == 0 || objM6514H2 == obj) {
                    objM6514H2 = new C0155B1(enumC2731i, interfaceC1426a, interfaceC5985X, 14);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(r6);
                AbstractC19536b.m20624a(r10, abstractC17140aM8631b, str2, strM8676d, (InterfaceC1426a) objM6514H2, interfaceC10459q3, 0L, 0L, c6021p, (i13 << 6) & 458752, 192);
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1275q((Object) str, (Object) enumC2731i, (Object) interfaceC1426a, interfaceC10459q4, i10, i11, 1);
            }
        }
        i12 |= 3072;
        interfaceC10459q2 = interfaceC10459q;
        i13 = i12;
        if ((i13 & 1171) == 1170) {
            if (i15 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c6021p.m6524S(-1738053035);
            objM6514H = c6021p.m6514H();
            obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(-1738050834);
            if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                r6 = 0;
            } else {
                iOrdinal2 = enumC2731i.ordinal();
                if (iOrdinal2 == 0) {
                    numValueOf2 = null;
                } else if (iOrdinal2 == 1) {
                    numValueOf2 = Integer.valueOf(R.string.file_expired_description);
                } else if (iOrdinal2 == 2) {
                    numValueOf2 = Integer.valueOf(R.string.file_unavailable_description);
                } else if (iOrdinal2 != 3) {
                    if (iOrdinal2 != 4) {
                        throw new C0644w();
                    }
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(R.string.file_error_description);
                }
                if (numValueOf2 != null) {
                    int iIntValue2 = numValueOf2.intValue();
                    c6021p.m6524S(-1404586264);
                    objM6514H3 = c6021p.m6514H();
                    if (objM6514H3 == obj) {
                        objM6514H3 = new C0339D(interfaceC5985X, 8);
                        c6021p.m6537c0(objM6514H3);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4682a((InterfaceC1426a) objM6514H3, AbstractC8411c.m8969c(-1271681197, c6021p, new C2728f(interfaceC5985X, 0)), null, null, null, AbstractC2725c.f8368b, AbstractC8411c.m8969c(188725934, c6021p, new C2446D(iIntValue2, 1)), null, 0L, 0L, 0L, 0L, 0.0f, null, c6021p, 1769526, 0, 16284);
                    r6 = 0;
                } else {
                    r6 = 0;
                }
            }
            c6021p.m6553p(r6);
            if (enumC2731i == EnumC2731i.f8385Z) {
                r10 = 1;
            } else {
                r10 = r6;
            }
            AbstractC17140a abstractC17140aM8631b2 = AbstractC8126k4.m8631b(R.drawable.ic_spreadsheet, c6021p, r6);
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            iOrdinal = enumC2731i.ordinal();
            if (iOrdinal == 0) {
                numValueOf = null;
            } else if (iOrdinal == 1) {
                numValueOf = Integer.valueOf(R.string.file_expired);
            } else if (iOrdinal == 2) {
                numValueOf = Integer.valueOf(R.string.file_unavailable);
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new C0644w();
                }
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(R.string.file_error);
            }
            c6021p.m6524S(-1738004147);
            if (numValueOf != null) {
            }
            c6021p.m6553p(r6);
            c6021p.m6524S(-1738002540);
            if ((i13 & 112) == 32) {
                r11 = 1;
            } else {
                r11 = r6;
            }
            i14 = ((i13 & 896) != 256 ? r6 : 1) | r11;
            objM6514H2 = c6021p.m6514H();
            if (i14 == 0) {
                objM6514H2 = new C0155B1(enumC2731i, interfaceC1426a, interfaceC5985X, 14);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C0155B1(enumC2731i, interfaceC1426a, interfaceC5985X, 14);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(r6);
            AbstractC19536b.m20624a(r10, abstractC17140aM8631b2, str2, strM8676d, (InterfaceC1426a) objM6514H2, interfaceC10459q3, 0L, 0L, c6021p, (i13 << 6) & 458752, 192);
            interfaceC10459q4 = interfaceC10459q3;
        } else {
            if (i15 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c6021p.m6524S(-1738053035);
            objM6514H = c6021p.m6514H();
            obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(-1738050834);
            if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                r6 = 0;
            } else {
                iOrdinal2 = enumC2731i.ordinal();
                if (iOrdinal2 == 0) {
                    numValueOf2 = null;
                } else if (iOrdinal2 == 1) {
                    numValueOf2 = Integer.valueOf(R.string.file_expired_description);
                } else if (iOrdinal2 == 2) {
                    numValueOf2 = Integer.valueOf(R.string.file_unavailable_description);
                } else if (iOrdinal2 != 3) {
                    if (iOrdinal2 != 4) {
                        throw new C0644w();
                    }
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(R.string.file_error_description);
                }
                if (numValueOf2 != null) {
                    int iIntValue3 = numValueOf2.intValue();
                    c6021p.m6524S(-1404586264);
                    objM6514H3 = c6021p.m6514H();
                    if (objM6514H3 == obj) {
                        objM6514H3 = new C0339D(interfaceC5985X, 8);
                        c6021p.m6537c0(objM6514H3);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4682a((InterfaceC1426a) objM6514H3, AbstractC8411c.m8969c(-1271681197, c6021p, new C2728f(interfaceC5985X, 0)), null, null, null, AbstractC2725c.f8368b, AbstractC8411c.m8969c(188725934, c6021p, new C2446D(iIntValue3, 1)), null, 0L, 0L, 0L, 0L, 0.0f, null, c6021p, 1769526, 0, 16284);
                    r6 = 0;
                } else {
                    r6 = 0;
                }
            }
            c6021p.m6553p(r6);
            if (enumC2731i == EnumC2731i.f8385Z) {
                r10 = 1;
            } else {
                r10 = r6;
            }
            AbstractC17140a abstractC17140aM8631b3 = AbstractC8126k4.m8631b(R.drawable.ic_spreadsheet, c6021p, r6);
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            iOrdinal = enumC2731i.ordinal();
            if (iOrdinal == 0) {
                numValueOf = null;
            } else if (iOrdinal == 1) {
                numValueOf = Integer.valueOf(R.string.file_expired);
            } else if (iOrdinal == 2) {
                numValueOf = Integer.valueOf(R.string.file_unavailable);
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new C0644w();
                }
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(R.string.file_error);
            }
            c6021p.m6524S(-1738004147);
            if (numValueOf != null) {
            }
            c6021p.m6553p(r6);
            c6021p.m6524S(-1738002540);
            if ((i13 & 112) == 32) {
                r11 = 1;
            } else {
                r11 = r6;
            }
            i14 = ((i13 & 896) != 256 ? r6 : 1) | r11;
            objM6514H2 = c6021p.m6514H();
            if (i14 == 0) {
                objM6514H2 = new C0155B1(enumC2731i, interfaceC1426a, interfaceC5985X, 14);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C0155B1(enumC2731i, interfaceC1426a, interfaceC5985X, 14);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(r6);
            AbstractC19536b.m20624a(r10, abstractC17140aM8631b3, str2, strM8676d, (InterfaceC1426a) objM6514H2, interfaceC10459q3, 0L, 0L, c6021p, (i13 << 6) & 458752, 192);
            interfaceC10459q4 = interfaceC10459q3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1275q((Object) str, (Object) enumC2731i, (Object) interfaceC1426a, interfaceC10459q4, i10, i11, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8743c(InterfaceC10459q interfaceC10459q, ComplianceViewModel complianceViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        ComplianceViewModel complianceViewModel2;
        c6021p.m6526U(1943823274);
        int i11 = i10 | 6;
        if ((i10 & 48) == 0) {
            i11 = i10 | 22;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            complianceViewModel2 = complianceViewModel;
        } else {
            c6021p.m6519N();
            int i12 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i12 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), AbstractC13371f.class));
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
                Object objMo5693b = c16527d.mo5693b(ComplianceViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(AbstractC13371f.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(AbstractC13371f.class), c16527d.mo5693b(ComplianceViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ComplianceViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                interfaceC10459q2 = c10456n;
                complianceViewModel2 = (ComplianceViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                complianceViewModel2 = complianceViewModel;
            }
            c6021p.m6554q();
            AbstractC13371f abstractC13371f = (AbstractC13371f) AbstractC9112C3.m9642d(complianceViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(649540926);
            boolean zM6542f2 = c6021p.m6542f(complianceViewModel2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C7445b0(1, complianceViewModel2, ComplianceViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 16);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H2;
            c6021p.m6553p(false);
            if (abstractC13371f instanceof C13370e) {
                AbstractC9973t4.m10617b(C13372g.f42411Y, new C9588n(false, false, true), AbstractC8411c.m8969c(-1067710024, c6021p, new C0148y(interfaceC10459q2, (C13370e) abstractC13371f, interfaceC3759g, 22)), c6021p, 438, 0);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(interfaceC10459q2, complianceViewModel2, i10, 14);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C20468h m8744d(String key, String jsonFieldSource) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(jsonFieldSource, "jsonFieldSource");
        C0675i c0675i = new C0675i();
        C0678l c0678l = C0678l.f1971p0;
        c0675i.m1432c1(C18639a.m19996n(jsonFieldSource));
        Object objM8745e = m8745e(AbstractC7841A0.m8091c(new C19452b(c0675i)));
        Map map = objM8745e instanceof Map ? (Map) objM8745e : null;
        if (map != null) {
            return new C20468h(key, map, null);
        }
        throw new IllegalStateException("error deserializing: ".concat(jsonFieldSource).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [v6.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public static Object m8745e(Object obj) {
        ?? arrayList;
        if (obj instanceof String) {
            C21319m c21319m = C20462b.f64954b;
            String value = (String) obj;
            AbstractC16544l.m18094g(value, "value");
            C21319m c21319m2 = C20462b.f64954b;
            if (!c21319m2.m21664d(value)) {
                return obj;
            }
            C21317k c21317kM21663c = c21319m2.m21663c(value);
            List listM21657a = c21317kM21663c != null ? c21317kM21663c.m21657a() : null;
            if (listM21657a == null || ((AbstractC17667a) listM21657a).mo1316f() <= 1) {
                throw new IllegalArgumentException(AbstractC10763a.m11054l("Not a cache reference: ", value, " Must be of the form: ApolloCacheReference{%s}").toString());
            }
            arrayList = new C20462b((String) ((C17662G) listM21657a).get(1));
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            arrayList = new LinkedHashMap(AbstractC17660E.m19257b(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                arrayList.put(entry.getKey(), m8745e(entry.getValue()));
            }
        } else {
            if (!(obj instanceof List)) {
                return obj;
            }
            Iterable iterable = (Iterable) obj;
            arrayList = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(m8745e(it.next()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static String m8746f(C20468h record) throws Throwable {
        AbstractC16544l.m18094g(record, "record");
        Map map = record.f64973Z;
        C0675i c0675i = new C0675i();
        Throwable th2 = null;
        C19451a c19451a = new C19451a(c0675i, null);
        try {
            c19451a.mo20554o();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                c19451a.mo20545M0(str);
                m8747g(c19451a, value);
            }
            c19451a.mo20551j();
            try {
                c19451a.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            try {
                c19451a.close();
            } catch (Throwable th5) {
                AbstractC9221V.m9789a(th4, th5);
            }
            th2 = th4;
        }
        if (th2 == null) {
            return c0675i.m1428Z0();
        }
        throw th2;
    }

    /* JADX INFO: renamed from: g */
    public static void m8747g(InterfaceC19456f interfaceC19456f, Object obj) {
        if (obj == null) {
            interfaceC19456f.mo20543I0();
            return;
        }
        if (obj instanceof String) {
            interfaceC19456f.mo20544L((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            interfaceC19456f.mo20548X(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            interfaceC19456f.mo20540C(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            interfaceC19456f.mo20539B(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            interfaceC19456f.mo20542F(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof C20462b) {
            interfaceC19456f.mo20544L("ApolloCacheReference{" + ((C20462b) obj).f64956a + '}');
            return;
        }
        if (obj instanceof List) {
            interfaceC19456f.mo20556q();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                m8747g(interfaceC19456f, it.next());
            }
            interfaceC19456f.mo20555p();
            return;
        }
        if (!(obj instanceof Map)) {
            throw new IllegalStateException(("Unsupported record value type: '" + obj + '\'').toString());
        }
        interfaceC19456f.mo20554o();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            m8747g(interfaceC19456f.mo20545M0((String) entry.getKey()), entry.getValue());
        }
        interfaceC19456f.mo20551j();
    }

    /* JADX INFO: renamed from: b */
    public static final void m8742b(String str, String str2, InterfaceC10459q interfaceC10459q, MessageSpreadsheetViewModel messageSpreadsheetViewModel, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        boolean z6;
        int i12;
        MessageSpreadsheetViewModel messageSpreadsheetViewModel2;
        String queryParameter;
        String str3;
        C19003l c19003l;
        MessageSpreadsheetViewModel messageSpreadsheetViewModel3;
        AbstractC16544l.m18094g(str2, ahZQMZ.YRfNoiKFj);
        c6021p.m6526U(1680909532);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            messageSpreadsheetViewModel3 = messageSpreadsheetViewModel;
        } else {
            c6021p.m6519N();
            int i13 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i13 == 0 || c6021p.m6561x()) {
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C2730h.class));
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
                Object objMo5693b = c16527d.mo5693b(MessageSpreadsheetViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C2730h.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    z6 = true;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C2730h.class), c16527d.mo5693b(MessageSpreadsheetViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageSpreadsheetViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    z6 = true;
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i12 = i11 & (-7169);
                messageSpreadsheetViewModel2 = (MessageSpreadsheetViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i12 = i11 & (-7169);
                messageSpreadsheetViewModel2 = messageSpreadsheetViewModel;
                z6 = true;
            }
            c6021p.m6554q();
            if (str == null) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C2726d(str, str2, interfaceC10459q, messageSpreadsheetViewModel2, i10, 0);
                    return;
                }
                return;
            }
            Object obj2 = ((C8870f) c6021p.m6548k(AbstractC8873i.f27157a)).f27149b;
            c6021p.m6524S(-1738093708);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                objM6514H2 = C5997d.m6430Q(null, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H2;
            Object objM530s = AbstractC0168G.m530s(-1738091678, c6021p, false);
            if (objM530s == obj) {
                objM530s = C5997d.m6421H(new C0339D(interfaceC5985X, 10));
                c6021p.m6537c0(objM530s);
            }
            InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) objM530s;
            c6021p.m6553p(false);
            Locale localeM8334g = AbstractC8012V5.m8334g((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b));
            Object obj3 = (EnumC2731i) interfaceC5982V0.getValue();
            c6021p.m6524S(-1738086738);
            boolean zM6542f2 = c6021p.m6542f(obj3);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == obj) {
                AbstractC6224C abstractC6224C = (AbstractC6224C) interfaceC5985X.getValue();
                C6223B c6223b = abstractC6224C instanceof C6223B ? (C6223B) abstractC6224C : null;
                String str4 = (c6223b == null || (c19003l = (C19003l) c6223b.f20258a) == null) ? null : c19003l.f60582b;
                if (str4 == null) {
                    str4 = "";
                }
                Object objM9706b = (AbstractC21322p.m21681O(str4) || (queryParameter = Uri.parse(URLDecoder.decode(str4, "UTF-8")).getQueryParameter("rscd")) == null || (str3 = (String) AbstractC17680n.m19353c0(AbstractC21322p.m21697e0(queryParameter, new String[]{"filename="}, 0, 6))) == null) ? null : AbstractC9156K.m9706b(str3, localeM8334g);
                c6021p.m6537c0(objM9706b);
                objM6514H3 = objM9706b;
            }
            String str5 = (String) objM6514H3;
            c6021p.m6553p(false);
            C21920H0 c21920h0 = new C21920H0(str2);
            c6021p.m6524S(-1738074949);
            int i14 = i12 & 112;
            boolean zM6542f3 = c6021p.m6542f(messageSpreadsheetViewModel2) | (i14 == 32 ? z6 : false);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f3 || objM6514H4 == obj) {
                objM6514H4 = new C2727e(messageSpreadsheetViewModel2, str2, interfaceC5985X, null);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, c21920h0);
            EnumC2731i enumC2731i = (EnumC2731i) interfaceC5982V0.getValue();
            c6021p.m6524S(-1738068437);
            boolean zM6545h = c6021p.m6545h(obj2) | ((i12 & 14) == 4 ? z6 : false) | (i14 == 32 ? z6 : false);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6545h || objM6514H5 == obj) {
                objM6514H5 = new C0155B1(obj2, str, str2, 13);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            m8741a(str5, enumC2731i, (InterfaceC1426a) objM6514H5, interfaceC10459q, c6021p, (i12 << 3) & 7168, 0);
            messageSpreadsheetViewModel3 = messageSpreadsheetViewModel2;
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C2726d(str, str2, interfaceC10459q, messageSpreadsheetViewModel3, i10, 1);
        }
    }
}
