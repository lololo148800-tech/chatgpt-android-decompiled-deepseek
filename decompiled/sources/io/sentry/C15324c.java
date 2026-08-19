package io.sentry;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ParameterNames;
import cn.UfGr.EhBykzn;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.clientreport.C15334b;
import io.sentry.protocol.C15424D;
import io.sentry.protocol.C15438k;
import io.sentry.protocol.C15445r;
import io.sentry.protocol.C15447t;
import io.sentry.rrweb.EnumC15462c;
import io.sentry.rrweb.EnumC15463d;
import io.sentry.util.AbstractC15503h;
import io.sentry.vendor.gson.stream.C15513a;
import io.sentry.vendor.gson.stream.EnumC15514b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import livekit.org.webrtc.WebrtcBuildVersion;
import p509Uk.lpqL.SfpOlmlMATQ;
import p544W9.AbstractC8453B3;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8656j3;
import p544W9.AbstractC8662k3;
import p690cp.C12910A;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15324c implements InterfaceC15176Y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47867a;

    public /* synthetic */ C15324c(int i10) {
        this.f47867a = i10;
    }

    /* JADX INFO: renamed from: c */
    public static IllegalStateException m16532c(String str, InterfaceC15127H interfaceC15127H) {
        String strM11054l = AbstractC10763a.m11054l("Missing required field \"", str, Separators.DOUBLE_QUOTE);
        IllegalStateException illegalStateException = new IllegalStateException(strM11054l);
        interfaceC15127H.mo16297h(EnumC15375i1.ERROR, strM11054l, illegalStateException);
        return illegalStateException;
    }

    /* JADX INFO: renamed from: d */
    public static IllegalStateException m16533d(String str, InterfaceC15127H interfaceC15127H) {
        String strM11054l = AbstractC10763a.m11054l("Missing required field \"", str, Separators.DOUBLE_QUOTE);
        IllegalStateException illegalStateException = new IllegalStateException(strM11054l);
        interfaceC15127H.mo16297h(EnumC15375i1.ERROR, strM11054l, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Code duplicated, block: B:1107:0x0459 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0221 A[PHI: r10
      0x0221: PHI (r10v13 java.lang.String) = (r10v12 java.lang.String), (r10v15 java.lang.String) binds: [B:121:0x0214, B:124:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:298:0x046a A[LOOP:5: B:222:0x0384->B:298:0x046a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:892:0x0ef3 A[PHI: r6
      0x0ef3: PHI (r6v22 java.lang.Object) = 
      (r6v8 java.lang.Object)
      (r6v9 java.lang.Object)
      (r6v10 java.lang.Object)
      (r6v11 java.lang.Object)
      (r6v12 java.lang.Object)
      (r6v13 java.lang.Object)
      (r6v14 java.lang.Object)
      (r6v15 java.lang.Object)
      (r6v16 java.lang.Object)
      (r6v17 java.lang.Object)
      (r6v18 java.lang.Object)
      (r6v19 java.lang.Object)
      (r6v20 java.lang.Object)
      (r6v21 java.lang.Object)
      (r6v23 java.lang.Object)
     binds: [B:891:0x0ef1, B:887:0x0ee4, B:883:0x0ed7, B:879:0x0eca, B:875:0x0ebd, B:871:0x0eaf, B:867:0x0ea2, B:863:0x0e93, B:859:0x0e84, B:855:0x0e75, B:851:0x0e65, B:847:0x0e55, B:843:0x0e46, B:839:0x0e36, B:835:0x0e26] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:288:0x0439. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r56v0, types: [io.sentry.h0] */
    /* JADX WARN: Type inference failed for: r57v0, types: [io.sentry.H] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // io.sentry.InterfaceC15176Y
    /* JADX INFO: renamed from: a */
    public final Object mo16359a(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) throws IOException {
        ?? r10;
        Object obj;
        byte b;
        byte b10;
        ArrayList arrayList;
        String str;
        ConcurrentHashMap concurrentHashMap;
        String strM16602N0;
        byte b11;
        String str2;
        ConcurrentHashMap concurrentHashMap2;
        int i10;
        int i11;
        String str3;
        String str4 = "environment";
        switch (this.f47867a) {
            case 0:
                String strM16602N1 = null;
                boolean z6 = true;
                char c9 = 3;
                c15360h0.m16614e();
                Date dateM9340h = AbstractC8656j3.m9340h();
                ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                String strM16602N2 = null;
                String strM16602N3 = null;
                EnumC15375i1 enumC15375i1ValueOf = null;
                ConcurrentHashMap concurrentHashMap4 = null;
                String strM16602N4 = null;
                Date date = dateM9340h;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a0 = c15360h0.m16613a0();
                    strM16613a0.getClass();
                    switch (strM16613a0.hashCode()) {
                        case -1008619738:
                            r10 = strM16613a0.equals("origin") ? 0 : -1;
                            break;
                        case 3076010:
                            r10 = strM16613a0.equals("data") ? z6 : -1;
                            break;
                        case 3575610:
                            r10 = strM16613a0.equals("type") ? 2 : -1;
                            break;
                        case 50511102:
                            r10 = strM16613a0.equals("category") ? c9 : -1;
                            break;
                        case 55126294:
                            r10 = strM16613a0.equals(DiagnosticsEntry.TIMESTAMP_KEY) ? 4 : -1;
                            break;
                        case 102865796:
                            r10 = strM16613a0.equals("level") ? 5 : -1;
                            break;
                        case 954925063:
                            r10 = strM16613a0.equals("message") ? 6 : -1;
                            break;
                        default:
                            r10 = -1;
                            break;
                    }
                    switch (r10) {
                        case 0:
                            strM16602N3 = c15360h0.m16602N0();
                            break;
                        case 1:
                            ConcurrentHashMap concurrentHashMapM9064a = AbstractC8453B3.m9064a((Map) c15360h0.m16600H0());
                            if (concurrentHashMapM9064a != null) {
                                concurrentHashMap3 = concurrentHashMapM9064a;
                            }
                            break;
                        case 2:
                            strM16602N1 = c15360h0.m16602N0();
                            break;
                        case 3:
                            strM16602N2 = c15360h0.m16602N0();
                            break;
                        case 4:
                            Date dateM16598E = c15360h0.m16598E(interfaceC15127H);
                            if (dateM16598E != null) {
                                date = dateM16598E;
                            }
                            break;
                        case 5:
                            try {
                                enumC15375i1ValueOf = EnumC15375i1.valueOf(c15360h0.m16622x().toUpperCase(Locale.ROOT));
                            } catch (Exception e10) {
                                interfaceC15127H.mo16296g(EnumC15375i1.ERROR, e10, "Error when deserializing SentryLevel", new Object[0]);
                            }
                            break;
                        case 6:
                            strM16602N4 = c15360h0.m16602N0();
                            break;
                        default:
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap4, strM16613a0);
                            break;
                    }
                    z6 = true;
                    c9 = 3;
                }
                C15345d c15345d = new C15345d(date);
                c15345d.f47906o0 = strM16602N4;
                c15345d.f47907p0 = strM16602N1;
                c15345d.f47908q0 = concurrentHashMap3;
                c15345d.f47909r0 = strM16602N2;
                c15345d.f47910s0 = strM16602N3;
                c15345d.f47911t0 = enumC15375i1ValueOf;
                c15345d.f47912u0 = concurrentHashMap4;
                c15360h0.m16618k();
                return c15345d;
            case 1:
                Object obj2 = "environment";
                c15360h0.m16614e();
                File file = new File("dummy");
                Date dateM9340h2 = AbstractC8656j3.m9340h();
                ArrayList arrayList2 = new ArrayList();
                C15447t c15447t = C15447t.f48216Z;
                String string = c15447t.toString();
                C15144M1 c15144m1 = C15144M1.f47154Z;
                new ConcurrentHashMap();
                AbstractC8483G3.m9133c(c15144m1, SfpOlmlMATQ.GLrGPge);
                C15113C0 c15113c0 = new C15113C0(file, dateM9340h2, arrayList2, "", string, c15447t.toString(), WebrtcBuildVersion.maint_version, 0, "", new CallableC15519x(2), null, null, null, null, null, null, null, null, "normal", new HashMap());
                ConcurrentHashMap concurrentHashMap5 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a1 = c15360h0.m16613a0();
                    strM16613a1.getClass();
                    switch (strM16613a1.hashCode()) {
                        case -2133529830:
                            obj = obj2;
                            if (strM16613a1.equals("device_manufacturer")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            break;
                        case -1981468849:
                            obj = obj2;
                            if (strM16613a1.equals("android_api_level")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                            break;
                        case -1430655860:
                            obj = obj2;
                            if (strM16613a1.equals("build_id")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                            break;
                        case -1172160413:
                            obj = obj2;
                            if (strM16613a1.equals("device_locale")) {
                                b = 3;
                            } else {
                                b = -1;
                            }
                            break;
                        case -1102636175:
                            obj = obj2;
                            if (strM16613a1.equals("profile_id")) {
                                b = 4;
                            } else {
                                b = -1;
                            }
                            break;
                        case -716656436:
                            obj = obj2;
                            if (strM16613a1.equals("device_os_build_number")) {
                                b = 5;
                            } else {
                                b = -1;
                            }
                            break;
                        case -591076352:
                            obj = obj2;
                            if (strM16613a1.equals("device_model")) {
                                b = 6;
                            } else {
                                b = -1;
                            }
                            break;
                        case -512511455:
                            obj = obj2;
                            if (strM16613a1.equals("device_is_emulator")) {
                                b = 7;
                            } else {
                                b = -1;
                            }
                            break;
                        case -478065584:
                            obj = obj2;
                            if (strM16613a1.equals("duration_ns")) {
                                b = 8;
                            } else {
                                b = -1;
                            }
                            break;
                        case -362243017:
                            obj = obj2;
                            if (strM16613a1.equals("measurements")) {
                                b = 9;
                            } else {
                                b = -1;
                            }
                            break;
                        case -332426004:
                            obj = obj2;
                            if (strM16613a1.equals("device_physical_memory_bytes")) {
                                b = 10;
                            } else {
                                b = -1;
                            }
                            break;
                        case -212264198:
                            obj = obj2;
                            if (strM16613a1.equals("device_cpu_frequencies")) {
                                b = 11;
                            } else {
                                b = -1;
                            }
                            break;
                        case -102985484:
                            obj = obj2;
                            if (strM16613a1.equals("version_code")) {
                                b = 12;
                            } else {
                                b = -1;
                            }
                            break;
                        case -102670958:
                            obj = obj2;
                            if (strM16613a1.equals("version_name")) {
                                b = 13;
                            } else {
                                b = -1;
                            }
                            break;
                        case -85904877:
                            obj = obj2;
                            if (strM16613a1.equals(obj)) {
                                b = 14;
                            } else {
                                b = -1;
                            }
                            break;
                        case 55126294:
                            if (strM16613a1.equals(DiagnosticsEntry.TIMESTAMP_KEY)) {
                                b10 = 15;
                                b = b10;
                            } else {
                                b = -1;
                            }
                            obj = obj2;
                            break;
                        case 508853068:
                            if (strM16613a1.equals("transaction_name")) {
                                b10 = 16;
                                b = b10;
                            } else {
                                b = -1;
                            }
                            obj = obj2;
                            break;
                        case 796476189:
                            if (strM16613a1.equals("device_os_name")) {
                                b10 = 17;
                                b = b10;
                            } else {
                                b = -1;
                            }
                            obj = obj2;
                            break;
                        case 839674195:
                            if (strM16613a1.equals("architecture")) {
                                b10 = 18;
                                b = b10;
                            } else {
                                b = -1;
                            }
                            obj = obj2;
                            break;
                        case 1010584092:
                            if (strM16613a1.equals("transaction_id")) {
                                b10 = 19;
                                b = b10;
                            } else {
                                b = -1;
                            }
                            obj = obj2;
                            break;
                        case 1052553990:
                            if (strM16613a1.equals("device_os_version")) {
                                b10 = 20;
                                b = b10;
                            } else {
                                b = -1;
                            }
                            obj = obj2;
                            break;
                        case 1163928186:
                            if (strM16613a1.equals("truncation_reason")) {
                                b10 = 21;
                                b = b10;
                            } else {
                                b = -1;
                            }
                            obj = obj2;
                            break;
                        case 1270300245:
                            b = !strM16613a1.equals("trace_id") ? (byte) -1 : (byte) 22;
                            obj = obj2;
                            break;
                        case 1874684019:
                            if (strM16613a1.equals("platform")) {
                                b10 = 23;
                                b = b10;
                            } else {
                                b = -1;
                            }
                            obj = obj2;
                            break;
                        case 1953158756:
                            if (strM16613a1.equals("sampled_profile")) {
                                b10 = 24;
                                b = b10;
                            } else {
                                b = -1;
                            }
                            obj = obj2;
                            break;
                        case 1954122069:
                            if (strM16613a1.equals("transactions")) {
                                b10 = 25;
                                b = b10;
                            } else {
                                b = -1;
                            }
                            obj = obj2;
                            break;
                        default:
                            b = -1;
                            obj = obj2;
                            break;
                    }
                    switch (b) {
                        case 0:
                            String strM16602N5 = c15360h0.m16602N0();
                            if (strM16602N5 != null) {
                                c15113c0.f47039q0 = strM16602N5;
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 1:
                            Integer numM16608W = c15360h0.m16608W();
                            if (numM16608W != null) {
                                c15113c0.f47037o0 = numM16608W.intValue();
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 2:
                            String strM16602N6 = c15360h0.m16602N0();
                            if (strM16602N6 != null) {
                                c15113c0.f47020A0 = strM16602N6;
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 3:
                            String strM16602N7 = c15360h0.m16602N0();
                            if (strM16602N7 != null) {
                                c15113c0.f47038p0 = strM16602N7;
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 4:
                            String strM16602N8 = c15360h0.m16602N0();
                            if (strM16602N8 != null) {
                                c15113c0.f47028I0 = strM16602N8;
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 5:
                            String strM16602N9 = c15360h0.m16602N0();
                            if (strM16602N9 != null) {
                                c15113c0.f47041s0 = strM16602N9;
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 6:
                            String strM16602N10 = c15360h0.m16602N0();
                            if (strM16602N10 != null) {
                                c15113c0.f47040r0 = strM16602N10;
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 7:
                            Boolean boolM16619m = c15360h0.m16619m();
                            if (boolM16619m != null) {
                                c15113c0.f47044v0 = boolM16619m.booleanValue();
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 8:
                            String strM16602N11 = c15360h0.m16602N0();
                            if (strM16602N11 != null) {
                                c15113c0.f47023D0 = strM16602N11;
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 9:
                            HashMap mapM16597C0 = c15360h0.m16597C0(interfaceC15127H, new C15334b(2));
                            if (mapM16597C0 != null) {
                                c15113c0.f47032M0.putAll(mapM16597C0);
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 10:
                            String strM16602N12 = c15360h0.m16602N0();
                            if (strM16602N12 != null) {
                                c15113c0.f47047y0 = strM16602N12;
                            }
                            break;
                        case 11:
                            List list = (List) c15360h0.m16600H0();
                            if (list != null) {
                                c15113c0.f47046x0 = list;
                            }
                            break;
                        case 12:
                            String strM16602N13 = c15360h0.m16602N0();
                            if (strM16602N13 != null) {
                                c15113c0.f47024E0 = strM16602N13;
                            }
                            break;
                        case 13:
                            String strM16602N14 = c15360h0.m16602N0();
                            if (strM16602N14 != null) {
                                c15113c0.f47025F0 = strM16602N14;
                            }
                            break;
                        case 14:
                            String strM16602N15 = c15360h0.m16602N0();
                            if (strM16602N15 != null) {
                                c15113c0.f47029J0 = strM16602N15;
                            }
                            break;
                        case 15:
                            Date dateM16598E2 = c15360h0.m16598E(interfaceC15127H);
                            if (dateM16598E2 != null) {
                                c15113c0.f47031L0 = dateM16598E2;
                            }
                            break;
                        case 16:
                            String strM16602N16 = c15360h0.m16602N0();
                            if (strM16602N16 != null) {
                                c15113c0.f47022C0 = strM16602N16;
                            }
                            break;
                        case 17:
                            String strM16602N17 = c15360h0.m16602N0();
                            if (strM16602N17 != null) {
                                c15113c0.f47042t0 = strM16602N17;
                            }
                            break;
                        case 18:
                            String strM16602N18 = c15360h0.m16602N0();
                            if (strM16602N18 != null) {
                                c15113c0.f47045w0 = strM16602N18;
                            }
                            break;
                        case 19:
                            String strM16602N19 = c15360h0.m16602N0();
                            if (strM16602N19 != null) {
                                c15113c0.f47026G0 = strM16602N19;
                            }
                            break;
                        case 20:
                            String strM16602N20 = c15360h0.m16602N0();
                            if (strM16602N20 != null) {
                                c15113c0.f47043u0 = strM16602N20;
                            }
                            break;
                        case 21:
                            String strM16602N21 = c15360h0.m16602N0();
                            if (strM16602N21 != null) {
                                c15113c0.f47030K0 = strM16602N21;
                            }
                            break;
                        case 22:
                            String strM16602N22 = c15360h0.m16602N0();
                            if (strM16602N22 != null) {
                                c15113c0.f47027H0 = strM16602N22;
                            }
                            break;
                        case 23:
                            String strM16602N23 = c15360h0.m16602N0();
                            if (strM16602N23 != null) {
                                c15113c0.f47048z0 = strM16602N23;
                            }
                            break;
                        case 24:
                            String strM16602N24 = c15360h0.m16602N0();
                            if (strM16602N24 != null) {
                                c15113c0.f47033N0 = strM16602N24;
                            }
                            break;
                        case 25:
                            ArrayList arrayListM16617j0 = c15360h0.m16617j0(interfaceC15127H, new C15324c(2));
                            if (arrayListM16617j0 != null) {
                                c15113c0.f47021B0.addAll(arrayListM16617j0);
                            }
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap5, strM16613a1);
                            break;
                    }
                    obj2 = obj;
                }
                c15113c0.f47034O0 = concurrentHashMap5;
                c15360h0.m16618k();
                return c15113c0;
            case 2:
                c15360h0.m16614e();
                C15116D0 c15116d0 = new C15116D0(C15517w0.f48472a, 0L, 0L);
                ConcurrentHashMap concurrentHashMap6 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a2 = c15360h0.m16613a0();
                    strM16613a2.getClass();
                    switch (strM16613a2) {
                        case "relative_start_ns":
                            Long lM16620r0 = c15360h0.m16620r0();
                            if (lM16620r0 == null) {
                                break;
                            } else {
                                c15116d0.f47062p0 = lM16620r0;
                                break;
                            }
                            break;
                        case "relative_end_ns":
                            Long lM16620r1 = c15360h0.m16620r0();
                            if (lM16620r1 == null) {
                                break;
                            } else {
                                c15116d0.f47063q0 = lM16620r1;
                                break;
                            }
                            break;
                        case "id":
                            String strM16602N25 = c15360h0.m16602N0();
                            if (strM16602N25 == null) {
                                break;
                            } else {
                                c15116d0.f47059Y = strM16602N25;
                                break;
                            }
                            break;
                        case "name":
                            String strM16602N26 = c15360h0.m16602N0();
                            if (strM16602N26 == null) {
                                break;
                            } else {
                                c15116d0.f47061o0 = strM16602N26;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strM16602N27 = c15360h0.m16602N0();
                            if (strM16602N27 == null) {
                                break;
                            } else {
                                c15116d0.f47060Z = strM16602N27;
                                break;
                            }
                            break;
                        case "relative_cpu_end_ms":
                            Long lM16620r2 = c15360h0.m16620r0();
                            if (lM16620r2 == null) {
                                break;
                            } else {
                                c15116d0.f47065s0 = lM16620r2;
                                break;
                            }
                            break;
                        case "relative_cpu_start_ms":
                            Long lM16620r3 = c15360h0.m16620r0();
                            if (lM16620r3 == null) {
                                break;
                            } else {
                                c15116d0.f47064r0 = lM16620r3;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap6, strM16613a2);
                            break;
                    }
                }
                c15116d0.f47066t0 = concurrentHashMap6;
                c15360h0.m16618k();
                return c15116d0;
            case 3:
                C15128H0 c15128h0 = new C15128H0();
                c15360h0.m16614e();
                HashMap map = null;
                Integer numM16608W2 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a3 = c15360h0.m16613a0();
                    strM16613a3.getClass();
                    if (strM16613a3.equals("segment_id")) {
                        numM16608W2 = c15360h0.m16608W();
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        c15360h0.m16607V0(interfaceC15127H, map, strM16613a3);
                    }
                }
                c15360h0.m16618k();
                c15360h0.m16611Y0(true);
                List list2 = (List) c15360h0.m16600H0();
                c15360h0.m16611Y0(false);
                if (list2 != null) {
                    arrayList = new ArrayList(list2.size());
                    for (Object obj3 : list2) {
                        if (obj3 instanceof Map) {
                            Map map2 = (Map) obj3;
                            C15360h0 c15360h1 = new C15360h0(map2);
                            for (Map.Entry entry : map2.entrySet()) {
                                String str5 = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (str5.equals("type")) {
                                    EnumC15462c enumC15462c = EnumC15462c.values()[((Integer) value).intValue()];
                                    int i12 = AbstractC15125G0.f47074b[enumC15462c.ordinal()];
                                    if (i12 == 1) {
                                        Map mapEmptyMap = (Map) map2.get("data");
                                        if (mapEmptyMap == null) {
                                            mapEmptyMap = Collections.emptyMap();
                                        }
                                        Integer num = (Integer) mapEmptyMap.get("source");
                                        if (num != null) {
                                            EnumC15463d enumC15463d = EnumC15463d.values()[num.intValue()];
                                            int i13 = AbstractC15125G0.f47073a[enumC15463d.ordinal()];
                                            if (i13 == 1) {
                                                arrayList.add(C15424D.m16655c(c15360h1, interfaceC15127H));
                                            } else if (i13 != 2) {
                                                interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "Unsupported rrweb incremental snapshot type %s", enumC15463d);
                                            } else {
                                                arrayList.add(C15424D.m16656d(c15360h1, interfaceC15127H));
                                            }
                                        }
                                    } else if (i12 == 2) {
                                        arrayList.add(C15424D.m16657e(c15360h1, interfaceC15127H));
                                    } else if (i12 == 3) {
                                        Map mapEmptyMap2 = (Map) map2.get("data");
                                        if (mapEmptyMap2 == null) {
                                            mapEmptyMap2 = Collections.emptyMap();
                                        }
                                        String str6 = (String) mapEmptyMap2.get(ParameterNames.TAG);
                                        if (str6 != null) {
                                            switch (str6) {
                                                case "performanceSpan":
                                                    arrayList.add(C15424D.m16658f(c15360h1, interfaceC15127H));
                                                    break;
                                                case "video":
                                                    arrayList.add(C15424D.m16659g(c15360h1, interfaceC15127H));
                                                    break;
                                                case "breadcrumb":
                                                    arrayList.add(C15424D.m16654b(c15360h1, interfaceC15127H));
                                                    break;
                                                default:
                                                    interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "Unsupported rrweb event type %s", enumC15462c);
                                                    break;
                                            }
                                        }
                                    } else {
                                        interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "Unsupported rrweb event type %s", enumC15462c);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                c15128h0.f47093Y = numM16608W2;
                c15128h0.f47094Z = arrayList;
                c15128h0.f47095o0 = map;
                return c15128h0;
            case 4:
                c15360h0.m16614e();
                C15155Q0 c15155q0 = new C15155Q0();
                c15155q0.f47173o0 = false;
                c15155q0.f47174p0 = null;
                c15155q0.f47171Y = false;
                c15155q0.f47172Z = null;
                c15155q0.f47175q0 = null;
                c15155q0.f47176r0 = false;
                c15155q0.f47177s0 = 0;
                ConcurrentHashMap concurrentHashMap7 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a4 = c15360h0.m16613a0();
                    strM16613a4.getClass();
                    switch (strM16613a4) {
                        case "trace_sampled":
                            Boolean boolM16619m2 = c15360h0.m16619m();
                            if (boolM16619m2 == null) {
                                break;
                            } else {
                                c15155q0.f47173o0 = boolM16619m2.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_dir_path":
                            String strM16602N28 = c15360h0.m16602N0();
                            if (strM16602N28 == null) {
                                break;
                            } else {
                                c15155q0.f47175q0 = strM16602N28;
                                break;
                            }
                            break;
                        case "is_profiling_enabled":
                            Boolean boolM16619m3 = c15360h0.m16619m();
                            if (boolM16619m3 == null) {
                                break;
                            } else {
                                c15155q0.f47176r0 = boolM16619m3.booleanValue();
                                break;
                            }
                            break;
                        case "profile_sampled":
                            Boolean boolM16619m4 = c15360h0.m16619m();
                            if (boolM16619m4 == null) {
                                break;
                            } else {
                                c15155q0.f47171Y = boolM16619m4.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_hz":
                            Integer numM16608W3 = c15360h0.m16608W();
                            if (numM16608W3 == null) {
                                break;
                            } else {
                                c15155q0.f47177s0 = numM16608W3.intValue();
                                break;
                            }
                            break;
                        case "trace_sample_rate":
                            Double dM16604P = c15360h0.m16604P();
                            if (dM16604P == null) {
                                break;
                            } else {
                                c15155q0.f47174p0 = dM16604P;
                                break;
                            }
                            break;
                        case "profile_sample_rate":
                            Double dM16604P2 = c15360h0.m16604P();
                            if (dM16604P2 == null) {
                                break;
                            } else {
                                c15155q0.f47172Z = dM16604P2;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap7, strM16613a4);
                            break;
                    }
                }
                c15155q0.f47178t0 = concurrentHashMap7;
                c15360h0.m16618k();
                return c15155q0;
            case 5:
                c15360h0.m16614e();
                C15445r c15445r = null;
                C15158R1 c15158r1 = null;
                Date dateM16598E3 = null;
                HashMap map3 = null;
                C15447t c15447t2 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a5 = c15360h0.m16613a0();
                    strM16613a5.getClass();
                    switch (strM16613a5) {
                        case "sdk":
                            c15445r = (C15445r) c15360h0.m16601J0(interfaceC15127H, new C15334b(20));
                            continue;
                            break;
                        case "trace":
                            c15158r1 = (C15158R1) c15360h0.m16601J0(interfaceC15127H, new C15324c(17));
                            continue;
                            break;
                        case "event_id":
                            c15447t2 = (C15447t) c15360h0.m16601J0(interfaceC15127H, new C15334b(22));
                            continue;
                            break;
                        case "sent_at":
                            dateM16598E3 = c15360h0.m16598E(interfaceC15127H);
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, map3, strM16613a5);
                            break;
                    }
                }
                C15175X0 c15175x0 = new C15175X0(c15447t2, c15445r, c15158r1);
                c15175x0.f47242p0 = dateM16598E3;
                c15175x0.f47243q0 = map3;
                c15360h0.m16618k();
                return c15175x0;
            case 6:
                c15360h0.m16614e();
                EnumC15361h1 enumC15361h1 = null;
                int iM16616g0 = 0;
                String strM16602N29 = null;
                String strM16602N30 = null;
                HashMap map4 = null;
                String strM16602N31 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a6 = c15360h0.m16613a0();
                    strM16613a6.getClass();
                    switch (strM16613a6) {
                        case "length":
                            iM16616g0 = c15360h0.m16616g0();
                            continue;
                            break;
                        case "filename":
                            strM16602N30 = c15360h0.m16602N0();
                            continue;
                            break;
                        case "attachment_type":
                            strM16602N31 = c15360h0.m16602N0();
                            continue;
                            break;
                        case "type":
                            enumC15361h1 = (EnumC15361h1) c15360h0.m16601J0(interfaceC15127H, new C15324c(8));
                            continue;
                            break;
                        case "content_type":
                            strM16602N29 = c15360h0.m16602N0();
                            break;
                        default:
                            if (map4 == null) {
                                map4 = new HashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, map4, strM16613a6);
                            break;
                    }
                }
                if (enumC15361h1 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                    interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Missing required field \"type\"", illegalStateException);
                    throw illegalStateException;
                }
                C15326c1 c15326c1 = new C15326c1(enumC15361h1, iM16616g0, strM16602N29, strM16602N30, strM16602N31);
                c15326c1.f47874s0 = map4;
                c15360h0.m16618k();
                return c15326c1;
            case 7:
                c15360h0.m16614e();
                C15347d1 c15347d1 = new C15347d1();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a7 = c15360h0.m16613a0();
                    strM16613a7.getClass();
                    switch (strM16613a7) {
                        case "fingerprint":
                            List list3 = (List) c15360h0.m16600H0();
                            if (list3 != null) {
                                c15347d1.f47921I0 = list3;
                            } else {
                                continue;
                            }
                            break;
                        case "threads":
                            c15360h0.m16614e();
                            c15360h0.m16613a0();
                            c15347d1.f47917E0 = new C12910A(c15360h0.m16617j0(interfaceC15127H, new C15334b(28)));
                            c15360h0.m16618k();
                            continue;
                            break;
                        case "logger":
                            c15347d1.f47916D0 = c15360h0.m16602N0();
                            continue;
                            break;
                        case "timestamp":
                            Date dateM16598E4 = c15360h0.m16598E(interfaceC15127H);
                            if (dateM16598E4 != null) {
                                c15347d1.f47914B0 = dateM16598E4;
                            } else {
                                continue;
                            }
                            break;
                        case "level":
                            c15347d1.f47919G0 = (EnumC15375i1) c15360h0.m16601J0(interfaceC15127H, new C15324c(9));
                            continue;
                            break;
                        case "message":
                            c15347d1.f47915C0 = (C15438k) c15360h0.m16601J0(interfaceC15127H, new C15334b(15));
                            break;
                        case "modules":
                            c15347d1.f47923K0 = AbstractC8453B3.m9064a((Map) c15360h0.m16600H0());
                            break;
                        case "exception":
                            c15360h0.m16614e();
                            c15360h0.m16613a0();
                            c15347d1.f47918F0 = new C12910A(c15360h0.m16617j0(interfaceC15127H, new C15334b(21)));
                            c15360h0.m16618k();
                            break;
                        case "transaction":
                            c15347d1.f47920H0 = c15360h0.m16602N0();
                            break;
                        default:
                            if (!AbstractC8662k3.m9354e(c15347d1, strM16613a7, c15360h0, interfaceC15127H)) {
                                if (concurrentHashMap8 == null) {
                                    concurrentHashMap8 = new ConcurrentHashMap();
                                }
                                c15360h0.m16607V0(interfaceC15127H, concurrentHashMap8, strM16613a7);
                                break;
                            }
                            break;
                    }
                }
                c15347d1.f47922J0 = concurrentHashMap8;
                c15360h0.m16618k();
                return c15347d1;
            case 8:
                return EnumC15361h1.valueOfLabel(c15360h0.m16622x().toLowerCase(Locale.ROOT));
            case 9:
                return EnumC15375i1.valueOf(c15360h0.m16622x().toUpperCase(Locale.ROOT));
            case 10:
                C15396j1 c15396j1 = new C15396j1();
                c15360h0.m16614e();
                ConcurrentHashMap concurrentHashMap9 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a8 = c15360h0.m16613a0();
                    strM16613a8.getClass();
                    switch (strM16613a8) {
                        case "package_name":
                            c15396j1.f47992o0 = c15360h0.m16602N0();
                            break;
                        case "thread_id":
                            c15396j1.f47994q0 = c15360h0.m16620r0();
                            break;
                        case "address":
                            c15396j1.f47991Z = c15360h0.m16602N0();
                            break;
                        case "class_name":
                            c15396j1.f47993p0 = c15360h0.m16602N0();
                            break;
                        case "type":
                            c15396j1.f47990Y = c15360h0.m16616g0();
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap9, strM16613a8);
                            break;
                    }
                }
                c15396j1.f47995r0 = concurrentHashMap9;
                c15360h0.m16618k();
                return c15396j1;
            case 11:
                C15108A1 c15108a1 = new C15108A1();
                c15360h0.m16614e();
                EnumC15527z1 enumC15527z1 = null;
                Date dateM16598E5 = null;
                HashMap map5 = null;
                C15447t c15447t3 = null;
                Date dateM16598E6 = null;
                List list4 = null;
                List list5 = null;
                List list6 = null;
                String strM16602N32 = null;
                Integer numM16608W4 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a9 = c15360h0.m16613a0();
                    strM16613a9.getClass();
                    switch (strM16613a9) {
                        case "replay_id":
                            c15447t3 = (C15447t) c15360h0.m16601J0(interfaceC15127H, new C15334b(22));
                            continue;
                            break;
                        case "replay_start_timestamp":
                            dateM16598E6 = c15360h0.m16598E(interfaceC15127H);
                            continue;
                            break;
                        case "type":
                            strM16602N32 = c15360h0.m16602N0();
                            continue;
                            break;
                        case "urls":
                            list4 = (List) c15360h0.m16600H0();
                            continue;
                            break;
                        case "timestamp":
                            dateM16598E5 = c15360h0.m16598E(interfaceC15127H);
                            continue;
                            break;
                        case "error_ids":
                            list5 = (List) c15360h0.m16600H0();
                            continue;
                            break;
                        case "trace_ids":
                            list6 = (List) c15360h0.m16600H0();
                            continue;
                            break;
                        case "replay_type":
                            enumC15527z1 = (EnumC15527z1) c15360h0.m16601J0(interfaceC15127H, new C15324c(12));
                            continue;
                            break;
                        case "segment_id":
                            numM16608W4 = c15360h0.m16608W();
                            break;
                        default:
                            if (!AbstractC8662k3.m9354e(c15108a1, strM16613a9, c15360h0, interfaceC15127H)) {
                                if (map5 == null) {
                                    map5 = new HashMap();
                                }
                                c15360h0.m16607V0(interfaceC15127H, map5, strM16613a9);
                                break;
                            }
                            break;
                    }
                }
                c15360h0.m16618k();
                if (strM16602N32 != null) {
                    c15108a1.f47007C0 = strM16602N32;
                }
                if (enumC15527z1 != null) {
                    c15108a1.f47008D0 = enumC15527z1;
                }
                if (numM16608W4 != null) {
                    c15108a1.f47010F0 = numM16608W4.intValue();
                }
                if (dateM16598E5 != null) {
                    c15108a1.f47011G0 = dateM16598E5;
                }
                c15108a1.f47009E0 = c15447t3;
                c15108a1.f47012H0 = dateM16598E6;
                c15108a1.f47013I0 = list4;
                c15108a1.f47014J0 = list5;
                c15108a1.f47015K0 = list6;
                c15108a1.f47016L0 = map5;
                return c15108a1;
            case 12:
                return EnumC15527z1.valueOf(c15360h0.m16622x().toUpperCase(Locale.ROOT));
            case 13:
                c15360h0.m16614e();
                EnumC15129H1 enumC15129H1ValueOf = null;
                String strM16602N33 = null;
                UUID uuidFromString = null;
                Date dateM16598E7 = null;
                Date dateM16598E8 = null;
                Integer numM16608W5 = null;
                ConcurrentHashMap concurrentHashMap10 = null;
                Boolean boolM16619m5 = null;
                Long lM16620r4 = null;
                Double dM16604P3 = null;
                String strM16602N34 = null;
                String strM16602N35 = null;
                String strM16602N36 = null;
                String strM16602N37 = null;
                String strM16602N38 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a10 = c15360h0.m16613a0();
                    strM16613a10.getClass();
                    switch (strM16613a10) {
                        case "duration":
                            str = str4;
                            dM16604P3 = c15360h0.m16604P();
                            break;
                        case "started":
                            str = str4;
                            dateM16598E7 = c15360h0.m16598E(interfaceC15127H);
                            break;
                        case "errors":
                            str = str4;
                            numM16608W5 = c15360h0.m16608W();
                            break;
                        case "status":
                            str = str4;
                            concurrentHashMap = concurrentHashMap10;
                            String strM16687a = AbstractC15503h.m16687a(c15360h0.m16602N0());
                            if (strM16687a != null) {
                                enumC15129H1ValueOf = EnumC15129H1.valueOf(strM16687a);
                            }
                            concurrentHashMap10 = concurrentHashMap;
                            break;
                        case "did":
                            str = str4;
                            strM16602N33 = c15360h0.m16602N0();
                            break;
                        case "seq":
                            str = str4;
                            lM16620r4 = c15360h0.m16620r0();
                            break;
                        case "sid":
                            str = str4;
                            concurrentHashMap = concurrentHashMap10;
                            try {
                                strM16602N0 = c15360h0.m16602N0();
                                try {
                                    uuidFromString = UUID.fromString(strM16602N0);
                                } catch (IllegalArgumentException unused) {
                                    interfaceC15127H.mo16298o(EnumC15375i1.ERROR, "%s sid is not valid.", strM16602N0);
                                }
                                break;
                            } catch (IllegalArgumentException unused2) {
                                strM16602N0 = null;
                            }
                            concurrentHashMap10 = concurrentHashMap;
                            break;
                        case "init":
                            str = str4;
                            boolM16619m5 = c15360h0.m16619m();
                            break;
                        case "timestamp":
                            str = str4;
                            dateM16598E8 = c15360h0.m16598E(interfaceC15127H);
                            break;
                        case "attrs":
                            c15360h0.m16614e();
                            while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                                String strM16613a11 = c15360h0.m16613a0();
                                strM16613a11.getClass();
                                switch (strM16613a11.hashCode()) {
                                    case -85904877:
                                        b11 = strM16613a11.equals(str4) ? (byte) 0 : (byte) -1;
                                        break;
                                    case 1090594823:
                                        b11 = strM16613a11.equals("release") ? (byte) 1 : (byte) -1;
                                        break;
                                    case 1480014044:
                                        b11 = strM16613a11.equals("ip_address") ? (byte) 2 : (byte) -1;
                                        break;
                                    case 1917799825:
                                        b11 = strM16613a11.equals("user_agent") ? (byte) 3 : (byte) -1;
                                        break;
                                    default:
                                        b11 = -1;
                                        break;
                                }
                                switch (b11) {
                                    case 0:
                                        str2 = str4;
                                        concurrentHashMap2 = concurrentHashMap10;
                                        strM16602N36 = c15360h0.m16602N0();
                                        break;
                                    case 1:
                                        str2 = str4;
                                        concurrentHashMap2 = concurrentHashMap10;
                                        strM16602N37 = c15360h0.m16602N0();
                                        break;
                                    case 2:
                                        str2 = str4;
                                        concurrentHashMap2 = concurrentHashMap10;
                                        strM16602N34 = c15360h0.m16602N0();
                                        break;
                                    case 3:
                                        str2 = str4;
                                        concurrentHashMap2 = concurrentHashMap10;
                                        strM16602N35 = c15360h0.m16602N0();
                                        break;
                                    default:
                                        switch (c15360h0.f47947Y) {
                                            case 0:
                                                int i14 = 0;
                                                while (true) {
                                                    C15513a c15513a = (C15513a) c15360h0.f47948Z;
                                                    int iM16716m = c15513a.f48449t0;
                                                    if (iM16716m == 0) {
                                                        iM16716m = c15513a.m16716m();
                                                    }
                                                    concurrentHashMap2 = concurrentHashMap10;
                                                    if (iM16716m == 3) {
                                                        i10 = 1;
                                                        c15513a.m16698H0(1);
                                                        i14++;
                                                        str2 = str4;
                                                    } else {
                                                        i10 = 1;
                                                        if (iM16716m == 1) {
                                                            str2 = str4;
                                                            c15513a.m16698H0(3);
                                                            i14++;
                                                        } else {
                                                            str2 = str4;
                                                            if (iM16716m == 4) {
                                                                c15513a.f48454y0--;
                                                                i14--;
                                                            } else if (iM16716m == 2) {
                                                                c15513a.f48454y0--;
                                                                i14--;
                                                                i11 = 1;
                                                            } else {
                                                                if (iM16716m == 14 || iM16716m == 10) {
                                                                    while (true) {
                                                                        int i15 = 0;
                                                                        while (true) {
                                                                            int i16 = c15513a.f48445p0 + i15;
                                                                            if (i16 < c15513a.f48446q0) {
                                                                                char c10 = c15513a.f48444o0[i16];
                                                                                if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                                                                                    if (c10 != '#') {
                                                                                        if (c10 != ',') {
                                                                                            if (c10 != '/' && c10 != '=') {
                                                                                                if (c10 != '{' && c10 != '}' && c10 != ':') {
                                                                                                    if (c10 != ';') {
                                                                                                        switch (c10) {
                                                                                                            case '[':
                                                                                                            case ']':
                                                                                                                break;
                                                                                                            case '\\':
                                                                                                                break;
                                                                                                            default:
                                                                                                                i15++;
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    c15513a.m16715k();
                                                                                }
                                                                                c15513a.f48445p0 += i15;
                                                                            } else {
                                                                                c15513a.f48445p0 = i16;
                                                                                i11 = 1;
                                                                                if (!c15513a.m16703S(1)) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (iM16716m == 8 || iM16716m == 12) {
                                                                    c15513a.m16700N0('\'');
                                                                } else if (iM16716m == 9 || iM16716m == 13) {
                                                                    c15513a.m16700N0('\"');
                                                                } else if (iM16716m == 16) {
                                                                    c15513a.f48445p0 += c15513a.f48451v0;
                                                                }
                                                                i11 = 1;
                                                            }
                                                            c15513a.f48449t0 = 0;
                                                            if (i14 == 0) {
                                                                int[] iArr = c15513a.f48441A0;
                                                                int i17 = c15513a.f48454y0 - i11;
                                                                iArr[i17] = iArr[i17] + i11;
                                                                c15513a.f48455z0[i17] = "null";
                                                            } else {
                                                                concurrentHashMap10 = concurrentHashMap2;
                                                                str4 = str2;
                                                            }
                                                        }
                                                    }
                                                    i11 = i10;
                                                    c15513a.f48449t0 = 0;
                                                    if (i14 == 0) {
                                                        int[] iArr2 = c15513a.f48441A0;
                                                        int i18 = c15513a.f48454y0 - i11;
                                                        iArr2[i18] = iArr2[i18] + i11;
                                                        c15513a.f48455z0[i18] = "null";
                                                    } else {
                                                        concurrentHashMap10 = concurrentHashMap2;
                                                        str4 = str2;
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                str2 = str4;
                                                concurrentHashMap2 = concurrentHashMap10;
                                                break;
                                        }
                                        break;
                                }
                                concurrentHashMap10 = concurrentHashMap2;
                                str4 = str2;
                            }
                            str = str4;
                            c15360h0.m16618k();
                            break;
                        case "abnormal_mechanism":
                            strM16602N38 = c15360h0.m16602N0();
                            str = str4;
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap10, strM16613a10);
                            str = str4;
                            break;
                    }
                    str4 = str;
                }
                ConcurrentHashMap concurrentHashMap11 = concurrentHashMap10;
                if (enumC15129H1ValueOf == null) {
                    throw m16532c("status", interfaceC15127H);
                }
                if (dateM16598E7 == null) {
                    throw m16532c("started", interfaceC15127H);
                }
                if (numM16608W5 == null) {
                    throw m16532c("errors", interfaceC15127H);
                }
                if (strM16602N37 == null) {
                    throw m16532c("release", interfaceC15127H);
                }
                C15132I1 c15132i1 = new C15132I1(enumC15129H1ValueOf, dateM16598E7, dateM16598E8, numM16608W5.intValue(), strM16602N33, uuidFromString, boolM16619m5, lM16620r4, dM16604P3, strM16602N34, strM16602N35, strM16602N36, strM16602N37, strM16602N38);
                c15132i1.f47098B0 = concurrentHashMap11;
                c15360h0.m16618k();
                return c15132i1;
            case 14:
                return m16531b(c15360h0, interfaceC15127H);
            case 15:
                return new C15144M1(c15360h0.m16622x());
            case 16:
                return EnumC15147N1.valueOf(c15360h0.m16622x().toUpperCase(Locale.ROOT));
            case 17:
                c15360h0.m16614e();
                C15156Q1 c15156q1 = null;
                ConcurrentHashMap concurrentHashMap12 = null;
                String strM16602N39 = null;
                String strM16602N40 = null;
                String strM16622x = null;
                C15447t c15447t4 = null;
                String strM16602N41 = null;
                String strM16602N42 = null;
                String strM16602N43 = null;
                String strM16602N44 = null;
                String strM16602N45 = null;
                C15447t c15447t5 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a12 = c15360h0.m16613a0();
                    strM16613a12.getClass();
                    switch (strM16613a12) {
                        case "user_segment":
                            strM16602N40 = c15360h0.m16602N0();
                            break;
                        case "replay_id":
                            c15447t5 = new C15447t(c15360h0.m16622x());
                            break;
                        case "user_id":
                            strM16602N39 = c15360h0.m16602N0();
                            break;
                        case "environment":
                            strM16602N42 = c15360h0.m16602N0();
                            break;
                        case "user":
                            c15156q1 = (C15156Q1) c15360h0.m16601J0(interfaceC15127H, new C15324c(18));
                            break;
                        case "sample_rate":
                            strM16602N44 = c15360h0.m16602N0();
                            break;
                        case "release":
                            strM16602N41 = c15360h0.m16602N0();
                            break;
                        case "trace_id":
                            c15447t4 = new C15447t(c15360h0.m16622x());
                            break;
                        case "sampled":
                            strM16602N45 = c15360h0.m16602N0();
                            break;
                        case "public_key":
                            strM16622x = c15360h0.m16622x();
                            break;
                        case "transaction":
                            strM16602N43 = c15360h0.m16602N0();
                            break;
                        default:
                            if (concurrentHashMap12 == null) {
                                concurrentHashMap12 = new ConcurrentHashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, concurrentHashMap12, strM16613a12);
                            break;
                    }
                }
                if (c15447t4 == null) {
                    throw m16533d("trace_id", interfaceC15127H);
                }
                if (strM16622x == null) {
                    throw m16533d("public_key", interfaceC15127H);
                }
                if (c15156q1 == null) {
                    str3 = strM16602N40;
                } else {
                    if (strM16602N39 == null) {
                        strM16602N39 = c15156q1.f47179a;
                    }
                    if (strM16602N40 == null) {
                        str3 = c15156q1.f47180b;
                    } else {
                        str3 = strM16602N40;
                    }
                }
                C15158R1 c15158r2 = new C15158R1(c15447t4, strM16622x, strM16602N41, strM16602N42, strM16602N39, str3, strM16602N43, strM16602N44, strM16602N45, c15447t5);
                c15158r2.f47192w0 = concurrentHashMap12;
                c15360h0.m16618k();
                return c15158r2;
            case 18:
                c15360h0.m16614e();
                String strM16602N46 = null;
                String strM16602N47 = null;
                ConcurrentHashMap concurrentHashMap13 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a13 = c15360h0.m16613a0();
                    strM16613a13.getClass();
                    if (strM16613a13.equals(ParameterNames.f31999ID)) {
                        strM16602N47 = c15360h0.m16602N0();
                    } else if (strM16613a13.equals("segment")) {
                        strM16602N46 = c15360h0.m16602N0();
                    } else {
                        if (concurrentHashMap13 == null) {
                            concurrentHashMap13 = new ConcurrentHashMap();
                        }
                        ConcurrentHashMap concurrentHashMap14 = concurrentHashMap13;
                        c15360h0.m16607V0(interfaceC15127H, concurrentHashMap14, strM16613a13);
                        concurrentHashMap13 = concurrentHashMap14;
                    }
                }
                C15156Q1 c15156q2 = new C15156Q1();
                c15156q2.f47179a = strM16602N47;
                c15156q2.f47180b = strM16602N46;
                c15360h0.m16618k();
                return c15156q2;
            default:
                c15360h0.m16614e();
                C15447t c15447t6 = null;
                String strM16602N48 = null;
                String strM16602N49 = null;
                String strM16602N50 = null;
                HashMap map6 = null;
                while (c15360h0.m16610X0() == EnumC15514b.NAME) {
                    String strM16613a14 = c15360h0.m16613a0();
                    strM16613a14.getClass();
                    switch (strM16613a14) {
                        case "comments":
                            strM16602N50 = c15360h0.m16602N0();
                            break;
                        case "name":
                            strM16602N48 = c15360h0.m16602N0();
                            break;
                        case "email":
                            strM16602N49 = c15360h0.m16602N0();
                            break;
                        case "event_id":
                            c15447t6 = new C15447t(c15360h0.m16622x());
                            break;
                        default:
                            if (map6 == null) {
                                map6 = new HashMap();
                            }
                            c15360h0.m16607V0(interfaceC15127H, map6, strM16613a14);
                            break;
                    }
                }
                c15360h0.m16618k();
                if (c15447t6 != null) {
                    C15173W1 c15173w1 = new C15173W1(c15447t6, strM16602N48, strM16602N49, strM16602N50);
                    c15173w1.f47237q0 = map6;
                    return c15173w1;
                }
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"event_id\"");
                interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Missing required field \"event_id\"", illegalStateException2);
                throw illegalStateException2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C15138K1 m16531b(C15360h0 c15360h0, InterfaceC15127H interfaceC15127H) throws IOException {
        String str;
        c15360h0.m16614e();
        String strM16622x = null;
        C15447t c15447t = null;
        C15144M1 c15144m1 = null;
        C15144M1 c15144m2 = null;
        ConcurrentHashMap concurrentHashMap = null;
        String strM16622x2 = null;
        EnumC15147N1 enumC15147N1 = null;
        String strM16622x3 = null;
        ConcurrentHashMap concurrentHashMapM9064a = null;
        while (c15360h0.m16610X0() == EnumC15514b.NAME) {
            String strM16613a0 = c15360h0.m16613a0();
            strM16613a0.getClass();
            byte b = -1;
            switch (strM16613a0.hashCode()) {
                case -2011840976:
                    if (strM16613a0.equals("span_id")) {
                        b = 0;
                    }
                    break;
                case -1757797477:
                    if (strM16613a0.equals(EhBykzn.QwMTAV)) {
                        b = 1;
                    }
                    break;
                case -1724546052:
                    if (strM16613a0.equals("description")) {
                        b = 2;
                    }
                    break;
                case -1008619738:
                    if (strM16613a0.equals("origin")) {
                        b = 3;
                    }
                    break;
                case -892481550:
                    if (strM16613a0.equals("status")) {
                        b = 4;
                    }
                    break;
                case 3553:
                    if (strM16613a0.equals(EhBykzn.MySZLLbHVkI)) {
                        b = 5;
                    }
                    break;
                case 3552281:
                    if (strM16613a0.equals("tags")) {
                        b = 6;
                    }
                    break;
                case 1270300245:
                    if (strM16613a0.equals("trace_id")) {
                        b = 7;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    c15144m1 = new C15144M1(c15360h0.m16622x());
                    break;
                case 1:
                    c15144m2 = (C15144M1) c15360h0.m16601J0(interfaceC15127H, new C15324c(15));
                    break;
                case 2:
                    strM16622x2 = c15360h0.m16622x();
                    break;
                case 3:
                    strM16622x3 = c15360h0.m16622x();
                    break;
                case 4:
                    enumC15147N1 = (EnumC15147N1) c15360h0.m16601J0(interfaceC15127H, new C15324c(16));
                    break;
                case 5:
                    strM16622x = c15360h0.m16622x();
                    break;
                case 6:
                    concurrentHashMapM9064a = AbstractC8453B3.m9064a((Map) c15360h0.m16600H0());
                    break;
                case 7:
                    c15447t = new C15447t(c15360h0.m16622x());
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c15360h0.m16607V0(interfaceC15127H, concurrentHashMap, strM16613a0);
                    break;
            }
        }
        if (c15447t != null) {
            if (c15144m1 != null) {
                if (strM16622x == null) {
                    str = "";
                } else {
                    str = strM16622x;
                }
                C15138K1 c15138k1 = new C15138K1(c15447t, c15144m1, str, c15144m2, null);
                c15138k1.f47149r0 = strM16622x2;
                c15138k1.f47150s0 = enumC15147N1;
                c15138k1.f47152u0 = strM16622x3;
                if (concurrentHashMapM9064a != null) {
                    c15138k1.f47151t0 = concurrentHashMapM9064a;
                }
                c15138k1.f47153v0 = concurrentHashMap;
                c15360h0.m16618k();
                return c15138k1;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"span_id\"");
            interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Missing required field \"span_id\"", illegalStateException);
            throw illegalStateException;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"trace_id\"");
        interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Missing required field \"trace_id\"", illegalStateException2);
        throw illegalStateException2;
    }
}
