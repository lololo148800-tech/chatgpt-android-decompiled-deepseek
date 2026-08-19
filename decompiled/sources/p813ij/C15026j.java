package p813ij;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View;
import ao.C11145T;
import ao.C11172k;
import ao.C11184q;
import ao.InterfaceC11173k0;
import com.auth0.android.request.internal.AbstractC11847f;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11918V1;
import com.google.android.gms.internal.play_billing.C11924X1;
import com.google.android.gms.internal.play_billing.C11938b2;
import com.google.android.gms.internal.play_billing.C11950e2;
import com.google.android.gms.internal.play_billing.C11954f2;
import com.google.android.gms.internal.play_billing.C11982m2;
import com.google.android.gms.internal.play_billing.C11986n2;
import com.google.android.gms.internal.play_billing.C11998q2;
import com.google.android.gms.internal.play_billing.C12002r2;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import fj.InterfaceC13670b;
import fo.C13711h;
import io.sentry.C15150O1;
import io.sentry.InterfaceC15127H;
import io.sentry.hints.C15370i;
import java.lang.ref.SoftReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17296C;
import p001A.C0004C;
import p001A.C0006D;
import p001A.C0018J;
import p001A.C0087s0;
import p001A.C0095w0;
import p001A.RunnableC0074m;
import p028B.C0694a;
import p028B.C0709p;
import p049Bm.InterfaceC1436k;
import p084D4.C1945v0;
import p1016t3.C19755E;
import p1032u4.AbstractC20114h;
import p1032u4.AbstractC20115i;
import p1032u4.C20107a;
import p1032u4.C20108b;
import p1032u4.C20109c;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20801c;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1073w3.InterfaceC20802d;
import p1091wn.AbstractC21031l;
import p1091wn.C21036q;
import p115E9.C2360b;
import p178H.C3141e;
import p204I1.C3581L;
import p204I1.C3590f;
import p225Im.InterfaceC3756d;
import p228J.AbstractC3810L;
import p228J.C3809K;
import p228J.C3865u0;
import p228J.InterfaceC3861s0;
import p239Ja.C4312o;
import p277L.ExecutorC4836i;
import p277L.ScheduledExecutorServiceC4831d;
import p292Lg.C5034f;
import p301M.InterfaceC5221c;
import p350O1.C6045C;
import p350O1.C6061j;
import p350O1.InterfaceC6060i;
import p425Ra.C6836i;
import p479Td.AbstractC7360k;
import p522V8.C7836c;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8138m0;
import p543W8.C8440a;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8577W2;
import p544W9.AbstractC8644h3;
import p544W9.AbstractC8676n;
import p547Wc.AbstractC8757A;
import p572Xa.C9418l;
import p572Xa.C9427u;
import p572Xa.InterfaceC9419m;
import p593Y8.C9691r;
import p644ab.AbstractC10531d;
import p658b5.C11234e;
import p769gj.C14172n;
import p775h2.AbstractC14376f;
import p791hj.C14518a;
import p791hj.C14522e;
import p817j$.util.DesugarCollections;
import p826j6.InterfaceC16143L;
import p861l1.xapn.suYVq;
import p885m4.C17162l;
import p885m4.InterfaceC17157g;
import p885m4.InterfaceC17163m;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17691y;
import p959q8.C18639a;

/* JADX INFO: renamed from: ij.j */
/* JADX INFO: loaded from: classes3.dex */
public class C15026j implements InterfaceC5221c, InterfaceC9419m, InterfaceC11173k0, InterfaceC16143L, InterfaceC17163m {

    /* JADX INFO: renamed from: Y */
    public Object f46724Y;

    /* JADX INFO: renamed from: Z */
    public Object f46725Z;

    public /* synthetic */ C15026j(Object obj, Object obj2) {
        this.f46724Y = obj;
        this.f46725Z = obj2;
    }

    @Override // p301M.InterfaceC5221c
    /* JADX INFO: renamed from: J */
    public void mo3912J(Throwable th2) {
        C3865u0 c3865u0 = null;
        if (!(th2 instanceof C3809K)) {
            if (th2 instanceof CancellationException) {
                ((C0018J) this.f46725Z).m126v("Unable to configure camera cancelled", null);
                return;
            }
            if (((C0018J) this.f46725Z).f89T0 == 9) {
                ((C0018J) this.f46725Z).m98H(9, new C3141e(4, th2), true);
            }
            AbstractC8072d6.m8488e("Camera2CameraImpl", "Unable to configure camera " + ((C0018J) this.f46725Z), th2);
            C0018J c0018j = (C0018J) this.f46725Z;
            if (c0018j.f101x0 == ((C0087s0) this.f46724Y)) {
                c0018j.m96F();
                return;
            }
            return;
        }
        C0018J c0018j2 = (C0018J) this.f46725Z;
        AbstractC3810L abstractC3810L = ((C3809K) th2).f11521Y;
        for (C3865u0 c3865u1 : c0018j2.f90Y.m21927n()) {
            if (c3865u1.m4591b().contains(abstractC3810L)) {
                c3865u0 = c3865u1;
                break;
            }
        }
        if (c3865u0 != null) {
            C0018J c0018j3 = (C0018J) this.f46725Z;
            c0018j3.getClass();
            ScheduledExecutorServiceC4831d scheduledExecutorServiceC4831dM9243e = AbstractC8577W2.m9243e();
            InterfaceC3861s0 interfaceC3861s0 = c3865u0.f11682f;
            if (interfaceC3861s0 != null) {
                c0018j3.m126v("Posting surface closed", new Throwable());
                scheduledExecutorServiceC4831dM9243e.execute(new RunnableC0074m(interfaceC3861s0, 6, c3865u0));
            }
        }
    }

    @Override // ao.InterfaceC11173k0
    /* JADX INFO: renamed from: a */
    public KSerializer mo12393a(InterfaceC3756d interfaceC3756d) {
        Object obj = ((C11184q) this.f46725Z).get(AbstractC8138m0.m8667b(interfaceC3756d));
        AbstractC16544l.m18093f(obj, "get(...)");
        C11145T c11145t = (C11145T) obj;
        Object c11172k = c11145t.f33782a.get();
        if (c11172k == null) {
            synchronized (c11145t) {
                c11172k = c11145t.f33782a.get();
                if (c11172k == null) {
                    c11172k = new C11172k((KSerializer) ((InterfaceC1436k) this.f46724Y).invoke(interfaceC3756d));
                    c11145t.f33782a = new SoftReference(c11172k);
                }
            }
        }
        return ((C11172k) c11172k).f33817a;
    }

    /* JADX INFO: renamed from: b */
    public C6045C m16144b(List list) {
        InterfaceC6060i interfaceC6060i;
        Exception e10;
        try {
            int size = list.size();
            int i10 = 0;
            interfaceC6060i = null;
            while (i10 < size) {
                try {
                    InterfaceC6060i interfaceC6060i2 = (InterfaceC6060i) list.get(i10);
                    try {
                        interfaceC6060i2.mo6611a((C6061j) this.f46725Z);
                        i10++;
                        interfaceC6060i = interfaceC6060i2;
                    } catch (Exception e11) {
                        e10 = e11;
                        interfaceC6060i = interfaceC6060i2;
                        StringBuilder sb2 = new StringBuilder();
                        StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb3.append(((C4312o) ((C6061j) this.f46725Z).f19748r0).m5100s());
                        sb3.append(", composition=");
                        sb3.append(((C6061j) this.f46725Z).m6632f());
                        sb3.append(", selection=");
                        C6061j c6061j = (C6061j) this.f46725Z;
                        sb3.append((Object) C3581L.m4272h(AbstractC8676n.m9365b(c6061j.f19744Z, c6061j.f19745o0)));
                        sb3.append("):");
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        AbstractC17680n.m19347W(list, sb2, Separators.RETURN, (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, -1, "...", (124 & 64) != 0 ? null : new C5034f(interfaceC6060i, 12, this));
                        String string = sb2.toString();
                        AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
                        throw new RuntimeException(string, e10);
                    }
                } catch (Exception e12) {
                    e10 = e12;
                }
            }
            C6061j c6061j2 = (C6061j) this.f46725Z;
            c6061j2.getClass();
            C3590f c3590f = new C3590f(6, ((C4312o) c6061j2.f19748r0).toString(), null);
            C6061j c6061j3 = (C6061j) this.f46725Z;
            long jM9365b = AbstractC8676n.m9365b(c6061j3.f19744Z, c6061j3.f19745o0);
            C3581L c3581l = C3581L.m4271g(((C6045C) this.f46724Y).f19683b) ? null : new C3581L(jM9365b);
            C6045C c6045c = new C6045C(c3590f, c3581l != null ? c3581l.f10908a : AbstractC8676n.m9365b(C3581L.m4269e(jM9365b), C3581L.m4270f(jM9365b)), ((C6061j) this.f46725Z).m6632f());
            this.f46724Y = c6045c;
            return c6045c;
        } catch (Exception e13) {
            interfaceC6060i = null;
            e10 = e13;
        }
    }

    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void mo3514c() {
    }

    @Override // p572Xa.InterfaceC9420n
    /* JADX INFO: renamed from: d */
    public Object mo3447d() {
        return new C6836i(((C2360b) this.f46724Y).f7317Y, (C9427u) ((C9418l) this.f46725Z).mo3447d(), new C18639a(15));
    }

    /* JADX INFO: renamed from: e */
    public void m16145e() {
        int[] iArr = (int[]) this.f46724Y;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f46725Z = null;
    }

    /* JADX INFO: renamed from: f */
    public void m16146f(int i10) {
        int[] iArr = (int[]) this.f46724Y;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i10, 10) + 1];
            this.f46724Y = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i10 >= iArr.length) {
            int length = iArr.length;
            while (length <= i10) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f46724Y = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f46724Y;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: g */
    public CameraCharacteristics mo1483g(String str) throws C0694a {
        try {
            return ((CameraManager) this.f46724Y).getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw new C0694a(e10);
        }
    }

    /* JADX INFO: renamed from: h */
    public Set mo1487h() {
        return Collections.emptySet();
    }

    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: i */
    public /* synthetic */ InterfaceC17157g mo3516i(byte[] bArr, int i10, int i11) {
        return AbstractC14376f.m15838d(this, bArr, i11);
    }

    /* JADX INFO: renamed from: j */
    public void m16147j(int i10, int i11) {
        int[] iArr = (int[]) this.f46724Y;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        m16146f(i12);
        int[] iArr2 = (int[]) this.f46724Y;
        System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
        Arrays.fill((int[]) this.f46724Y, i10, i12, -1);
        ArrayList arrayList = (ArrayList) this.f46725Z;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1945v0 c1945v0 = (C1945v0) ((ArrayList) this.f46725Z).get(size);
            int i13 = c1945v0.f5748Y;
            if (i13 >= i10) {
                c1945v0.f5748Y = i13 + i11;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m16148k(int i10, int i11) {
        int[] iArr = (int[]) this.f46724Y;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        m16146f(i12);
        int[] iArr2 = (int[]) this.f46724Y;
        System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
        int[] iArr3 = (int[]) this.f46724Y;
        Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f46725Z;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1945v0 c1945v0 = (C1945v0) ((ArrayList) this.f46725Z).get(size);
            int i13 = c1945v0.f5748Y;
            if (i13 >= i10) {
                if (i13 < i12) {
                    ((ArrayList) this.f46725Z).remove(size);
                } else {
                    c1945v0.f5748Y = i13 - i11;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo1484l(String str, ExecutorC4836i executorC4836i, CameraDevice.StateCallback stateCallback) {
        executorC4836i.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.f46724Y).openCamera(str, new C0004C(executorC4836i, stateCallback), (Handler) ((C11234e) this.f46725Z).f34002o0);
        } catch (CameraAccessException e10) {
            throw new C0694a(e10);
        }
    }

    /* JADX INFO: renamed from: m */
    public C15150O1 m16149m() {
        return (C15150O1) ((LinkedBlockingDeque) this.f46724Y).peek();
    }

    /* JADX INFO: renamed from: n */
    public void m16150n(InterfaceC13670b interfaceC13670b) {
        if (interfaceC13670b.mo15160a() != null) {
            throw new IllegalArgumentException("Expected node to not be linked.");
        }
        InterfaceC13670b interfaceC13670b2 = (InterfaceC13670b) this.f46725Z;
        if (interfaceC13670b2 != null) {
            this.f46725Z = interfaceC13670b;
            interfaceC13670b2.mo15161b(interfaceC13670b);
        } else {
            if (((InterfaceC13670b) this.f46724Y) != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f46724Y = interfaceC13670b;
            this.f46725Z = interfaceC13670b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0251  */
    /* JADX WARN: Code duplicated, block: B:130:0x025d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0266  */
    /* JADX WARN: Code duplicated, block: B:133:0x026f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0277  */
    /* JADX WARN: Code duplicated, block: B:137:0x027f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0283  */
    /* JADX WARN: Code duplicated, block: B:140:0x028b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0290  */
    /* JADX WARN: Code duplicated, block: B:143:0x0298  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:155:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:158:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:161:0x02db  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:168:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:169:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:171:0x0304  */
    /* JADX WARN: Code duplicated, block: B:173:0x0314  */
    /* JADX WARN: Code duplicated, block: B:174:0x032c  */
    /* JADX WARN: Code duplicated, block: B:175:0x032e  */
    /* JADX WARN: Code duplicated, block: B:178:0x033f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0348  */
    /* JADX WARN: Code duplicated, block: B:182:0x034a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0353  */
    /* JADX WARN: Code duplicated, block: B:186:0x0355  */
    /* JADX WARN: Code duplicated, block: B:189:0x035e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0368  */
    /* JADX WARN: Code duplicated, block: B:194:0x036d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0372  */
    /* JADX WARN: Code duplicated, block: B:197:0x0385  */
    /* JADX WARN: Code duplicated, block: B:238:0x0362 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:173:0x0314, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    @Override // p885m4.InterfaceC17163m
    /* JADX INFO: renamed from: o */
    public void mo3519o(byte[] bArr, int i10, int i11, C17162l c17162l, InterfaceC20802d interfaceC20802d) {
        char c9;
        int i12;
        C20109c c20109cM20954d;
        String strTrim;
        int i13;
        String string;
        int i14;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z6;
        C15026j c15026j = this;
        char c10 = 2;
        boolean z10 = false;
        int i15 = -1;
        int i16 = 1;
        C20811m c20811m = (C20811m) c15026j.f46724Y;
        c20811m.m21342D(i10 + i11, bArr);
        c20811m.m21344F(i10);
        ArrayList arrayList = new ArrayList();
        try {
            AbstractC20115i.m20960c(c20811m);
            while (!TextUtils.isEmpty(c20811m.m21353h(AbstractC10531d.f31242c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i17 = z10 ? 1 : 0;
                int i18 = i15;
                while (i18 == i15) {
                    i17 = c20811m.f66093b;
                    String strM21353h = c20811m.m21353h(AbstractC10531d.f31242c);
                    if (strM21353h == null) {
                        i18 = z10 ? 1 : 0;
                    } else if ("STYLE".equals(strM21353h)) {
                        i18 = c10;
                    } else {
                        i18 = strM21353h.startsWith("NOTE") ? i16 : 3;
                    }
                }
                c20811m.m21344F(i17);
                if (i18 == 0) {
                    AbstractC8757A.m9527h(new C13711h(arrayList2), c17162l, interfaceC20802d);
                    return;
                }
                if (i18 == i16) {
                    while (!TextUtils.isEmpty(c20811m.m21353h(AbstractC10531d.f31242c))) {
                    }
                } else {
                    String str = null;
                    if (i18 != c10) {
                        c9 = c10;
                        i12 = i16;
                        if (i18 == 3) {
                            Pattern pattern = AbstractC20114h.f63734a;
                            Charset charset = AbstractC10531d.f31242c;
                            String strM21353h2 = c20811m.m21353h(charset);
                            if (strM21353h2 == null) {
                                c20109cM20954d = null;
                            } else {
                                Pattern pattern2 = AbstractC20114h.f63734a;
                                Matcher matcher2 = pattern2.matcher(strM21353h2);
                                if (matcher2.matches()) {
                                    c20109cM20954d = AbstractC20114h.m20954d(null, matcher2, c20811m, arrayList);
                                } else {
                                    c20109cM20954d = null;
                                    String strM21353h3 = c20811m.m21353h(charset);
                                    if (strM21353h3 != null) {
                                        Matcher matcher3 = pattern2.matcher(strM21353h3);
                                        if (matcher3.matches()) {
                                            c20109cM20954d = AbstractC20114h.m20954d(strM21353h2.trim(), matcher3, c20811m, arrayList);
                                        }
                                    }
                                }
                            }
                            if (c20109cM20954d != null) {
                                arrayList2.add(c20109cM20954d);
                            }
                        }
                    } else {
                        if (!arrayList2.isEmpty()) {
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                        c20811m.m21353h(AbstractC10531d.f31242c);
                        C20107a c20107a = (C20107a) c15026j.f46725Z;
                        StringBuilder sb2 = c20107a.f63694b;
                        sb2.setLength(z10 ? 1 : 0);
                        int i19 = c20811m.f66093b;
                        while (!TextUtils.isEmpty(c20811m.m21353h(AbstractC10531d.f31242c))) {
                        }
                        byte[] bArr2 = c20811m.f66092a;
                        int i20 = c20811m.f66093b;
                        C20811m c20811m2 = c20107a.f63693a;
                        c20811m2.m21342D(i20, bArr2);
                        c20811m2.m21344F(i19);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            C20107a.m20948c(c20811m2);
                            if (c20811m2.m21346a() >= 5 && "::cue".equals(c20811m2.m21363r(5, AbstractC10531d.f31242c))) {
                                int i21 = c20811m2.f66093b;
                                String strM20947b = C20107a.m20947b(c20811m2, sb2);
                                if (strM20947b == null) {
                                    strTrim = str;
                                } else if ("{".equals(strM20947b)) {
                                    c20811m2.m21344F(i21);
                                    strTrim = "";
                                } else {
                                    if (Separators.LPAREN.equals(strM20947b)) {
                                        int i22 = c20811m2.f66093b;
                                        int i23 = c20811m2.f66094c;
                                        int i24 = z10 ? 1 : 0;
                                        while (i22 < i23 && i24 == 0) {
                                            int i25 = i22 + 1;
                                            i24 = ((char) c20811m2.f66092a[i22]) == ')' ? i16 : z10 ? 1 : 0;
                                            i22 = i25;
                                        }
                                        strTrim = c20811m2.m21363r((i22 + i15) - c20811m2.f66093b, AbstractC10531d.f31242c).trim();
                                    } else {
                                        strTrim = str;
                                    }
                                    if (!Separators.RPAREN.equals(C20107a.m20947b(c20811m2, sb2))) {
                                        strTrim = str;
                                    }
                                }
                            } else {
                                strTrim = str;
                            }
                            if (strTrim != null && "{".equals(C20107a.m20947b(c20811m2, sb2))) {
                                C20108b c20108b = new C20108b();
                                c20108b.f63695a = "";
                                c20108b.f63696b = "";
                                c20108b.f63697c = Collections.emptySet();
                                c20108b.f63698d = "";
                                c20108b.f63699e = str;
                                c20108b.f63701g = z10;
                                c20108b.f63703i = z10;
                                c20108b.f63704j = i15;
                                c20108b.f63705k = i15;
                                c20108b.f63706l = i15;
                                c20108b.f63707m = i15;
                                c20108b.f63709o = i15;
                                c20108b.f63710p = z10;
                                if (!"".equals(strTrim)) {
                                    int iIndexOf = strTrim.indexOf(91);
                                    if (iIndexOf != i15) {
                                        Matcher matcher4 = C20107a.f63691c.matcher(strTrim.substring(iIndexOf));
                                        if (matcher4.matches()) {
                                            String strGroup2 = matcher4.group(i16);
                                            strGroup2.getClass();
                                            c20108b.f63698d = strGroup2;
                                        }
                                        strTrim = strTrim.substring(z10 ? 1 : 0, iIndexOf);
                                    }
                                    int i26 = AbstractC20817s.f66106a;
                                    String[] strArrSplit = strTrim.split("\\.", i15);
                                    String str2 = strArrSplit[z10 ? 1 : 0];
                                    int iIndexOf2 = str2.indexOf(35);
                                    if (iIndexOf2 != i15) {
                                        c20108b.f63696b = str2.substring(z10 ? 1 : 0, iIndexOf2);
                                        c20108b.f63695a = str2.substring(iIndexOf2 + i16);
                                    } else {
                                        c20108b.f63696b = str2;
                                    }
                                    if (strArrSplit.length > i16) {
                                        int length = strArrSplit.length;
                                        AbstractC20800b.m21316d(length <= strArrSplit.length ? i16 : z10 ? 1 : 0);
                                        c20108b.f63697c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i16, length)));
                                    }
                                }
                                ?? r6 = z10 ? 1 : 0;
                                String strM20947b2 = null;
                                while (r6 == 0) {
                                    int i27 = c20811m2.f66093b;
                                    strM20947b2 = C20107a.m20947b(c20811m2, sb2);
                                    ?? r14 = (strM20947b2 == null || "}".equals(strM20947b2)) ? i16 : z10;
                                    if (r14 == 0) {
                                        c20811m2.m21344F(i27);
                                        C20107a.m20948c(c20811m2);
                                        String strM20946a = C20107a.m20946a(c20811m2, sb2);
                                        if (!"".equals(strM20946a) && ":".equals(C20107a.m20947b(c20811m2, sb2))) {
                                            C20107a.m20948c(c20811m2);
                                            StringBuilder sb3 = new StringBuilder();
                                            boolean z11 = false;
                                            while (true) {
                                                if (z11) {
                                                    string = sb3.toString();
                                                } else {
                                                    int i28 = c20811m2.f66093b;
                                                    boolean z12 = z11;
                                                    String strM20947b3 = C20107a.m20947b(c20811m2, sb2);
                                                    if (strM20947b3 == null) {
                                                        string = null;
                                                    } else if ("}".equals(strM20947b3) || Separators.SEMICOLON.equals(strM20947b3)) {
                                                        c20811m2.m21344F(i28);
                                                        z11 = true;
                                                    } else {
                                                        sb3.append(strM20947b3);
                                                        z11 = z12;
                                                    }
                                                }
                                            }
                                            if (string == null || "".equals(string)) {
                                                i13 = 1;
                                            } else {
                                                int i29 = c20811m2.f66093b;
                                                String strM20947b4 = C20107a.m20947b(c20811m2, sb2);
                                                if (Separators.SEMICOLON.equals(strM20947b4)) {
                                                    if ("color".equals(strM20946a)) {
                                                        i14 = 1;
                                                        c20108b.f63700f = AbstractC20801c.m21334a(string, true);
                                                        c20108b.f63701g = true;
                                                    } else {
                                                        i14 = 1;
                                                        if ("background-color".equals(strM20946a)) {
                                                            c20108b.f63702h = AbstractC20801c.m21334a(string, true);
                                                            c20108b.f63703i = true;
                                                        } else {
                                                            if ("ruby-position".equals(strM20946a)) {
                                                                if ("over".equals(string)) {
                                                                    c20108b.f63709o = 1;
                                                                } else if ("under".equals(string)) {
                                                                    c20108b.f63709o = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strM20946a)) {
                                                                if ("all".equals(string)) {
                                                                    z6 = true;
                                                                } else {
                                                                    z6 = true;
                                                                }
                                                                c20108b.f63710p = z6;
                                                            } else if ("text-decoration".equals(strM20946a)) {
                                                                if ("underline".equals(string)) {
                                                                    c20108b.f63704j = 1;
                                                                }
                                                            } else if ("font-family".equals(strM20946a)) {
                                                                c20108b.f63699e = AbstractC7360k.m7787d(string);
                                                            } else if ("font-weight".equals(strM20946a)) {
                                                                i14 = 1;
                                                                if ("font-style".equals(strM20946a)) {
                                                                    if ("italic".equals(string)) {
                                                                        c20108b.f63706l = 1;
                                                                    }
                                                                } else if ("font-size".equals(strM20946a)) {
                                                                    matcher = C20107a.f63692d.matcher(AbstractC7360k.m7787d(string));
                                                                    if (matcher.matches()) {
                                                                        strGroup = matcher.group(2);
                                                                        strGroup.getClass();
                                                                        switch (strGroup.hashCode()) {
                                                                            case 37:
                                                                                if (!strGroup.equals(Separators.PERCENT)) {
                                                                                    b = 0;
                                                                                }
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup3 = matcher.group(i13);
                                                                                strGroup3.getClass();
                                                                                c20108b.f63708n = Float.parseFloat(strGroup3);
                                                                                break;
                                                                            case 3240:
                                                                                if (!strGroup.equals("em")) {
                                                                                    b = 1;
                                                                                }
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup4 = matcher.group(i13);
                                                                                strGroup4.getClass();
                                                                                c20108b.f63708n = Float.parseFloat(strGroup4);
                                                                                break;
                                                                            case 3592:
                                                                                if (!strGroup.equals("px")) {
                                                                                    b = 2;
                                                                                }
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup5 = matcher.group(i13);
                                                                                strGroup5.getClass();
                                                                                c20108b.f63708n = Float.parseFloat(strGroup5);
                                                                                break;
                                                                        }
                                                                        b = -1;
                                                                        switch (b) {
                                                                            case 0:
                                                                                i13 = 1;
                                                                                c20108b.f63707m = 3;
                                                                                break;
                                                                            case 1:
                                                                                i13 = 1;
                                                                                c20108b.f63707m = 2;
                                                                                break;
                                                                            case 2:
                                                                                i13 = 1;
                                                                                c20108b.f63707m = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String strGroup6 = matcher.group(i13);
                                                                        strGroup6.getClass();
                                                                        c20108b.f63708n = Float.parseFloat(strGroup6);
                                                                    } else {
                                                                        AbstractC20800b.m21332t("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                    }
                                                                }
                                                            } else if ("bold".equals(string)) {
                                                                i14 = 1;
                                                                c20108b.f63705k = 1;
                                                            }
                                                            i13 = 1;
                                                        }
                                                    }
                                                    i13 = i14;
                                                } else if ("}".equals(strM20947b4)) {
                                                    c20811m2.m21344F(i29);
                                                    if ("color".equals(strM20946a)) {
                                                        i14 = 1;
                                                        c20108b.f63700f = AbstractC20801c.m21334a(string, true);
                                                        c20108b.f63701g = true;
                                                    } else {
                                                        i14 = 1;
                                                        if ("background-color".equals(strM20946a)) {
                                                            c20108b.f63702h = AbstractC20801c.m21334a(string, true);
                                                            c20108b.f63703i = true;
                                                        } else {
                                                            if ("ruby-position".equals(strM20946a)) {
                                                                if ("over".equals(string)) {
                                                                    c20108b.f63709o = 1;
                                                                } else if ("under".equals(string)) {
                                                                    c20108b.f63709o = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strM20946a)) {
                                                                if ("all".equals(string) || string.startsWith("digits")) {
                                                                    z6 = true;
                                                                } else {
                                                                    z6 = false;
                                                                }
                                                                c20108b.f63710p = z6;
                                                            } else if ("text-decoration".equals(strM20946a)) {
                                                                if ("underline".equals(string)) {
                                                                    c20108b.f63704j = 1;
                                                                }
                                                            } else if ("font-family".equals(strM20946a)) {
                                                                c20108b.f63699e = AbstractC7360k.m7787d(string);
                                                            } else if ("font-weight".equals(strM20946a)) {
                                                                i14 = 1;
                                                                if ("font-style".equals(strM20946a)) {
                                                                    if ("italic".equals(string)) {
                                                                        c20108b.f63706l = 1;
                                                                    }
                                                                } else if ("font-size".equals(strM20946a)) {
                                                                    matcher = C20107a.f63692d.matcher(AbstractC7360k.m7787d(string));
                                                                    if (matcher.matches()) {
                                                                        AbstractC20800b.m21332t("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                    } else {
                                                                        strGroup = matcher.group(2);
                                                                        strGroup.getClass();
                                                                        switch (strGroup.hashCode()) {
                                                                            case 37:
                                                                                if (!strGroup.equals(Separators.PERCENT)) {
                                                                                    b = 0;
                                                                                }
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup7 = matcher.group(i13);
                                                                                strGroup7.getClass();
                                                                                c20108b.f63708n = Float.parseFloat(strGroup7);
                                                                                break;
                                                                            case 3240:
                                                                                if (!strGroup.equals("em")) {
                                                                                    b = 1;
                                                                                }
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup8 = matcher.group(i13);
                                                                                strGroup8.getClass();
                                                                                c20108b.f63708n = Float.parseFloat(strGroup8);
                                                                                break;
                                                                            case 3592:
                                                                                if (!strGroup.equals("px")) {
                                                                                    b = 2;
                                                                                }
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i13 = 1;
                                                                                        c20108b.f63707m = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup9 = matcher.group(i13);
                                                                                strGroup9.getClass();
                                                                                c20108b.f63708n = Float.parseFloat(strGroup9);
                                                                                break;
                                                                        }
                                                                        b = -1;
                                                                        switch (b) {
                                                                            case 0:
                                                                                i13 = 1;
                                                                                c20108b.f63707m = 3;
                                                                                break;
                                                                            case 1:
                                                                                i13 = 1;
                                                                                c20108b.f63707m = 2;
                                                                                break;
                                                                            case 2:
                                                                                i13 = 1;
                                                                                c20108b.f63707m = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String strGroup10 = matcher.group(i13);
                                                                        strGroup10.getClass();
                                                                        c20108b.f63708n = Float.parseFloat(strGroup10);
                                                                    }
                                                                }
                                                            } else if ("bold".equals(string)) {
                                                                i14 = 1;
                                                                c20108b.f63705k = 1;
                                                            }
                                                            i13 = 1;
                                                        }
                                                    }
                                                    i13 = i14;
                                                } else {
                                                    i13 = 1;
                                                }
                                            }
                                        } else {
                                            i13 = i16;
                                        }
                                    } else {
                                        i13 = i16;
                                    }
                                    i16 = i13;
                                    r6 = r14;
                                    z10 = false;
                                }
                                int i30 = i16;
                                if ("}".equals(strM20947b2)) {
                                    arrayList3.add(c20108b);
                                }
                                i16 = i30;
                                z10 = false;
                                i15 = -1;
                                str = null;
                            }
                        }
                        i12 = i16;
                        c9 = 2;
                        arrayList.addAll(arrayList3);
                    }
                    i16 = i12;
                    c10 = c9;
                    z10 = false;
                    i15 = -1;
                    c15026j = this;
                }
            }
        } catch (C19755E e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // p301M.InterfaceC5221c, p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        C0018J c0018j = (C0018J) this.f46725Z;
        if (c0018j.f71B0.f5617o0 == 2 && c0018j.f89T0 == 9) {
            ((C0018J) this.f46725Z).m97G(10);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m16151p(Collection retaining) {
        AbstractC16544l.m18094g(retaining, "retaining");
        Collection collection = retaining;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((C14172n) it.next()).f44558c);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f46724Y;
        AbstractC17686t.m19402z(AbstractC17665J.m19264d(linkedHashMap.keySet(), arrayList), linkedHashMap.keySet());
        ((C14522e) this.f46725Z).m16029w(arrayList);
    }

    /* JADX INFO: renamed from: q */
    public void mo1485q(ExecutorC4836i executorC4836i, C0006D c0006d) {
        C0709p c0709p;
        C11234e c11234e = (C11234e) this.f46725Z;
        synchronized (((HashMap) c11234e.f34001Z)) {
            try {
                c0709p = (C0709p) ((HashMap) c11234e.f34001Z).get(c0006d);
                if (c0709p == null) {
                    c0709p = new C0709p(executorC4836i, c0006d);
                    ((HashMap) c11234e.f34001Z).put(c0006d, c0709p);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((CameraManager) this.f46724Y).registerAvailabilityCallback(c0709p, (Handler) c11234e.f34002o0);
    }

    /* JADX INFO: renamed from: r */
    public void mo1486r(CameraManager.AvailabilityCallback availabilityCallback) {
        C0709p c0709p;
        if (availabilityCallback != null) {
            C11234e c11234e = (C11234e) this.f46725Z;
            synchronized (((HashMap) c11234e.f34001Z)) {
                c0709p = (C0709p) ((HashMap) c11234e.f34001Z).remove(availabilityCallback);
            }
        } else {
            c0709p = null;
        }
        if (c0709p != null) {
            c0709p.m1479a();
        }
        ((CameraManager) this.f46724Y).unregisterAvailabilityCallback(c0709p);
    }

    /* JADX INFO: renamed from: s */
    public void m16152s(List retainedRenderings, View view, View view2) {
        Set setM19268h;
        AbstractC16544l.m18094g(retainedRenderings, "retainedRenderings");
        String strM9310b = AbstractC8644h3.m9310b(view2);
        C21036q c21036qM21495s = AbstractC21031l.m21495s(AbstractC17680n.m19329H(retainedRenderings), C15025i.f46723Y);
        Iterator it = c21036qM21495s.f66917a.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            InterfaceC1436k interfaceC1436k = c21036qM21495s.f66918b;
            Object objInvoke = interfaceC1436k.invoke(next);
            if (it.hasNext()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(objInvoke);
                while (it.hasNext()) {
                    linkedHashSet.add(interfaceC1436k.invoke(it.next()));
                }
                setM19268h = linkedHashSet;
            } else {
                setM19268h = AbstractC17665J.m19268h(objInvoke);
            }
        } else {
            setM19268h = C17691y.f56482Y;
        }
        if (retainedRenderings.size() != setM19268h.size()) {
            throw new IllegalArgumentException(("Duplicate entries not allowed in " + retainedRenderings + '.').toString());
        }
        C14522e c14522e = (C14522e) this.f46725Z;
        c14522e.m16026t(view2, strM9310b);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f46724Y;
        C15028l c15028l = (C15028l) linkedHashMap.remove(strM9310b);
        if (c15028l != null) {
            view2.restoreHierarchyState(c15028l.f46727Z);
        }
        if (view != null) {
            String strM9310b2 = AbstractC8644h3.m9310b(view);
            C17296C c17296c = null;
            if (!setM19268h.contains(strM9310b2)) {
                strM9310b2 = null;
            }
            if (strM9310b2 != null) {
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                view.saveHierarchyState(sparseArray);
                linkedHashMap.put(strM9310b2, new C15028l(strM9310b2, sparseArray));
                C14518a c14518a = (C14518a) ((LinkedHashMap) c14522e.f45762Z).remove(strM9310b2);
                if (c14518a != null) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) c14522e.f45761Y;
                    if (linkedHashMap2 != null) {
                        Bundle bundle = new Bundle();
                        c14518a.f45753o0.m351u(bundle);
                        linkedHashMap2.put(c14518a.f45751Y, bundle);
                    }
                    c17296c = C17296C.f55119a;
                }
                if (c17296c == null) {
                    throw new IllegalArgumentException(AbstractC16544l.m18100m(strM9310b2, "No such child: "));
                }
            }
        }
        LinkedHashSet linkedHashSetM19267g = AbstractC17665J.m19267g(setM19268h, strM9310b);
        AbstractC17686t.m19402z(AbstractC17665J.m19264d(linkedHashMap.keySet(), linkedHashSetM19267g), linkedHashMap.keySet());
        c14522e.m16029w(linkedHashSetM19267g);
    }

    /* JADX INFO: renamed from: t */
    public void m16153t(C11918V1 c11918v1) {
        if (c11918v1 == null) {
            return;
        }
        try {
            C11982m2 c11982m2M13505t = C11986n2.m13505t();
            c11982m2M13505t.m13490e((C11954f2) this.f46724Y);
            c11982m2M13505t.m13473d();
            C11986n2.m13499n((C11986n2) c11982m2M13505t.f36278Z, c11918v1);
            ((C0095w0) this.f46725Z).m362F((C11986n2) c11982m2M13505t.m13471b());
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h("BillingLogger", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m16154u(C11918V1 c11918v1, int i10) {
        try {
            C11950e2 c11950e2 = (C11950e2) ((C11954f2) this.f46724Y).m13481g();
            c11950e2.m13473d();
            C11954f2.m13416n((C11954f2) c11950e2.f36278Z, i10);
            this.f46724Y = (C11954f2) c11950e2.m13471b();
            m16153t(c11918v1);
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h("BillingLogger", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m16155v(C11924X1 c11924x1) {
        if (c11924x1 == null) {
            return;
        }
        try {
            C11982m2 c11982m2M13505t = C11986n2.m13505t();
            c11982m2M13505t.m13490e((C11954f2) this.f46724Y);
            c11982m2M13505t.m13473d();
            C11986n2.m13500o((C11986n2) c11982m2M13505t.f36278Z, c11924x1);
            ((C0095w0) this.f46725Z).m362F((C11986n2) c11982m2M13505t.m13471b());
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h("BillingLogger", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m16157x(C11998q2 c11998q2) {
        try {
            C0095w0 c0095w0 = (C0095w0) this.f46725Z;
            C11982m2 c11982m2M13505t = C11986n2.m13505t();
            c11982m2M13505t.m13490e((C11954f2) this.f46724Y);
            c11982m2M13505t.m13473d();
            C11986n2.m13503r((C11986n2) c11982m2M13505t.f36278Z, c11998q2);
            c0095w0.m362F((C11986n2) c11982m2M13505t.m13471b());
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h("BillingLogger", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m16158y(C12002r2 c12002r2) {
        if (c12002r2 == null) {
            return;
        }
        try {
            C11982m2 c11982m2M13505t = C11986n2.m13505t();
            c11982m2M13505t.m13490e((C11954f2) this.f46724Y);
            c11982m2M13505t.m13473d();
            C11986n2.m13504s((C11986n2) c11982m2M13505t.f36278Z, c12002r2);
            ((C0095w0) this.f46725Z).m362F((C11986n2) c11982m2M13505t.m13471b());
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h("BillingLogger", "Unable to log.", th2);
        }
    }

    public C15026j(Context context, C11954f2 c11954f2) {
        C0095w0 c0095w0 = new C0095w0(7);
        try {
            C9691r.m10283b(context);
            c0095w0.f411o0 = C9691r.m10282a().m10284c(C8440a.f26277e).m10280a("PLAY_BILLING_LIBRARY", new C7836c("proto"), new C15370i(29));
        } catch (Throwable unused) {
            c0095w0.f410Z = true;
        }
        this.f46725Z = c0095w0;
        this.f46724Y = c11954f2;
    }

    /* JADX INFO: renamed from: w */
    public void m16156w(C11938b2 c11938b2) {
        try {
            C11982m2 c11982m2M13505t = C11986n2.m13505t();
            c11982m2M13505t.m13490e((C11954f2) this.f46724Y);
            c11982m2M13505t.m13473d();
            C11986n2.m13501p((C11986n2) c11982m2M13505t.f36278Z, c11938b2);
            ((C0095w0) this.f46725Z).m362F((C11986n2) c11982m2M13505t.m13471b());
        } catch (Throwable th2) {
            AbstractC11988o0.m13513h(suYVq.jKmM, "Unable to log.", th2);
        }
    }

    public C15026j(String str, String str2) {
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            this.f46724Y = str;
            this.f46725Z = (str2 == null || str2.length() <= 0) ? null : str2;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public C15026j(int i10) {
        switch (i10) {
            case 5:
                this.f46724Y = new LinkedHashMap();
                this.f46725Z = new LinkedHashMap();
                break;
            case 11:
                TextUtils.isEmpty("Auth0.Android");
                TextUtils.isEmpty("2.11.0");
                HashMap map = new HashMap();
                map.put("android", String.valueOf(Build.VERSION.SDK_INT));
                if (!TextUtils.isEmpty(null)) {
                    map.put("auth0.android", null);
                }
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
                AbstractC16544l.m18093f(mapUnmodifiableMap, "unmodifiableMap(tmpEnv)");
                this.f46724Y = mapUnmodifiableMap;
                HashMap map2 = new HashMap();
                map2.put(DiagnosticsEntry.NAME_KEY, "Auth0.Android");
                map2.put("version", "2.11.0");
                map2.put("env", mapUnmodifiableMap);
                String json = AbstractC11847f.f35979a.m4375i(map2);
                AbstractC16544l.m18093f(json, "json");
                Charset UTF_8 = StandardCharsets.UTF_8;
                AbstractC16544l.m18093f(UTF_8, "UTF_8");
                byte[] bytes = json.getBytes(UTF_8);
                AbstractC16544l.m18093f(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bArrEncode = Base64.encode(bytes, 10);
                AbstractC16544l.m18093f(bArrEncode, "encode(bytes, Base64.URL_SAFE or Base64.NO_WRAP)");
                this.f46725Z = new String(bArrEncode, UTF_8);
                break;
            case 19:
                this.f46724Y = new C20811m();
                this.f46725Z = new C20107a();
                break;
            default:
                this.f46724Y = new LinkedHashMap();
                this.f46725Z = new C14522e(0);
                break;
        }
    }

    public C15026j(Context context, C11234e c11234e) {
        this.f46724Y = (CameraManager) context.getSystemService("camera");
        this.f46725Z = c11234e;
    }

    public C15026j(InterfaceC1436k interfaceC1436k) {
        this.f46724Y = interfaceC1436k;
        this.f46725Z = new C11184q();
    }

    public C15026j(InterfaceC15127H interfaceC15127H, C15150O1 c15150o1) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.f46724Y = linkedBlockingDeque;
        AbstractC8483G3.m9133c(interfaceC15127H, "logger is required");
        this.f46725Z = interfaceC15127H;
        linkedBlockingDeque.push(c15150o1);
    }
}
