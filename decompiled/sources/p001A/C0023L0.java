package p001A;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import io.sentry.hints.C15370i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p003A1.AbstractC0168G;
import p028B.C0694a;
import p028B.C0703j;
import p028B.C0710q;
import p053C.InterfaceC1468c;
import p079D.AbstractC1762b;
import p1138z.C21572a;
import p117Eb.C2392v;
import p167Gb.C3032c;
import p178H.C3165q;
import p178H.C3175v;
import p228J.C3815Q;
import p228J.C3824a;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3836g;
import p228J.C3838h;
import p228J.C3840i;
import p228J.C3871x0;
import p228J.EnumC3804G0;
import p228J.EnumC3873y0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3816S;
import p253K.AbstractC4491b;
import p253K.C4493d;
import p283L5.AbstractC4941g;
import p391Q.AbstractC6542b;
import p514V.C7731e;
import p523V9.AbstractC8054b4;
import p523V9.AbstractC8072d6;
import p571X9.AbstractC9306j0;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p720e6.C13287b;

/* JADX INFO: renamed from: A.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0023L0 {

    /* JADX INFO: renamed from: i */
    public final String f127i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC0058e f128j;

    /* JADX INFO: renamed from: k */
    public final C0703j f129k;

    /* JADX INFO: renamed from: l */
    public final C13287b f130l;

    /* JADX INFO: renamed from: m */
    public final int f131m;

    /* JADX INFO: renamed from: n */
    public final boolean f132n;

    /* JADX INFO: renamed from: o */
    public final boolean f133o;

    /* JADX INFO: renamed from: p */
    public final boolean f134p;

    /* JADX INFO: renamed from: q */
    public final boolean f135q;

    /* JADX INFO: renamed from: r */
    public final boolean f136r;

    /* JADX INFO: renamed from: s */
    public C3840i f137s;

    /* JADX INFO: renamed from: u */
    public final C0089t0 f139u;

    /* JADX INFO: renamed from: x */
    public final C0093v0 f142x;

    /* JADX INFO: renamed from: a */
    public final ArrayList f119a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f120b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f121c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f122d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashMap f123e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final ArrayList f124f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f125g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final ArrayList f126h = new ArrayList();

    /* JADX INFO: renamed from: t */
    public final ArrayList f138t = new ArrayList();

    /* JADX INFO: renamed from: v */
    public final C15370i f140v = new C15370i(4);

    /* JADX INFO: renamed from: w */
    public final C3032c f141w = new C3032c(7);

    public C0023L0(Context context, String str, C0710q c0710q, InterfaceC0058e interfaceC0058e) throws C3165q {
        List listSingletonList;
        int[] outputFormats;
        long[] jArr;
        int[] iArr;
        boolean z6;
        this.f132n = false;
        this.f133o = false;
        this.f134p = false;
        this.f135q = false;
        this.f136r = false;
        str.getClass();
        this.f127i = str;
        interfaceC0058e.getClass();
        this.f128j = interfaceC0058e;
        this.f130l = new C13287b(7);
        this.f139u = C0089t0.m316b(context);
        try {
            C0703j c0703jM1481b = c0710q.m1481b(str);
            this.f129k = c0703jM1481b;
            Integer num = (Integer) c0703jM1481b.m1476a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f131m = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) c0703jM1481b.m1476a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i10 : iArr2) {
                    if (i10 == 3) {
                        this.f132n = true;
                    } else if (i10 == 6) {
                        this.f133o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i10 == 16) {
                        this.f136r = true;
                    }
                }
            }
            this.f142x = new C0093v0(this.f129k);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C3871x0 c3871x0 = new C3871x0();
            EnumC3873y0 enumC3873y0 = EnumC3873y0.MAXIMUM;
            AbstractC0010F.m22f(1, enumC3873y0, 0L, c3871x0);
            C3871x0 c3871x0M18b = AbstractC0010F.m18b(arrayList2, c3871x0);
            AbstractC0010F.m22f(3, enumC3873y0, 0L, c3871x0M18b);
            C3871x0 c3871x0M18b2 = AbstractC0010F.m18b(arrayList2, c3871x0M18b);
            AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b2);
            C3871x0 c3871x0M18b3 = AbstractC0010F.m18b(arrayList2, c3871x0M18b2);
            EnumC3873y0 enumC3873y1 = EnumC3873y0.PREVIEW;
            c3871x0M18b3.m4594a(new C3838h(1, enumC3873y1, 0L));
            AbstractC0010F.m22f(3, enumC3873y0, 0L, c3871x0M18b3);
            C3871x0 c3871x0M18b4 = AbstractC0010F.m18b(arrayList2, c3871x0M18b3);
            c3871x0M18b4.m4594a(new C3838h(2, enumC3873y1, 0L));
            AbstractC0010F.m22f(3, enumC3873y0, 0L, c3871x0M18b4);
            C3871x0 c3871x0M18b5 = AbstractC0010F.m18b(arrayList2, c3871x0M18b4);
            c3871x0M18b5.m4594a(new C3838h(1, enumC3873y1, 0L));
            AbstractC0010F.m22f(1, enumC3873y1, 0L, c3871x0M18b5);
            C3871x0 c3871x0M18b6 = AbstractC0010F.m18b(arrayList2, c3871x0M18b5);
            c3871x0M18b6.m4594a(new C3838h(1, enumC3873y1, 0L));
            AbstractC0010F.m22f(2, enumC3873y1, 0L, c3871x0M18b6);
            C3871x0 c3871x0M18b7 = AbstractC0010F.m18b(arrayList2, c3871x0M18b6);
            c3871x0M18b7.m4594a(new C3838h(1, enumC3873y1, 0L));
            c3871x0M18b7.m4594a(new C3838h(2, enumC3873y1, 0L));
            AbstractC0010F.m22f(3, enumC3873y0, 0L, c3871x0M18b7);
            arrayList2.add(c3871x0M18b7);
            arrayList.addAll(arrayList2);
            int i11 = this.f131m;
            EnumC3873y0 enumC3873y2 = EnumC3873y0.RECORD;
            if (i11 == 0 || i11 == 1 || i11 == 3) {
                ArrayList arrayList3 = new ArrayList();
                C3871x0 c3871x1 = new C3871x0();
                c3871x1.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(1, enumC3873y2, 0L, c3871x1);
                C3871x0 c3871x0M18b8 = AbstractC0010F.m18b(arrayList3, c3871x1);
                c3871x0M18b8.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y2, 0L, c3871x0M18b8);
                C3871x0 c3871x0M18b9 = AbstractC0010F.m18b(arrayList3, c3871x0M18b8);
                c3871x0M18b9.m4594a(new C3838h(2, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y2, 0L, c3871x0M18b9);
                C3871x0 c3871x0M18b10 = AbstractC0010F.m18b(arrayList3, c3871x0M18b9);
                c3871x0M18b10.m4594a(new C3838h(1, enumC3873y1, 0L));
                c3871x0M18b10.m4594a(new C3838h(1, enumC3873y2, 0L));
                AbstractC0010F.m22f(3, enumC3873y2, 0L, c3871x0M18b10);
                C3871x0 c3871x0M18b11 = AbstractC0010F.m18b(arrayList3, c3871x0M18b10);
                c3871x0M18b11.m4594a(new C3838h(1, enumC3873y1, 0L));
                c3871x0M18b11.m4594a(new C3838h(2, enumC3873y2, 0L));
                AbstractC0010F.m22f(3, enumC3873y2, 0L, c3871x0M18b11);
                C3871x0 c3871x0M18b12 = AbstractC0010F.m18b(arrayList3, c3871x0M18b11);
                c3871x0M18b12.m4594a(new C3838h(2, enumC3873y1, 0L));
                c3871x0M18b12.m4594a(new C3838h(2, enumC3873y1, 0L));
                AbstractC0010F.m22f(3, enumC3873y0, 0L, c3871x0M18b12);
                arrayList3.add(c3871x0M18b12);
                arrayList.addAll(arrayList3);
            }
            EnumC3873y0 enumC3873y3 = EnumC3873y0.VGA;
            if (i11 == 1 || i11 == 3) {
                ArrayList arrayList4 = new ArrayList();
                C3871x0 c3871x2 = new C3871x0();
                c3871x2.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(1, enumC3873y0, 0L, c3871x2);
                C3871x0 c3871x0M18b13 = AbstractC0010F.m18b(arrayList4, c3871x2);
                c3871x0M18b13.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b13);
                C3871x0 c3871x0M18b14 = AbstractC0010F.m18b(arrayList4, c3871x0M18b13);
                c3871x0M18b14.m4594a(new C3838h(2, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b14);
                C3871x0 c3871x0M18b15 = AbstractC0010F.m18b(arrayList4, c3871x0M18b14);
                c3871x0M18b15.m4594a(new C3838h(1, enumC3873y1, 0L));
                c3871x0M18b15.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(3, enumC3873y0, 0L, c3871x0M18b15);
                C3871x0 c3871x0M18b16 = AbstractC0010F.m18b(arrayList4, c3871x0M18b15);
                c3871x0M18b16.m4594a(new C3838h(2, enumC3873y3, 0L));
                c3871x0M18b16.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b16);
                C3871x0 c3871x0M18b17 = AbstractC0010F.m18b(arrayList4, c3871x0M18b16);
                c3871x0M18b17.m4594a(new C3838h(2, enumC3873y3, 0L));
                c3871x0M18b17.m4594a(new C3838h(2, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b17);
                arrayList4.add(c3871x0M18b17);
                arrayList.addAll(arrayList4);
            }
            if (this.f132n) {
                ArrayList arrayList5 = new ArrayList();
                C3871x0 c3871x3 = new C3871x0();
                AbstractC0010F.m22f(5, enumC3873y0, 0L, c3871x3);
                C3871x0 c3871x0M18b18 = AbstractC0010F.m18b(arrayList5, c3871x3);
                c3871x0M18b18.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(5, enumC3873y0, 0L, c3871x0M18b18);
                C3871x0 c3871x0M18b19 = AbstractC0010F.m18b(arrayList5, c3871x0M18b18);
                c3871x0M18b19.m4594a(new C3838h(2, enumC3873y1, 0L));
                AbstractC0010F.m22f(5, enumC3873y0, 0L, c3871x0M18b19);
                C3871x0 c3871x0M18b20 = AbstractC0010F.m18b(arrayList5, c3871x0M18b19);
                c3871x0M18b20.m4594a(new C3838h(1, enumC3873y1, 0L));
                c3871x0M18b20.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(5, enumC3873y0, 0L, c3871x0M18b20);
                C3871x0 c3871x0M18b21 = AbstractC0010F.m18b(arrayList5, c3871x0M18b20);
                c3871x0M18b21.m4594a(new C3838h(1, enumC3873y1, 0L));
                c3871x0M18b21.m4594a(new C3838h(2, enumC3873y1, 0L));
                AbstractC0010F.m22f(5, enumC3873y0, 0L, c3871x0M18b21);
                C3871x0 c3871x0M18b22 = AbstractC0010F.m18b(arrayList5, c3871x0M18b21);
                c3871x0M18b22.m4594a(new C3838h(2, enumC3873y1, 0L));
                c3871x0M18b22.m4594a(new C3838h(2, enumC3873y1, 0L));
                AbstractC0010F.m22f(5, enumC3873y0, 0L, c3871x0M18b22);
                C3871x0 c3871x0M18b23 = AbstractC0010F.m18b(arrayList5, c3871x0M18b22);
                c3871x0M18b23.m4594a(new C3838h(1, enumC3873y1, 0L));
                c3871x0M18b23.m4594a(new C3838h(3, enumC3873y0, 0L));
                AbstractC0010F.m22f(5, enumC3873y0, 0L, c3871x0M18b23);
                C3871x0 c3871x0M18b24 = AbstractC0010F.m18b(arrayList5, c3871x0M18b23);
                c3871x0M18b24.m4594a(new C3838h(2, enumC3873y1, 0L));
                c3871x0M18b24.m4594a(new C3838h(3, enumC3873y0, 0L));
                AbstractC0010F.m22f(5, enumC3873y0, 0L, c3871x0M18b24);
                arrayList5.add(c3871x0M18b24);
                arrayList.addAll(arrayList5);
            }
            if (this.f133o && i11 == 0) {
                ArrayList arrayList6 = new ArrayList();
                C3871x0 c3871x4 = new C3871x0();
                c3871x4.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(1, enumC3873y0, 0L, c3871x4);
                C3871x0 c3871x0M18b25 = AbstractC0010F.m18b(arrayList6, c3871x4);
                c3871x0M18b25.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b25);
                C3871x0 c3871x0M18b26 = AbstractC0010F.m18b(arrayList6, c3871x0M18b25);
                c3871x0M18b26.m4594a(new C3838h(2, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b26);
                arrayList6.add(c3871x0M18b26);
                arrayList.addAll(arrayList6);
            }
            if (i11 == 3) {
                ArrayList arrayList7 = new ArrayList();
                C3871x0 c3871x5 = new C3871x0();
                c3871x5.m4594a(new C3838h(1, enumC3873y1, 0L));
                c3871x5.m4594a(new C3838h(1, enumC3873y3, 0L));
                c3871x5.m4594a(new C3838h(2, enumC3873y0, 0L));
                AbstractC0010F.m22f(5, enumC3873y0, 0L, c3871x5);
                C3871x0 c3871x0M18b27 = AbstractC0010F.m18b(arrayList7, c3871x5);
                c3871x0M18b27.m4594a(new C3838h(1, enumC3873y1, 0L));
                c3871x0M18b27.m4594a(new C3838h(1, enumC3873y3, 0L));
                c3871x0M18b27.m4594a(new C3838h(3, enumC3873y0, 0L));
                AbstractC0010F.m22f(5, enumC3873y0, 0L, c3871x0M18b27);
                arrayList7.add(c3871x0M18b27);
                arrayList.addAll(arrayList7);
            }
            ArrayList arrayList8 = this.f119a;
            arrayList8.addAll(arrayList);
            if (((ExtraSupportedSurfaceCombinationsQuirk) this.f130l.f42000Z) == null) {
                listSingletonList = new ArrayList();
            } else {
                C3871x0 c3871x6 = ExtraSupportedSurfaceCombinationsQuirk.f32314a;
                String str2 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2)) {
                    ArrayList arrayList9 = new ArrayList();
                    listSingletonList = arrayList9;
                    if (this.f127i.equals("1")) {
                        arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.f32314a);
                        listSingletonList = arrayList9;
                    }
                } else {
                    listSingletonList = ((!"google".equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.f32316c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.m11180b()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.f32315b) : Collections.emptyList();
                }
            }
            arrayList8.addAll(listSingletonList);
            if (this.f136r) {
                ArrayList arrayList10 = new ArrayList();
                C3871x0 c3871x7 = new C3871x0();
                EnumC3873y0 enumC3873y4 = EnumC3873y0.ULTRA_MAXIMUM;
                c3871x7.m4594a(new C3838h(2, enumC3873y4, 0L));
                c3871x7.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(1, enumC3873y2, 0L, c3871x7);
                C3871x0 c3871x0M18b28 = AbstractC0010F.m18b(arrayList10, c3871x7);
                c3871x0M18b28.m4594a(new C3838h(3, enumC3873y4, 0L));
                c3871x0M18b28.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(1, enumC3873y2, 0L, c3871x0M18b28);
                C3871x0 c3871x0M18b29 = AbstractC0010F.m18b(arrayList10, c3871x0M18b28);
                c3871x0M18b29.m4594a(new C3838h(5, enumC3873y4, 0L));
                c3871x0M18b29.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(1, enumC3873y2, 0L, c3871x0M18b29);
                C3871x0 c3871x0M18b30 = AbstractC0010F.m18b(arrayList10, c3871x0M18b29);
                c3871x0M18b30.m4594a(new C3838h(2, enumC3873y4, 0L));
                c3871x0M18b30.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(3, enumC3873y0, 0L, c3871x0M18b30);
                C3871x0 c3871x0M18b31 = AbstractC0010F.m18b(arrayList10, c3871x0M18b30);
                c3871x0M18b31.m4594a(new C3838h(3, enumC3873y4, 0L));
                c3871x0M18b31.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(3, enumC3873y0, 0L, c3871x0M18b31);
                C3871x0 c3871x0M18b32 = AbstractC0010F.m18b(arrayList10, c3871x0M18b31);
                c3871x0M18b32.m4594a(new C3838h(5, enumC3873y4, 0L));
                c3871x0M18b32.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(3, enumC3873y0, 0L, c3871x0M18b32);
                C3871x0 c3871x0M18b33 = AbstractC0010F.m18b(arrayList10, c3871x0M18b32);
                c3871x0M18b33.m4594a(new C3838h(2, enumC3873y4, 0L));
                c3871x0M18b33.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b33);
                C3871x0 c3871x0M18b34 = AbstractC0010F.m18b(arrayList10, c3871x0M18b33);
                c3871x0M18b34.m4594a(new C3838h(3, enumC3873y4, 0L));
                c3871x0M18b34.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b34);
                C3871x0 c3871x0M18b35 = AbstractC0010F.m18b(arrayList10, c3871x0M18b34);
                c3871x0M18b35.m4594a(new C3838h(5, enumC3873y4, 0L));
                c3871x0M18b35.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b35);
                C3871x0 c3871x0M18b36 = AbstractC0010F.m18b(arrayList10, c3871x0M18b35);
                c3871x0M18b36.m4594a(new C3838h(2, enumC3873y4, 0L));
                c3871x0M18b36.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(5, enumC3873y0, 0L, c3871x0M18b36);
                C3871x0 c3871x0M18b37 = AbstractC0010F.m18b(arrayList10, c3871x0M18b36);
                c3871x0M18b37.m4594a(new C3838h(3, enumC3873y4, 0L));
                c3871x0M18b37.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(5, enumC3873y0, 0L, c3871x0M18b37);
                C3871x0 c3871x0M18b38 = AbstractC0010F.m18b(arrayList10, c3871x0M18b37);
                c3871x0M18b38.m4594a(new C3838h(5, enumC3873y4, 0L));
                c3871x0M18b38.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(5, enumC3873y0, 0L, c3871x0M18b38);
                arrayList10.add(c3871x0M18b38);
                this.f120b.addAll(arrayList10);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f134p = zHasSystemFeature;
            EnumC3873y0 enumC3873y5 = EnumC3873y0.s1440p;
            if (zHasSystemFeature) {
                ArrayList arrayList11 = new ArrayList();
                C3871x0 c3871x8 = new C3871x0();
                AbstractC0010F.m22f(2, enumC3873y5, 0L, c3871x8);
                C3871x0 c3871x0M18b39 = AbstractC0010F.m18b(arrayList11, c3871x8);
                AbstractC0010F.m22f(1, enumC3873y5, 0L, c3871x0M18b39);
                C3871x0 c3871x0M18b40 = AbstractC0010F.m18b(arrayList11, c3871x0M18b39);
                AbstractC0010F.m22f(3, enumC3873y5, 0L, c3871x0M18b40);
                C3871x0 c3871x0M18b41 = AbstractC0010F.m18b(arrayList11, c3871x0M18b40);
                EnumC3873y0 enumC3873y6 = EnumC3873y0.s720p;
                c3871x0M18b41.m4594a(new C3838h(2, enumC3873y6, 0L));
                AbstractC0010F.m22f(3, enumC3873y5, 0L, c3871x0M18b41);
                C3871x0 c3871x0M18b42 = AbstractC0010F.m18b(arrayList11, c3871x0M18b41);
                c3871x0M18b42.m4594a(new C3838h(1, enumC3873y6, 0L));
                AbstractC0010F.m22f(3, enumC3873y5, 0L, c3871x0M18b42);
                C3871x0 c3871x0M18b43 = AbstractC0010F.m18b(arrayList11, c3871x0M18b42);
                c3871x0M18b43.m4594a(new C3838h(2, enumC3873y6, 0L));
                AbstractC0010F.m22f(2, enumC3873y5, 0L, c3871x0M18b43);
                C3871x0 c3871x0M18b44 = AbstractC0010F.m18b(arrayList11, c3871x0M18b43);
                c3871x0M18b44.m4594a(new C3838h(2, enumC3873y6, 0L));
                AbstractC0010F.m22f(1, enumC3873y5, 0L, c3871x0M18b44);
                C3871x0 c3871x0M18b45 = AbstractC0010F.m18b(arrayList11, c3871x0M18b44);
                c3871x0M18b45.m4594a(new C3838h(1, enumC3873y6, 0L));
                AbstractC0010F.m22f(2, enumC3873y5, 0L, c3871x0M18b45);
                C3871x0 c3871x0M18b46 = AbstractC0010F.m18b(arrayList11, c3871x0M18b45);
                c3871x0M18b46.m4594a(new C3838h(1, enumC3873y6, 0L));
                AbstractC0010F.m22f(1, enumC3873y5, 0L, c3871x0M18b46);
                arrayList11.add(c3871x0M18b46);
                this.f121c.addAll(arrayList11);
            }
            if (this.f142x.f403Z) {
                ArrayList arrayList12 = new ArrayList();
                C3871x0 c3871x9 = new C3871x0();
                AbstractC0010F.m22f(1, enumC3873y0, 0L, c3871x9);
                C3871x0 c3871x0M18b47 = AbstractC0010F.m18b(arrayList12, c3871x9);
                AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b47);
                C3871x0 c3871x0M18b48 = AbstractC0010F.m18b(arrayList12, c3871x0M18b47);
                c3871x0M18b48.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(3, enumC3873y0, 0L, c3871x0M18b48);
                C3871x0 c3871x0M18b49 = AbstractC0010F.m18b(arrayList12, c3871x0M18b48);
                c3871x0M18b49.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b49);
                C3871x0 c3871x0M18b50 = AbstractC0010F.m18b(arrayList12, c3871x0M18b49);
                c3871x0M18b50.m4594a(new C3838h(2, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b50);
                C3871x0 c3871x0M18b51 = AbstractC0010F.m18b(arrayList12, c3871x0M18b50);
                c3871x0M18b51.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(1, enumC3873y2, 0L, c3871x0M18b51);
                C3871x0 c3871x0M18b52 = AbstractC0010F.m18b(arrayList12, c3871x0M18b51);
                c3871x0M18b52.m4594a(new C3838h(1, enumC3873y1, 0L));
                c3871x0M18b52.m4594a(new C3838h(1, enumC3873y2, 0L));
                AbstractC0010F.m22f(2, enumC3873y2, 0L, c3871x0M18b52);
                C3871x0 c3871x0M18b53 = AbstractC0010F.m18b(arrayList12, c3871x0M18b52);
                c3871x0M18b53.m4594a(new C3838h(1, enumC3873y1, 0L));
                c3871x0M18b53.m4594a(new C3838h(1, enumC3873y2, 0L));
                AbstractC0010F.m22f(3, enumC3873y2, 0L, c3871x0M18b53);
                arrayList12.add(c3871x0M18b53);
                this.f124f.addAll(arrayList12);
            }
            C3032c c3032c = (C3032c) this.f129k.m1477b().f34018Y;
            c3032c.getClass();
            try {
                outputFormats = ((StreamConfigurationMap) c3032c.f9127Z).getOutputFormats();
            } catch (IllegalArgumentException | NullPointerException e10) {
                AbstractC8072d6.m8493j("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e10);
                outputFormats = null;
            }
            int[] iArr3 = outputFormats != null ? (int[]) outputFormats.clone() : null;
            if (iArr3 != null) {
                for (int i12 : iArr3) {
                    if (i12 == 4101) {
                        ArrayList arrayList13 = new ArrayList();
                        C3871x0 c3871x10 = new C3871x0();
                        AbstractC0010F.m22f(4, enumC3873y0, 0L, c3871x10);
                        C3871x0 c3871x0M18b54 = AbstractC0010F.m18b(arrayList13, c3871x10);
                        c3871x0M18b54.m4594a(new C3838h(1, enumC3873y1, 0L));
                        AbstractC0010F.m22f(4, enumC3873y0, 0L, c3871x0M18b54);
                        arrayList13.add(c3871x0M18b54);
                        this.f125g.addAll(arrayList13);
                        break;
                    }
                }
            }
            C0703j c0703j = this.f129k;
            C3828c c3828c = AbstractC0021K0.f107a;
            int i13 = Build.VERSION.SDK_INT;
            boolean z10 = (i13 < 33 || (jArr = (long[]) c0703j.m1476a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
            this.f135q = z10;
            if (z10 && i13 >= 33) {
                ArrayList arrayList14 = new ArrayList();
                C3871x0 c3871x11 = new C3871x0();
                AbstractC0010F.m22f(1, enumC3873y5, 4L, c3871x11);
                C3871x0 c3871x0M18b55 = AbstractC0010F.m18b(arrayList14, c3871x11);
                AbstractC0010F.m22f(2, enumC3873y5, 4L, c3871x0M18b55);
                C3871x0 c3871x0M18b56 = AbstractC0010F.m18b(arrayList14, c3871x0M18b55);
                AbstractC0010F.m22f(1, enumC3873y2, 3L, c3871x0M18b56);
                C3871x0 c3871x0M18b57 = AbstractC0010F.m18b(arrayList14, c3871x0M18b56);
                AbstractC0010F.m22f(2, enumC3873y2, 3L, c3871x0M18b57);
                C3871x0 c3871x0M18b58 = AbstractC0010F.m18b(arrayList14, c3871x0M18b57);
                AbstractC0010F.m22f(3, enumC3873y0, 2L, c3871x0M18b58);
                C3871x0 c3871x0M18b59 = AbstractC0010F.m18b(arrayList14, c3871x0M18b58);
                AbstractC0010F.m22f(2, enumC3873y0, 2L, c3871x0M18b59);
                C3871x0 c3871x0M18b60 = AbstractC0010F.m18b(arrayList14, c3871x0M18b59);
                c3871x0M18b60.m4594a(new C3838h(1, enumC3873y1, 1L));
                AbstractC0010F.m22f(3, enumC3873y0, 2L, c3871x0M18b60);
                C3871x0 c3871x0M18b61 = AbstractC0010F.m18b(arrayList14, c3871x0M18b60);
                c3871x0M18b61.m4594a(new C3838h(1, enumC3873y1, 1L));
                AbstractC0010F.m22f(2, enumC3873y0, 2L, c3871x0M18b61);
                C3871x0 c3871x0M18b62 = AbstractC0010F.m18b(arrayList14, c3871x0M18b61);
                c3871x0M18b62.m4594a(new C3838h(1, enumC3873y1, 1L));
                AbstractC0010F.m22f(1, enumC3873y2, 3L, c3871x0M18b62);
                C3871x0 c3871x0M18b63 = AbstractC0010F.m18b(arrayList14, c3871x0M18b62);
                c3871x0M18b63.m4594a(new C3838h(1, enumC3873y1, 1L));
                AbstractC0010F.m22f(2, enumC3873y2, 3L, c3871x0M18b63);
                C3871x0 c3871x0M18b64 = AbstractC0010F.m18b(arrayList14, c3871x0M18b63);
                c3871x0M18b64.m4594a(new C3838h(1, enumC3873y1, 1L));
                AbstractC0010F.m22f(2, enumC3873y1, 1L, c3871x0M18b64);
                C3871x0 c3871x0M18b65 = AbstractC0010F.m18b(arrayList14, c3871x0M18b64);
                c3871x0M18b65.m4594a(new C3838h(1, enumC3873y1, 1L));
                c3871x0M18b65.m4594a(new C3838h(1, enumC3873y2, 3L));
                AbstractC0010F.m22f(3, enumC3873y2, 2L, c3871x0M18b65);
                C3871x0 c3871x0M18b66 = AbstractC0010F.m18b(arrayList14, c3871x0M18b65);
                c3871x0M18b66.m4594a(new C3838h(1, enumC3873y1, 1L));
                c3871x0M18b66.m4594a(new C3838h(2, enumC3873y2, 3L));
                AbstractC0010F.m22f(3, enumC3873y2, 2L, c3871x0M18b66);
                C3871x0 c3871x0M18b67 = AbstractC0010F.m18b(arrayList14, c3871x0M18b66);
                c3871x0M18b67.m4594a(new C3838h(1, enumC3873y1, 1L));
                c3871x0M18b67.m4594a(new C3838h(2, enumC3873y1, 1L));
                AbstractC0010F.m22f(3, enumC3873y0, 2L, c3871x0M18b67);
                arrayList14.add(c3871x0M18b67);
                this.f126h.addAll(arrayList14);
            }
            C0703j c0703j2 = this.f129k;
            if (i13 < 33 || (iArr = (int[]) c0703j2.m1476a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length == 0) {
                z6 = false;
                break;
            }
            int length = iArr.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    z6 = false;
                    break;
                } else {
                    if (iArr[i14] == 2) {
                        z6 = true;
                        break;
                    }
                    i14++;
                }
            }
            if (z6 && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList15 = new ArrayList();
                C3871x0 c3871x12 = new C3871x0();
                AbstractC0010F.m22f(1, enumC3873y5, 0L, c3871x12);
                C3871x0 c3871x0M18b68 = AbstractC0010F.m18b(arrayList15, c3871x12);
                AbstractC0010F.m22f(2, enumC3873y5, 0L, c3871x0M18b68);
                C3871x0 c3871x0M18b69 = AbstractC0010F.m18b(arrayList15, c3871x0M18b68);
                c3871x0M18b69.m4594a(new C3838h(1, enumC3873y5, 0L));
                AbstractC0010F.m22f(3, enumC3873y0, 0L, c3871x0M18b69);
                C3871x0 c3871x0M18b70 = AbstractC0010F.m18b(arrayList15, c3871x0M18b69);
                c3871x0M18b70.m4594a(new C3838h(2, enumC3873y5, 0L));
                AbstractC0010F.m22f(3, enumC3873y0, 0L, c3871x0M18b70);
                C3871x0 c3871x0M18b71 = AbstractC0010F.m18b(arrayList15, c3871x0M18b70);
                c3871x0M18b71.m4594a(new C3838h(1, enumC3873y5, 0L));
                AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b71);
                C3871x0 c3871x0M18b72 = AbstractC0010F.m18b(arrayList15, c3871x0M18b71);
                c3871x0M18b72.m4594a(new C3838h(2, enumC3873y5, 0L));
                AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0M18b72);
                C3871x0 c3871x0M18b73 = AbstractC0010F.m18b(arrayList15, c3871x0M18b72);
                c3871x0M18b73.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(1, enumC3873y5, 0L, c3871x0M18b73);
                C3871x0 c3871x0M18b74 = AbstractC0010F.m18b(arrayList15, c3871x0M18b73);
                c3871x0M18b74.m4594a(new C3838h(2, enumC3873y1, 0L));
                AbstractC0010F.m22f(1, enumC3873y5, 0L, c3871x0M18b74);
                C3871x0 c3871x0M18b75 = AbstractC0010F.m18b(arrayList15, c3871x0M18b74);
                c3871x0M18b75.m4594a(new C3838h(1, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y5, 0L, c3871x0M18b75);
                C3871x0 c3871x0M18b76 = AbstractC0010F.m18b(arrayList15, c3871x0M18b75);
                c3871x0M18b76.m4594a(new C3838h(2, enumC3873y1, 0L));
                AbstractC0010F.m22f(2, enumC3873y5, 0L, c3871x0M18b76);
                arrayList15.add(c3871x0M18b76);
                this.f122d.addAll(arrayList15);
            }
            m153b();
        } catch (C0694a e11) {
            throw new C3165q(e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Size m149c(StreamConfigurationMap streamConfigurationMap, int i10, boolean z6) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = i10 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i10);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        C4493d c4493d = new C4493d(false);
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), c4493d);
        Size size2 = AbstractC6542b.f21170a;
        if (z6 && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i10)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), c4493d);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), c4493d);
    }

    /* JADX INFO: renamed from: e */
    public static int m150e(Range range, Range range2) {
        AbstractC4941g.m5559R("Ranges must not intersect", (range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true);
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    /* JADX INFO: renamed from: f */
    public static int m151f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m152a(C0056d c0056d, List list) {
        List list2;
        HashMap map = this.f123e;
        if (map.containsKey(c0056d)) {
            list2 = (List) map.get(c0056d);
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z6 = c0056d.f263d;
            int i10 = c0056d.f260a;
            if (!z6) {
                int i11 = c0056d.f261b;
                if (i11 == 8) {
                    if (i10 != 1) {
                        ArrayList arrayList2 = this.f119a;
                        if (i10 != 2) {
                            if (c0056d.f262c) {
                                arrayList2 = this.f122d;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.f120b);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        arrayList = this.f121c;
                    }
                } else if (i11 == 10 && i10 == 0) {
                    arrayList.addAll(this.f124f);
                }
            } else if (i10 == 0) {
                arrayList.addAll(this.f125g);
            }
            map.put(c0056d, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 = ((C3871x0) it.next()).m4595c(list) != null;
            if (z10) {
                break;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: b */
    public final void m153b() {
        Size size;
        Size size2;
        Size sizeM320e = this.f139u.m320e();
        try {
            int i10 = Integer.parseInt(this.f127i);
            InterfaceC0058e interfaceC0058e = this.f128j;
            CamcorderProfile camcorderProfileMo236d = null;
            CamcorderProfile camcorderProfileMo236d2 = interfaceC0058e.mo237j(i10, 1) ? interfaceC0058e.mo236d(i10, 1) : null;
            if (camcorderProfileMo236d2 != null) {
                size2 = new Size(camcorderProfileMo236d2.videoFrameWidth, camcorderProfileMo236d2.videoFrameHeight);
            } else {
                size = AbstractC6542b.f21172c;
                if (interfaceC0058e.mo237j(i10, 10)) {
                    camcorderProfileMo236d = interfaceC0058e.mo236d(i10, 10);
                } else if (interfaceC0058e.mo237j(i10, 8)) {
                    camcorderProfileMo236d = interfaceC0058e.mo236d(i10, 8);
                } else if (interfaceC0058e.mo237j(i10, 12)) {
                    camcorderProfileMo236d = interfaceC0058e.mo236d(i10, 12);
                } else if (interfaceC0058e.mo237j(i10, 6)) {
                    camcorderProfileMo236d = interfaceC0058e.mo236d(i10, 6);
                } else if (interfaceC0058e.mo237j(i10, 5)) {
                    camcorderProfileMo236d = interfaceC0058e.mo236d(i10, 5);
                } else if (interfaceC0058e.mo237j(i10, 4)) {
                    camcorderProfileMo236d = interfaceC0058e.mo236d(i10, 4);
                }
                if (camcorderProfileMo236d != null) {
                    size = new Size(camcorderProfileMo236d.videoFrameWidth, camcorderProfileMo236d.videoFrameHeight);
                }
                size2 = size;
            }
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) ((C3032c) this.f129k.m1477b().f34018Y).f9127Z).getOutputSizes(MediaRecorder.class);
            if (outputSizes != null) {
                Arrays.sort(outputSizes, new C4493d(true));
                int length = outputSizes.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        size = AbstractC6542b.f21172c;
                        break;
                    }
                    Size size3 = outputSizes[i11];
                    int width = size3.getWidth();
                    Size size4 = AbstractC6542b.f21174e;
                    if (width <= size4.getWidth() && size3.getHeight() <= size4.getHeight()) {
                        size = size3;
                        break;
                    }
                    i11++;
                }
            } else {
                size = AbstractC6542b.f21172c;
            }
        }
        this.f137s = new C3840i(AbstractC6542b.f21171b, new HashMap(), sizeM320e, new HashMap(), size2, new HashMap(), new HashMap());
    }

    /* JADX INFO: renamed from: d */
    public final List m154d(C0056d c0056d, List list) {
        C3828c c3828c = AbstractC0021K0.f107a;
        if (c0056d.f260a == 0 && c0056d.f261b == 8) {
            Iterator it = this.f126h.iterator();
            while (it.hasNext()) {
                List listM4595c = ((C3871x0) it.next()).m4595c(list);
                if (listM4595c != null) {
                    return listM4595c;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:389:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:428:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:44:0x014e  */
    /* JADX WARN: Code duplicated, block: B:473:0x0bea  */
    /* JADX WARN: Code duplicated, block: B:475:0x0c0f  */
    /* JADX WARN: Code duplicated, block: B:477:0x0c15  */
    /* JADX WARN: Code duplicated, block: B:479:0x0c38  */
    /* JADX WARN: Code duplicated, block: B:482:0x0c49  */
    /* JADX WARN: Code duplicated, block: B:485:0x0c5a  */
    /* JADX WARN: Code duplicated, block: B:488:0x0c6b  */
    /* JADX WARN: Code duplicated, block: B:491:0x0c85  */
    /* JADX WARN: Code duplicated, block: B:508:0x0cd3 A[EDGE_INSN: B:508:0x0cd3->B:630:0x0f5b BREAK  A[LOOP:31: B:504:0x0cbb->B:509:0x0cd9]] */
    /* JADX WARN: Code duplicated, block: B:512:0x0cea  */
    /* JADX WARN: Code duplicated, block: B:543:0x0d95  */
    /* JADX WARN: Code duplicated, block: B:545:0x0da5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:546:0x0da7  */
    /* JADX WARN: Code duplicated, block: B:549:0x0db1  */
    /* JADX WARN: Code duplicated, block: B:551:0x0dc1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:552:0x0dc3  */
    /* JADX WARN: Code duplicated, block: B:555:0x0dcb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:556:0x0dcd  */
    /* JADX WARN: Code duplicated, block: B:561:0x0ddc  */
    /* JADX WARN: Code duplicated, block: B:564:0x0de6  */
    /* JADX WARN: Code duplicated, block: B:570:0x0dfe  */
    /* JADX WARN: Code duplicated, block: B:572:0x0e18  */
    /* JADX WARN: Code duplicated, block: B:574:0x0e25  */
    /* JADX WARN: Code duplicated, block: B:576:0x0e2b  */
    /* JADX WARN: Code duplicated, block: B:578:0x0e37  */
    /* JADX WARN: Code duplicated, block: B:580:0x0e3f  */
    /* JADX WARN: Code duplicated, block: B:588:0x0e5d  */
    /* JADX WARN: Code duplicated, block: B:593:0x0e6e  */
    /* JADX WARN: Code duplicated, block: B:599:0x0ea3  */
    /* JADX WARN: Code duplicated, block: B:601:0x0eb9  */
    /* JADX WARN: Code duplicated, block: B:603:0x0ecb  */
    /* JADX WARN: Code duplicated, block: B:605:0x0ed8  */
    /* JADX WARN: Code duplicated, block: B:607:0x0ede  */
    /* JADX WARN: Code duplicated, block: B:609:0x0eea  */
    /* JADX WARN: Code duplicated, block: B:611:0x0ef2  */
    /* JADX WARN: Code duplicated, block: B:619:0x0f0e  */
    /* JADX WARN: Code duplicated, block: B:622:0x0f14  */
    /* JADX WARN: Code duplicated, block: B:624:0x0f22  */
    /* JADX WARN: Code duplicated, block: B:626:0x0f3c  */
    /* JADX WARN: Code duplicated, block: B:750:0x0c9e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:0x0c98 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:0x0c87 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:0x0f08 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:0x0f02 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:0x0efc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:760:0x0f53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:0x0dab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:0x0dc5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:0x0dd4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:0x0df4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:0x0e4b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:0x0e57 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:0x0e51 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:0x0e8e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:0x0e68 A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public final Pair m155g(int i10, ArrayList arrayList, HashMap map, boolean z6, boolean z10) {
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        ArrayList<InterfaceC3800E0> arrayList2;
        HashMap map2;
        HashMap map3;
        HashMap map4;
        HashMap map5;
        HashMap map6;
        ArrayList arrayList3;
        String str;
        Range range;
        ArrayList arrayList4;
        C3175v c3175v;
        String str2;
        String str3;
        List list;
        List list2;
        HashMap map7;
        String str4;
        HashMap map8;
        int i13;
        List list3;
        List list4;
        HashMap map9;
        HashMap map10;
        String str5;
        Range range2;
        HashMap map11;
        boolean z13;
        boolean z14;
        Iterator it;
        Iterator it2;
        C3836g c3836g;
        C21572a c21572aM133a;
        C3824a c3824a;
        C21572a c21572aM133a2;
        HashMap map12;
        C2392v c2392v;
        Size size;
        Range range3;
        C3175v c3175v2;
        Range range4;
        C3828c c3828c;
        Long l4;
        long j10;
        int i14;
        long j11;
        HashMap map13;
        HashMap map14;
        InterfaceC3800E0 interfaceC3800E0;
        C3836g c3836g2;
        C21572a c21572aM133a3;
        C3824a c3824a2;
        C21572a c21572aM133a4;
        C2392v c2392v2;
        Size size2;
        Range range5;
        C3175v c3175v3;
        Range range6;
        ArrayList arrayList5;
        Size size3;
        C2392v c2392v3;
        Range range7;
        C3825a0 c3825a0M4558d;
        C3828c c3828c2;
        C3828c c3828c3;
        C3828c c3828c4;
        C3828c c3828c5;
        Range[] rangeArr;
        List list5;
        List list6;
        int i15;
        int i16;
        HashMap map15;
        String str6;
        HashMap map16;
        int i17;
        int i18;
        ArrayList arrayList6;
        long[] jArr;
        int outputMinFrameDuration;
        Rational rational;
        Size sizeM11178b;
        Range range8;
        int outputMinFrameDuration2;
        Iterator it3;
        ArrayList arrayList7;
        Set set;
        C3175v c3175vM324b;
        ArrayList arrayList8;
        C0089t0 c0089t0 = this.f139u;
        c0089t0.f388b = c0089t0.m318a();
        if (this.f137s == null) {
            m153b();
        } else {
            Size sizeM320e = this.f139u.m320e();
            C3840i c3840i = this.f137s;
            this.f137s = new C3840i(c3840i.f11615a, c3840i.f11616b, sizeM320e, c3840i.f11618d, c3840i.f11619e, c3840i.f11620f, c3840i.f11621g);
        }
        ArrayList<InterfaceC3800E0> arrayList9 = new ArrayList(map.keySet());
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        Iterator it4 = arrayList9.iterator();
        while (it4.hasNext()) {
            int iMo46m = ((InterfaceC3800E0) it4.next()).mo46m();
            if (!arrayList11.contains(Integer.valueOf(iMo46m))) {
                arrayList11.add(Integer.valueOf(iMo46m));
            }
        }
        Collections.sort(arrayList11);
        Collections.reverse(arrayList11);
        Iterator it5 = arrayList11.iterator();
        while (it5.hasNext()) {
            int iIntValue = ((Integer) it5.next()).intValue();
            for (InterfaceC3800E0 interfaceC3800E1 : arrayList9) {
                if (iIntValue == interfaceC3800E1.mo46m()) {
                    arrayList10.add(Integer.valueOf(arrayList9.indexOf(interfaceC3800E1)));
                }
            }
        }
        C0093v0 c0093v0 = this.f142x;
        c0093v0.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            linkedHashSet.add(((C3824a) it6.next()).f11581d);
        }
        C13287b c13287b = (C13287b) c0093v0.f405p0;
        Set setMo2110c = ((InterfaceC1468c) c13287b.f42000Z).mo2110c();
        HashSet hashSet = new HashSet(setMo2110c);
        Iterator it7 = linkedHashSet.iterator();
        while (it7.hasNext()) {
            C0093v0.m328A(hashSet, (C3175v) it7.next(), c13287b);
        }
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        Iterator it8 = arrayList10.iterator();
        while (it8.hasNext()) {
            InterfaceC3800E0 interfaceC3800E2 = (InterfaceC3800E0) arrayList9.get(((Integer) it8.next()).intValue());
            C3175v c3175vMo40c = interfaceC3800E2.mo40c();
            if (c3175vMo40c.equals(C3175v.f9574c)) {
                arrayList14.add(interfaceC3800E2);
                arrayList8 = arrayList9;
            } else {
                int i19 = c3175vMo40c.f9581a;
                arrayList8 = arrayList9;
                if (i19 != 2) {
                    int i20 = c3175vMo40c.f9582b;
                    if ((i19 == 0 || i20 != 0) && (i19 != 0 || i20 == 0)) {
                        arrayList12.add(interfaceC3800E2);
                    } else {
                        arrayList13.add(interfaceC3800E2);
                    }
                } else {
                    arrayList13.add(interfaceC3800E2);
                }
            }
            arrayList9 = arrayList8;
        }
        ArrayList arrayList15 = arrayList9;
        HashMap map17 = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList16 = new ArrayList();
        arrayList16.addAll(arrayList12);
        arrayList16.addAll(arrayList13);
        arrayList16.addAll(arrayList14);
        Iterator it9 = arrayList16.iterator();
        while (true) {
            boolean zHasNext = it9.hasNext();
            C3175v c3175v4 = C3175v.f9575d;
            Range range9 = null;
            if (!zHasNext) {
                ArrayList arrayList17 = arrayList10;
                Iterator it10 = arrayList.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        Iterator it11 = map.keySet().iterator();
                        while (true) {
                            if (!it11.hasNext()) {
                                z11 = false;
                                break;
                            }
                            if (((InterfaceC3800E0) it11.next()).getInputFormat() == 4101) {
                            }
                        }
                    } else if (((C3824a) it10.next()).f11579b == 4101) {
                    }
                    z11 = true;
                    break;
                }
                Iterator it12 = map17.values().iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        i11 = 8;
                        break;
                    }
                    if (((C3175v) it12.next()).f9582b == 10) {
                        i11 = 10;
                        break;
                    }
                }
                String str7 = this.f127i;
                if (i10 != 0 && z11) {
                    throw new IllegalArgumentException(AbstractC0010F.m20d("Camera device id is ", str7, ". Ultra HDR is not currently supported in ", i10 != 1 ? i10 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
                }
                if (i10 != 0 && i11 == 10) {
                    throw new IllegalArgumentException(AbstractC0010F.m20d("Camera device id is ", str7, ". 10 bit dynamic range is not currently supported in ", i10 != 1 ? i10 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
                }
                C0056d c0056d = new C0056d(i10, i11, z6, z11);
                ArrayList arrayList18 = new ArrayList();
                Iterator it13 = arrayList.iterator();
                while (it13.hasNext()) {
                    arrayList18.add(((C3824a) it13.next()).f11578a);
                }
                C4493d c4493d = new C4493d(false);
                for (InterfaceC3800E0 interfaceC3800E3 : map.keySet()) {
                    List list7 = (List) map.get(interfaceC3800E3);
                    AbstractC4941g.m5554M("No available output size is found for " + interfaceC3800E3 + Separators.DOT, (list7 == null || list7.isEmpty()) ? false : true);
                    Size size4 = (Size) Collections.min(list7, c4493d);
                    int inputFormat = interfaceC3800E3.getInputFormat();
                    arrayList18.add(C3838h.m4571b(c0056d.f260a, inputFormat, size4, m157i(inputFormat)));
                }
                boolean zM152a = m152a(c0056d, arrayList18);
                String str8 = " New configs: ";
                String str9 = "No supported surface combination is found for camera device - Id : ";
                if (!zM152a) {
                    throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f127i + ".  May be attempting to bind too many use cases. Existing surfaces: " + arrayList + " New configs: " + arrayList15);
                }
                Iterator it14 = arrayList.iterator();
                Range rangeIntersect = null;
                while (it14.hasNext()) {
                    Range range10 = ((C3824a) it14.next()).f11584g;
                    if (rangeIntersect == null) {
                        rangeIntersect = range10;
                    } else if (range10 != null) {
                        try {
                            rangeIntersect = rangeIntersect.intersect(range10);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                Iterator it15 = arrayList17.iterator();
                Range range11 = rangeIntersect;
                while (it15.hasNext()) {
                    ArrayList arrayList19 = arrayList15;
                    Range rangeMo43i = ((InterfaceC3800E0) arrayList19.get(((Integer) it15.next()).intValue())).mo43i();
                    if (range11 == null) {
                        range11 = rangeMo43i;
                    } else if (rangeMo43i != null) {
                        try {
                            rangeMo43i = range11.intersect(rangeMo43i);
                            range11 = rangeMo43i;
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    arrayList15 = arrayList19;
                }
                ArrayList arrayList20 = arrayList15;
                HashMap map18 = new HashMap();
                Iterator it16 = map.keySet().iterator();
                while (it16.hasNext()) {
                    InterfaceC3800E0 interfaceC3800E4 = (InterfaceC3800E0) it16.next();
                    ArrayList arrayList21 = new ArrayList();
                    Iterator it17 = it16;
                    HashMap map19 = new HashMap();
                    for (Size size5 : (List) map.get(interfaceC3800E4)) {
                        String str10 = str9;
                        int inputFormat2 = interfaceC3800E4.getInputFormat();
                        String str11 = str8;
                        C3838h c3838hM4571b = C3838h.m4571b(c0056d.f260a, inputFormat2, size5, m157i(inputFormat2));
                        if (range11 != null) {
                            range8 = range11;
                            try {
                                outputMinFrameDuration2 = (int) (1.0E9d / ((StreamConfigurationMap) this.f129k.m1476a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(inputFormat2, size5));
                            } catch (Exception unused3) {
                                outputMinFrameDuration2 = 0;
                            }
                        } else {
                            range8 = range11;
                            outputMinFrameDuration2 = Integer.MAX_VALUE;
                        }
                        EnumC3873y0 enumC3873y0 = c3838hM4571b.f11613b;
                        Set hashSet2 = (Set) map19.get(enumC3873y0);
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet();
                            map19.put(enumC3873y0, hashSet2);
                        }
                        if (!hashSet2.contains(Integer.valueOf(outputMinFrameDuration2))) {
                            arrayList21.add(size5);
                            hashSet2.add(Integer.valueOf(outputMinFrameDuration2));
                        }
                        str9 = str10;
                        str8 = str11;
                        range11 = range8;
                    }
                    map18.put(interfaceC3800E4, arrayList21);
                    it16 = it17;
                }
                Range range12 = range11;
                String str12 = str9;
                String str13 = str8;
                ArrayList arrayList22 = new ArrayList();
                Iterator it18 = arrayList17.iterator();
                while (it18.hasNext()) {
                    InterfaceC3800E0 interfaceC3800E5 = (InterfaceC3800E0) arrayList20.get(((Integer) it18.next()).intValue());
                    List<Size> list8 = (List) map18.get(interfaceC3800E5);
                    int inputFormat3 = interfaceC3800E5.getInputFormat();
                    C15370i c15370i = this.f140v;
                    C0703j c0703j = this.f129k;
                    c15370i.getClass();
                    char c9 = (((Nexus4AndroidLTargetAspectRatioQuirk) AbstractC1762b.f5032a.m4579f(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) AbstractC8054b4.m8446b(c0703j).m4579f(AspectRatioLegacyApi21Quirk.class)) == null) ? (char) 3 : (char) 2;
                    if (c9 == 0) {
                        rational = AbstractC4491b.f14647a;
                    } else if (c9 == 1) {
                        rational = AbstractC4491b.f14649c;
                    } else if (c9 != 2) {
                        rational = null;
                    } else {
                        Size size6 = (Size) m157i(256).f11620f.get(256);
                        rational = new Rational(size6.getWidth(), size6.getHeight());
                    }
                    if (rational != null) {
                        ArrayList arrayList23 = new ArrayList();
                        ArrayList arrayList24 = new ArrayList();
                        for (Size size7 : list8) {
                            if (AbstractC4491b.m5220a(rational, size7)) {
                                arrayList23.add(size7);
                            } else {
                                arrayList24.add(size7);
                            }
                        }
                        arrayList24.addAll(0, arrayList23);
                        list8 = arrayList24;
                    }
                    C3032c c3032c = this.f141w;
                    int iM4570a = C3838h.m4570a(inputFormat3);
                    if (((ExtraCroppingQuirk) c3032c.f9127Z) != null && (sizeM11178b = ExtraCroppingQuirk.m11178b(iM4570a)) != null) {
                        ArrayList arrayList25 = new ArrayList();
                        arrayList25.add(sizeM11178b);
                        for (Size size8 : list8) {
                            if (!size8.equals(sizeM11178b)) {
                                arrayList25.add(size8);
                            }
                        }
                        list8 = arrayList25;
                    }
                    arrayList22.add(list8);
                }
                Iterator it19 = arrayList22.iterator();
                int size9 = 1;
                while (it19.hasNext()) {
                    size9 *= ((List) it19.next()).size();
                }
                if (size9 == 0) {
                    throw new IllegalArgumentException("Failed to find supported resolutions.");
                }
                ArrayList arrayList26 = new ArrayList();
                for (int i21 = 0; i21 < size9; i21++) {
                    arrayList26.add(new ArrayList());
                }
                int size10 = size9 / ((List) arrayList22.get(0)).size();
                int i22 = size9;
                int i23 = 0;
                while (i23 < arrayList22.size()) {
                    List list9 = (List) arrayList22.get(i23);
                    int i24 = 0;
                    while (i24 < size9) {
                        ((List) arrayList26.get(i24)).add((Size) list9.get((i24 % i22) / size10));
                        i24++;
                        size9 = size9;
                    }
                    int i25 = size9;
                    if (i23 < arrayList22.size() - 1) {
                        i22 = size10;
                        size10 /= ((List) arrayList22.get(i23 + 1)).size();
                    }
                    i23++;
                    size9 = i25;
                }
                HashMap map20 = new HashMap();
                HashMap map21 = new HashMap();
                HashMap map22 = new HashMap();
                HashMap map23 = new HashMap();
                C3828c c3828c6 = AbstractC0021K0.f107a;
                Iterator it20 = arrayList.iterator();
                while (true) {
                    if (!it20.hasNext()) {
                        Iterator it21 = arrayList20.iterator();
                        while (true) {
                            if (!it21.hasNext()) {
                                z12 = false;
                                break;
                            }
                            InterfaceC3800E0 interfaceC3800E6 = (InterfaceC3800E0) it21.next();
                            if (AbstractC0021K0.m135c(interfaceC3800E6, interfaceC3800E6.mo31D())) {
                            }
                        }
                    } else {
                        C3824a c3824a3 = (C3824a) it20.next();
                        if (AbstractC0021K0.m135c(c3824a3.f11583f, (EnumC3804G0) c3824a3.f11582e.get(0))) {
                        }
                    }
                    z12 = true;
                    break;
                }
                Iterator it22 = arrayList.iterator();
                int iMin = Integer.MAX_VALUE;
                while (it22.hasNext()) {
                    C3824a c3824a4 = (C3824a) it22.next();
                    Iterator it23 = it22;
                    HashMap map24 = map23;
                    HashMap map25 = map22;
                    try {
                        outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.f129k.m1476a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(c3824a4.f11579b, c3824a4.f11580c));
                    } catch (Exception unused4) {
                        outputMinFrameDuration = 0;
                    }
                    iMin = Math.min(iMin, outputMinFrameDuration);
                    it22 = it23;
                    map23 = map24;
                    map22 = map25;
                }
                HashMap map26 = map23;
                HashMap map27 = map22;
                String str14 = "SurfaceConfig does not map to any use case";
                if (!this.f135q || z12) {
                    i12 = iMin;
                    arrayList2 = arrayList20;
                    map2 = map21;
                    map3 = map20;
                    map4 = map17;
                    map5 = map26;
                    map6 = map27;
                    arrayList3 = arrayList17;
                    str = str12;
                    range = range12;
                    arrayList4 = arrayList26;
                    c3175v = c3175v4;
                    str2 = str13;
                    str3 = "SurfaceConfig does not map to any use case";
                    list = null;
                } else {
                    Iterator it24 = arrayList26.iterator();
                    List list10 = null;
                    loop25: while (true) {
                        if (!it24.hasNext()) {
                            i12 = iMin;
                            map2 = map21;
                            map3 = map20;
                            map4 = map17;
                            map5 = map26;
                            map6 = map27;
                            arrayList3 = arrayList17;
                            str = str12;
                            range = range12;
                            arrayList6 = arrayList20;
                            arrayList4 = arrayList26;
                            c3175v = c3175v4;
                            str2 = str13;
                            str3 = str14;
                            break;
                        }
                        i12 = iMin;
                        map4 = map17;
                        HashMap map28 = map26;
                        ArrayList arrayList27 = arrayList20;
                        arrayList6 = arrayList20;
                        ArrayList arrayList28 = arrayList17;
                        Range range13 = range12;
                        c3175v = c3175v4;
                        str3 = str14;
                        map2 = map21;
                        arrayList3 = arrayList17;
                        range = range13;
                        str = str12;
                        map3 = map20;
                        arrayList4 = arrayList26;
                        str2 = str13;
                        List listM154d = m154d(c0056d, (List) m156h(i10, arrayList, (List) it24.next(), arrayList27, arrayList28, i12, map27, map28).first);
                        if (listM154d != null) {
                            int i26 = 0;
                            while (true) {
                                if (i26 < listM154d.size()) {
                                    long j12 = ((C3838h) listM154d.get(i26)).f11614c;
                                    map6 = map27;
                                    boolean zContainsKey = map6.containsKey(Integer.valueOf(i26));
                                    EnumC3804G0 enumC3804G0 = EnumC3804G0.f11511q0;
                                    if (zContainsKey) {
                                        C3824a c3824a5 = (C3824a) map6.get(Integer.valueOf(i26));
                                        int size11 = c3824a5.f11582e.size();
                                        List list11 = c3824a5.f11582e;
                                        if (size11 == 1) {
                                            enumC3804G0 = (EnumC3804G0) list11.get(0);
                                        }
                                        if (AbstractC0021K0.m134b(enumC3804G0, j12, list11)) {
                                            map5 = map28;
                                            i26++;
                                            listM154d = listM154d;
                                            map28 = map5;
                                            map27 = map6;
                                        } else {
                                            map5 = map28;
                                            list10 = null;
                                        }
                                    } else {
                                        map5 = map28;
                                        if (!map5.containsKey(Integer.valueOf(i26))) {
                                            throw new AssertionError(str3);
                                        }
                                        InterfaceC3800E0 interfaceC3800E7 = (InterfaceC3800E0) map5.get(Integer.valueOf(i26));
                                        if (!AbstractC0021K0.m134b(interfaceC3800E7.mo31D(), j12, interfaceC3800E7.mo31D() == enumC3804G0 ? (List) AbstractC0168G.m519h((C7731e) interfaceC3800E7, C7731e.f24381Z) : Collections.emptyList())) {
                                            list10 = null;
                                        }
                                        i26++;
                                        listM154d = listM154d;
                                        map28 = map5;
                                        map27 = map6;
                                    }
                                } else {
                                    map5 = map28;
                                    map6 = map27;
                                    list10 = listM154d;
                                }
                            }
                        } else {
                            map5 = map28;
                            map6 = map27;
                            list10 = listM154d;
                        }
                        if (list10 != null) {
                            C0703j c0703j2 = this.f129k;
                            if (Build.VERSION.SDK_INT >= 33 && (jArr = (long[]) c0703j2.m1476a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) != null && jArr.length != 0) {
                                HashSet hashSet3 = new HashSet();
                                for (long j13 : jArr) {
                                    hashSet3.add(Long.valueOf(j13));
                                }
                                Iterator it25 = list10.iterator();
                                do {
                                    if (!it25.hasNext()) {
                                        break loop25;
                                    }
                                } while (hashSet3.contains(Long.valueOf(((C3838h) it25.next()).f11614c)));
                            }
                            list10 = null;
                        }
                        map6.clear();
                        map5.clear();
                        iMin = i12;
                        map27 = map6;
                        str13 = str2;
                        str14 = str3;
                        arrayList20 = arrayList6;
                        arrayList26 = arrayList4;
                        c3175v4 = c3175v;
                        map20 = map3;
                        map26 = map5;
                        str12 = str;
                        map17 = map4;
                        range12 = range;
                        arrayList17 = arrayList3;
                        map21 = map2;
                    }
                    if (list10 == null && !zM152a) {
                        throw new IllegalArgumentException(str + this.f127i + ".  May be attempting to bind too many use cases. Existing surfaces: " + arrayList + str2 + arrayList6);
                    }
                    arrayList2 = arrayList6;
                    list = list10;
                }
                Iterator it26 = arrayList4.iterator();
                List list12 = null;
                List list13 = null;
                int i27 = Integer.MAX_VALUE;
                int iIntValue2 = Integer.MAX_VALUE;
                boolean z15 = false;
                boolean z16 = false;
                while (true) {
                    if (!it26.hasNext()) {
                        list2 = list;
                        map7 = map6;
                        str4 = str2;
                        map8 = map5;
                        i13 = i27;
                        list3 = list12;
                        list4 = list13;
                        break;
                    }
                    List list14 = (List) it26.next();
                    int i28 = i27;
                    int i29 = iIntValue2;
                    list2 = list;
                    str4 = str2;
                    map8 = map5;
                    map7 = map6;
                    Pair pairM156h = m156h(i10, arrayList, list14, arrayList2, arrayList3, i12, null, null);
                    List list15 = (List) pairM156h.first;
                    iIntValue2 = ((Integer) pairM156h.second).intValue();
                    int i30 = i12;
                    boolean z17 = range == null || i30 <= iIntValue2 || iIntValue2 >= ((Integer) range.getLower()).intValue();
                    if (z15 || !m152a(c0056d, list15)) {
                        i17 = i29;
                    } else {
                        i17 = i29;
                        if (i17 == Integer.MAX_VALUE || i17 < iIntValue2) {
                            i17 = iIntValue2;
                            list12 = list14;
                        }
                        if (z17) {
                            if (z16) {
                                list4 = list13;
                                list3 = list14;
                                i13 = i28;
                                list2 = list2;
                                break;
                            }
                            i17 = iIntValue2;
                            list12 = list14;
                            z15 = true;
                        }
                        if (list2 != 0 || z16 || m154d(c0056d, list15) == null) {
                            i18 = i28;
                        } else {
                            i18 = i28;
                            if (i18 == Integer.MAX_VALUE || i18 < iIntValue2) {
                                i18 = iIntValue2;
                                list13 = list14;
                            }
                            if (!z17) {
                                continue;
                            } else {
                                if (z15) {
                                    list3 = list12;
                                    list4 = list14;
                                    iIntValue2 = i17;
                                    i13 = iIntValue2;
                                    break;
                                }
                                i18 = iIntValue2;
                                list13 = list14;
                                z16 = true;
                            }
                        }
                        i12 = i30;
                        iIntValue2 = i17;
                        i27 = i18;
                        map5 = map8;
                        map6 = map7;
                        str2 = str4;
                        list = list2;
                    }
                    if (list2 != 0) {
                        i18 = i28;
                    } else {
                        i18 = i28;
                    }
                    i12 = i30;
                    iIntValue2 = i17;
                    i27 = i18;
                    map5 = map8;
                    map6 = map7;
                    str2 = str4;
                    list = list2;
                }
                if (list3 == null) {
                    throw new IllegalArgumentException(str + this.f127i + " and Hardware level: " + this.f131m + ". May be the specified resolution is too large and not supported. Existing surfaces: " + arrayList + str4 + arrayList2);
                }
                if (range != null) {
                    Range range14 = C3836g.f11605f;
                    Range range15 = range;
                    if (range15.equals(range14) || (rangeArr = (Range[]) this.f129k.m1476a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) == null) {
                        range9 = range14;
                    } else {
                        Range range16 = new Range(Integer.valueOf(Math.min(((Integer) range15.getLower()).intValue(), iIntValue2)), Integer.valueOf(Math.min(((Integer) range15.getUpper()).intValue(), iIntValue2)));
                        int length = rangeArr.length;
                        int i31 = 0;
                        int iM151f = 0;
                        while (i31 < length) {
                            int i32 = length;
                            Range range17 = rangeArr[i31];
                            Range[] rangeArr2 = rangeArr;
                            if (iIntValue2 >= ((Integer) range17.getLower()).intValue()) {
                                if (range14.equals(C3836g.f11605f)) {
                                    range14 = range17;
                                }
                                if (range17.equals(range16)) {
                                    range14 = range17;
                                    break;
                                }
                                try {
                                    int iM151f2 = m151f(range17.intersect(range16));
                                    if (iM151f == 0) {
                                        list5 = list4;
                                        list6 = list2;
                                        i15 = i13;
                                        i16 = iIntValue2;
                                        iM151f = iM151f2;
                                        map15 = map8;
                                        str6 = str3;
                                        map16 = map7;
                                    } else {
                                        if (iM151f2 >= iM151f) {
                                            str6 = str3;
                                            map16 = map7;
                                            double dM151f = m151f(range14.intersect(range16));
                                            try {
                                                map15 = map8;
                                                double dM151f2 = m151f(range17.intersect(range16));
                                                try {
                                                    i15 = i13;
                                                    i16 = iIntValue2;
                                                    double dM151f3 = dM151f2 / ((double) m151f(range17));
                                                    try {
                                                        list5 = list4;
                                                        list6 = list2;
                                                        double dM151f4 = dM151f / ((double) m151f(range14));
                                                        if (dM151f2 > dM151f) {
                                                            if (dM151f3 >= 0.5d || dM151f3 >= dM151f4) {
                                                                range14 = range17;
                                                            }
                                                        } else if (dM151f2 == dM151f) {
                                                            if (dM151f3 > dM151f4 || (dM151f3 == dM151f4 && ((Integer) range17.getLower()).intValue() > ((Integer) range14.getLower()).intValue())) {
                                                                range14 = range17;
                                                            }
                                                        } else if (dM151f4 < 0.5d && dM151f3 > dM151f4) {
                                                            range14 = range17;
                                                        }
                                                        try {
                                                            iM151f = m151f(range16.intersect(range14));
                                                        } catch (IllegalArgumentException unused5) {
                                                            if (iM151f == 0 && (m150e(range17, range16) < m150e(range14, range16) || (m150e(range17, range16) == m150e(range14, range16) && (((Integer) range17.getLower()).intValue() > ((Integer) range14.getUpper()).intValue() || m151f(range17) < m151f(range14))))) {
                                                            }
                                                            i31++;
                                                            rangeArr = rangeArr2;
                                                            list4 = list5;
                                                            length = i32;
                                                            str3 = str6;
                                                            map7 = map16;
                                                            map8 = map15;
                                                            i13 = i15;
                                                            iIntValue2 = i16;
                                                            list2 = list6;
                                                        }
                                                    } catch (IllegalArgumentException unused6) {
                                                        list5 = list4;
                                                        list6 = list2;
                                                    }
                                                } catch (IllegalArgumentException unused7) {
                                                    list5 = list4;
                                                    list6 = list2;
                                                    i15 = i13;
                                                    i16 = iIntValue2;
                                                }
                                            } catch (IllegalArgumentException unused8) {
                                                list5 = list4;
                                                list6 = list2;
                                                i15 = i13;
                                                i16 = iIntValue2;
                                                map15 = map8;
                                            }
                                        } else {
                                            list5 = list4;
                                            list6 = list2;
                                            i15 = i13;
                                            i16 = iIntValue2;
                                            map15 = map8;
                                            str6 = str3;
                                            map16 = map7;
                                        }
                                        range17 = range14;
                                    }
                                } catch (IllegalArgumentException unused9) {
                                    list5 = list4;
                                    list6 = list2;
                                    i15 = i13;
                                    i16 = iIntValue2;
                                    map15 = map8;
                                    str6 = str3;
                                    map16 = map7;
                                }
                                range14 = range17;
                            } else {
                                list5 = list4;
                                list6 = list2;
                                i15 = i13;
                                i16 = iIntValue2;
                                map15 = map8;
                                str6 = str3;
                                map16 = map7;
                            }
                            i31++;
                            rangeArr = rangeArr2;
                            list4 = list5;
                            length = i32;
                            str3 = str6;
                            map7 = map16;
                            map8 = map15;
                            i13 = i15;
                            iIntValue2 = i16;
                            list2 = list6;
                        }
                        map9 = map8;
                        str5 = str3;
                        map10 = map7;
                        range9 = range14;
                    }
                    range2 = range9;
                    for (InterfaceC3800E0 interfaceC3800E8 : arrayList2) {
                        arrayList5 = arrayList3;
                        size3 = (Size) list3.get(arrayList5.indexOf(Integer.valueOf(arrayList2.indexOf(interfaceC3800E8))));
                        Range range18 = C3836g.f11605f;
                        c2392v3 = new C2392v(7, false);
                        if (size3 != null) {
                            throw new NullPointerException("Null resolution");
                        }
                        c2392v3.f7436Z = size3;
                        range7 = C3836g.f11605f;
                        if (range7 != null) {
                            throw new NullPointerException("Null expectedFrameRateRange");
                        }
                        c2392v3.f7438p0 = range7;
                        C3175v c3175v5 = c3175v;
                        c2392v3.f7437o0 = c3175v5;
                        c2392v3.f7440r0 = Boolean.FALSE;
                        HashMap map29 = map4;
                        C3175v c3175v6 = (C3175v) map29.get(interfaceC3800E8);
                        c3175v6.getClass();
                        c2392v3.f7437o0 = c3175v6;
                        c3825a0M4558d = C3825a0.m4558d();
                        c3828c2 = C21572a.f68306q0;
                        if (interfaceC3800E8.mo37O(c3828c2)) {
                            c3825a0M4558d.m4561x(c3828c2, (Long) interfaceC3800E8.mo39b(c3828c2));
                        }
                        c3828c3 = InterfaceC3800E0.f11491B;
                        if (interfaceC3800E8.mo37O(c3828c3)) {
                            c3825a0M4558d.m4561x(c3828c3, (Boolean) interfaceC3800E8.mo39b(c3828c3));
                        }
                        c3828c4 = C3815Q.f11548Z;
                        if (interfaceC3800E8.mo37O(c3828c4)) {
                            c3825a0M4558d.m4561x(c3828c4, (Integer) interfaceC3800E8.mo39b(c3828c4));
                        }
                        c3828c5 = InterfaceC3816S.f11560j;
                        if (interfaceC3800E8.mo37O(c3828c5)) {
                            c3825a0M4558d.m4561x(c3828c5, (Integer) interfaceC3800E8.mo39b(c3828c5));
                        }
                        c2392v3.f7439q0 = new C21572a(c3825a0M4558d, 8);
                        c2392v3.f7440r0 = Boolean.valueOf(z10);
                        if (range2 != null) {
                            c2392v3.f7438p0 = range2;
                        }
                        map2.put(interfaceC3800E8, c2392v3.m3557n());
                        map4 = map29;
                        c3175v = c3175v5;
                        arrayList3 = arrayList5;
                    }
                    C3175v c3175v7 = c3175v;
                    HashMap map30 = map2;
                    if (list2 == null || iIntValue2 != i13 || list3.size() != list4.size()) {
                        map11 = map3;
                        break;
                    }
                    int i33 = 0;
                    while (true) {
                        if (i33 >= list3.size()) {
                            C0703j c0703j3 = this.f129k;
                            if (Build.VERSION.SDK_INT >= 33) {
                                ArrayList<InterfaceC3800E0> arrayList29 = new ArrayList(map30.keySet());
                                Iterator it27 = arrayList.iterator();
                                while (it27.hasNext()) {
                                    ((C3824a) it27.next()).f11583f.getClass();
                                }
                                Iterator it28 = arrayList29.iterator();
                                while (it28.hasNext()) {
                                    C3836g c3836g3 = (C3836g) map30.get((InterfaceC3800E0) it28.next());
                                    c3836g3.getClass();
                                    c3836g3.f11609d.getClass();
                                }
                                long[] jArr2 = (long[]) c0703j3.m1476a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
                                if (jArr2 != null && jArr2.length != 0) {
                                    HashSet hashSet4 = new HashSet();
                                    for (long j14 : jArr2) {
                                        hashSet4.add(Long.valueOf(j14));
                                    }
                                    HashSet hashSet5 = new HashSet();
                                    Iterator it29 = arrayList.iterator();
                                    if (it29.hasNext()) {
                                        C3824a c3824a6 = (C3824a) it29.next();
                                        C21572a c21572a = c3824a6.f11583f;
                                        C3828c c3828c7 = C21572a.f68306q0;
                                        if (c21572a.mo37O(c3828c7) && ((Long) c3824a6.f11583f.mo39b(c3828c7)).longValue() != 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                            z14 = true;
                                        }
                                        for (InterfaceC3800E0 interfaceC3800E9 : arrayList29) {
                                            c3828c = C21572a.f68306q0;
                                            if (!interfaceC3800E9.mo37O(c3828c)) {
                                                l4 = (Long) interfaceC3800E9.mo39b(c3828c);
                                                j10 = 0;
                                                if (l4.longValue() == 0) {
                                                    if (!z13) {
                                                        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                                                    }
                                                    z14 = true;
                                                } else {
                                                    if (!z14) {
                                                        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                                                    }
                                                    hashSet5.add(l4);
                                                    z13 = true;
                                                }
                                            } else {
                                                if (!z13) {
                                                    throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                                                }
                                                z14 = true;
                                                j10 = 0;
                                            }
                                        }
                                        if (z14) {
                                            it = hashSet5.iterator();
                                            do {
                                                if (it.hasNext()) {
                                                    it2 = arrayList.iterator();
                                                    while (it2.hasNext()) {
                                                        c3824a = (C3824a) it2.next();
                                                        C21572a c21572a2 = c3824a.f11583f;
                                                        c21572aM133a2 = AbstractC0021K0.m133a(c21572a2, ((Long) c21572a2.mo39b(C21572a.f68306q0)).longValue());
                                                        if (c21572aM133a2 != null) {
                                                            Range range19 = C3836g.f11605f;
                                                            c2392v = new C2392v(7, false);
                                                            size = c3824a.f11580c;
                                                            if (size != null) {
                                                                throw new NullPointerException("Null resolution");
                                                            }
                                                            c2392v.f7436Z = size;
                                                            range3 = C3836g.f11605f;
                                                            if (range3 != null) {
                                                                throw new NullPointerException("Null expectedFrameRateRange");
                                                            }
                                                            c2392v.f7438p0 = range3;
                                                            c2392v.f7437o0 = c3175v7;
                                                            c2392v.f7440r0 = Boolean.FALSE;
                                                            c3175v2 = c3824a.f11581d;
                                                            if (c3175v2 != null) {
                                                                throw new NullPointerException("Null dynamicRange");
                                                            }
                                                            c2392v.f7437o0 = c3175v2;
                                                            c2392v.f7439q0 = c21572aM133a2;
                                                            range4 = c3824a.f11584g;
                                                            if (range4 != null) {
                                                                c2392v.f7438p0 = range4;
                                                            }
                                                            C3836g c3836gM3557n = c2392v.m3557n();
                                                            map12 = map3;
                                                            map12.put(c3824a, c3836gM3557n);
                                                        } else {
                                                            map12 = map3;
                                                        }
                                                        map3 = map12;
                                                    }
                                                    map11 = map3;
                                                    for (InterfaceC3800E0 interfaceC3800E10 : arrayList29) {
                                                        c3836g = (C3836g) map30.get(interfaceC3800E10);
                                                        C21572a c21572a3 = c3836g.f11609d;
                                                        c21572aM133a = AbstractC0021K0.m133a(c21572a3, ((Long) c21572a3.mo39b(C21572a.f68306q0)).longValue());
                                                        if (c21572aM133a != null) {
                                                            C2392v c2392vM4569a = c3836g.m4569a();
                                                            c2392vM4569a.f7439q0 = c21572aM133a;
                                                            map30.put(interfaceC3800E10, c2392vM4569a.m3557n());
                                                        }
                                                    }
                                                    break;
                                                }
                                            } while (hashSet4.contains((Long) it.next()));
                                            map11 = map3;
                                            i14 = 0;
                                            while (i14 < list2.size()) {
                                                List list16 = list2;
                                                j11 = ((C3838h) list16.get(i14)).f11614c;
                                                map13 = map10;
                                                if (map13.containsKey(Integer.valueOf(i14))) {
                                                    c3824a2 = (C3824a) map13.get(Integer.valueOf(i14));
                                                    c21572aM133a4 = AbstractC0021K0.m133a(c3824a2.f11583f, j11);
                                                    if (c21572aM133a4 != null) {
                                                        Range range20 = C3836g.f11605f;
                                                        c2392v2 = new C2392v(7, false);
                                                        size2 = c3824a2.f11580c;
                                                        if (size2 != null) {
                                                            throw new NullPointerException("Null resolution");
                                                        }
                                                        c2392v2.f7436Z = size2;
                                                        range5 = C3836g.f11605f;
                                                        if (range5 != null) {
                                                            throw new NullPointerException("Null expectedFrameRateRange");
                                                        }
                                                        c2392v2.f7438p0 = range5;
                                                        c2392v2.f7437o0 = c3175v7;
                                                        c2392v2.f7440r0 = Boolean.FALSE;
                                                        c3175v3 = c3824a2.f11581d;
                                                        if (c3175v3 != null) {
                                                            throw new NullPointerException("Null dynamicRange");
                                                        }
                                                        c2392v2.f7437o0 = c3175v3;
                                                        c2392v2.f7439q0 = c21572aM133a4;
                                                        range6 = c3824a2.f11584g;
                                                        if (range6 != null) {
                                                            c2392v2.f7438p0 = range6;
                                                        }
                                                        map11.put(c3824a2, c2392v2.m3557n());
                                                    }
                                                    map14 = map9;
                                                } else {
                                                    map14 = map9;
                                                    if (map14.containsKey(Integer.valueOf(i14))) {
                                                        throw new AssertionError(str5);
                                                    }
                                                    interfaceC3800E0 = (InterfaceC3800E0) map14.get(Integer.valueOf(i14));
                                                    c3836g2 = (C3836g) map30.get(interfaceC3800E0);
                                                    c21572aM133a3 = AbstractC0021K0.m133a(c3836g2.f11609d, j11);
                                                    if (c21572aM133a3 != null) {
                                                        C2392v c2392vM4569a2 = c3836g2.m4569a();
                                                        c2392vM4569a2.f7439q0 = c21572aM133a3;
                                                        map30.put(interfaceC3800E0, c2392vM4569a2.m3557n());
                                                    }
                                                }
                                                i14++;
                                                list2 = list16;
                                                map10 = map13;
                                                map9 = map14;
                                            }
                                            break;
                                            break;
                                        }
                                        map11 = map3;
                                        i14 = 0;
                                        while (i14 < list2.size()) {
                                            List list17 = list2;
                                            j11 = ((C3838h) list17.get(i14)).f11614c;
                                            map13 = map10;
                                            if (map13.containsKey(Integer.valueOf(i14))) {
                                                c3824a2 = (C3824a) map13.get(Integer.valueOf(i14));
                                                c21572aM133a4 = AbstractC0021K0.m133a(c3824a2.f11583f, j11);
                                                if (c21572aM133a4 != null) {
                                                    Range range21 = C3836g.f11605f;
                                                    c2392v2 = new C2392v(7, false);
                                                    size2 = c3824a2.f11580c;
                                                    if (size2 != null) {
                                                        throw new NullPointerException("Null resolution");
                                                    }
                                                    c2392v2.f7436Z = size2;
                                                    range5 = C3836g.f11605f;
                                                    if (range5 != null) {
                                                        throw new NullPointerException("Null expectedFrameRateRange");
                                                    }
                                                    c2392v2.f7438p0 = range5;
                                                    c2392v2.f7437o0 = c3175v7;
                                                    c2392v2.f7440r0 = Boolean.FALSE;
                                                    c3175v3 = c3824a2.f11581d;
                                                    if (c3175v3 != null) {
                                                        throw new NullPointerException("Null dynamicRange");
                                                    }
                                                    c2392v2.f7437o0 = c3175v3;
                                                    c2392v2.f7439q0 = c21572aM133a4;
                                                    range6 = c3824a2.f11584g;
                                                    if (range6 != null) {
                                                        c2392v2.f7438p0 = range6;
                                                    }
                                                    map11.put(c3824a2, c2392v2.m3557n());
                                                }
                                                map14 = map9;
                                            } else {
                                                map14 = map9;
                                                if (map14.containsKey(Integer.valueOf(i14))) {
                                                    throw new AssertionError(str5);
                                                }
                                                interfaceC3800E0 = (InterfaceC3800E0) map14.get(Integer.valueOf(i14));
                                                c3836g2 = (C3836g) map30.get(interfaceC3800E0);
                                                c21572aM133a3 = AbstractC0021K0.m133a(c3836g2.f11609d, j11);
                                                if (c21572aM133a3 != null) {
                                                    C2392v c2392vM4569a3 = c3836g2.m4569a();
                                                    c2392vM4569a3.f7439q0 = c21572aM133a3;
                                                    map30.put(interfaceC3800E0, c2392vM4569a3.m3557n());
                                                }
                                            }
                                            i14++;
                                            list2 = list17;
                                            map10 = map13;
                                            map9 = map14;
                                        }
                                        break;
                                        break;
                                    }
                                    z13 = false;
                                    z14 = false;
                                    while (r13.hasNext()) {
                                        c3828c = C21572a.f68306q0;
                                        if (!interfaceC3800E9.mo37O(c3828c)) {
                                            l4 = (Long) interfaceC3800E9.mo39b(c3828c);
                                            j10 = 0;
                                            if (l4.longValue() == 0) {
                                                if (!z13) {
                                                    throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                                                }
                                                z14 = true;
                                            } else {
                                                if (!z14) {
                                                    throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                                                }
                                                hashSet5.add(l4);
                                                z13 = true;
                                            }
                                        } else {
                                            if (!z13) {
                                                throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                                            }
                                            z14 = true;
                                            j10 = 0;
                                        }
                                    }
                                    if (z14) {
                                        map11 = map3;
                                        i14 = 0;
                                        while (i14 < list2.size()) {
                                            List list18 = list2;
                                            j11 = ((C3838h) list18.get(i14)).f11614c;
                                            map13 = map10;
                                            if (map13.containsKey(Integer.valueOf(i14))) {
                                                c3824a2 = (C3824a) map13.get(Integer.valueOf(i14));
                                                c21572aM133a4 = AbstractC0021K0.m133a(c3824a2.f11583f, j11);
                                                if (c21572aM133a4 != null) {
                                                    Range range22 = C3836g.f11605f;
                                                    c2392v2 = new C2392v(7, false);
                                                    size2 = c3824a2.f11580c;
                                                    if (size2 != null) {
                                                        throw new NullPointerException("Null resolution");
                                                    }
                                                    c2392v2.f7436Z = size2;
                                                    range5 = C3836g.f11605f;
                                                    if (range5 != null) {
                                                        throw new NullPointerException("Null expectedFrameRateRange");
                                                    }
                                                    c2392v2.f7438p0 = range5;
                                                    c2392v2.f7437o0 = c3175v7;
                                                    c2392v2.f7440r0 = Boolean.FALSE;
                                                    c3175v3 = c3824a2.f11581d;
                                                    if (c3175v3 != null) {
                                                        throw new NullPointerException("Null dynamicRange");
                                                    }
                                                    c2392v2.f7437o0 = c3175v3;
                                                    c2392v2.f7439q0 = c21572aM133a4;
                                                    range6 = c3824a2.f11584g;
                                                    if (range6 != null) {
                                                        c2392v2.f7438p0 = range6;
                                                    }
                                                    map11.put(c3824a2, c2392v2.m3557n());
                                                }
                                                map14 = map9;
                                            } else {
                                                map14 = map9;
                                                if (map14.containsKey(Integer.valueOf(i14))) {
                                                    throw new AssertionError(str5);
                                                }
                                                interfaceC3800E0 = (InterfaceC3800E0) map14.get(Integer.valueOf(i14));
                                                c3836g2 = (C3836g) map30.get(interfaceC3800E0);
                                                c21572aM133a3 = AbstractC0021K0.m133a(c3836g2.f11609d, j11);
                                                if (c21572aM133a3 != null) {
                                                    C2392v c2392vM4569a4 = c3836g2.m4569a();
                                                    c2392vM4569a4.f7439q0 = c21572aM133a3;
                                                    map30.put(interfaceC3800E0, c2392vM4569a4.m3557n());
                                                }
                                            }
                                            i14++;
                                            list2 = list18;
                                            map10 = map13;
                                            map9 = map14;
                                        }
                                        break;
                                        break;
                                    }
                                    it = hashSet5.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            it2 = arrayList.iterator();
                                            while (it2.hasNext()) {
                                                c3824a = (C3824a) it2.next();
                                                C21572a c21572a4 = c3824a.f11583f;
                                                c21572aM133a2 = AbstractC0021K0.m133a(c21572a4, ((Long) c21572a4.mo39b(C21572a.f68306q0)).longValue());
                                                if (c21572aM133a2 != null) {
                                                    Range range110 = C3836g.f11605f;
                                                    c2392v = new C2392v(7, false);
                                                    size = c3824a.f11580c;
                                                    if (size != null) {
                                                        throw new NullPointerException("Null resolution");
                                                    }
                                                    c2392v.f7436Z = size;
                                                    range3 = C3836g.f11605f;
                                                    if (range3 != null) {
                                                        throw new NullPointerException("Null expectedFrameRateRange");
                                                    }
                                                    c2392v.f7438p0 = range3;
                                                    c2392v.f7437o0 = c3175v7;
                                                    c2392v.f7440r0 = Boolean.FALSE;
                                                    c3175v2 = c3824a.f11581d;
                                                    if (c3175v2 != null) {
                                                        throw new NullPointerException("Null dynamicRange");
                                                    }
                                                    c2392v.f7437o0 = c3175v2;
                                                    c2392v.f7439q0 = c21572aM133a2;
                                                    range4 = c3824a.f11584g;
                                                    if (range4 != null) {
                                                        c2392v.f7438p0 = range4;
                                                    }
                                                    C3836g c3836gM3557n2 = c2392v.m3557n();
                                                    map12 = map3;
                                                    map12.put(c3824a, c3836gM3557n2);
                                                } else {
                                                    map12 = map3;
                                                }
                                                map3 = map12;
                                            }
                                            map11 = map3;
                                            while (r0.hasNext()) {
                                                c3836g = (C3836g) map30.get(interfaceC3800E10);
                                                C21572a c21572a5 = c3836g.f11609d;
                                                c21572aM133a = AbstractC0021K0.m133a(c21572a5, ((Long) c21572a5.mo39b(C21572a.f68306q0)).longValue());
                                                if (c21572aM133a != null) {
                                                    C2392v c2392vM4569a5 = c3836g.m4569a();
                                                    c2392vM4569a5.f7439q0 = c21572aM133a;
                                                    map30.put(interfaceC3800E10, c2392vM4569a5.m3557n());
                                                }
                                            }
                                            break;
                                            break;
                                        }
                                    } while (hashSet4.contains((Long) it.next()));
                                    map11 = map3;
                                    i14 = 0;
                                    while (i14 < list2.size()) {
                                        List list19 = list2;
                                        j11 = ((C3838h) list19.get(i14)).f11614c;
                                        map13 = map10;
                                        if (map13.containsKey(Integer.valueOf(i14))) {
                                            c3824a2 = (C3824a) map13.get(Integer.valueOf(i14));
                                            c21572aM133a4 = AbstractC0021K0.m133a(c3824a2.f11583f, j11);
                                            if (c21572aM133a4 != null) {
                                                Range range23 = C3836g.f11605f;
                                                c2392v2 = new C2392v(7, false);
                                                size2 = c3824a2.f11580c;
                                                if (size2 != null) {
                                                    throw new NullPointerException("Null resolution");
                                                }
                                                c2392v2.f7436Z = size2;
                                                range5 = C3836g.f11605f;
                                                if (range5 != null) {
                                                    throw new NullPointerException("Null expectedFrameRateRange");
                                                }
                                                c2392v2.f7438p0 = range5;
                                                c2392v2.f7437o0 = c3175v7;
                                                c2392v2.f7440r0 = Boolean.FALSE;
                                                c3175v3 = c3824a2.f11581d;
                                                if (c3175v3 != null) {
                                                    throw new NullPointerException("Null dynamicRange");
                                                }
                                                c2392v2.f7437o0 = c3175v3;
                                                c2392v2.f7439q0 = c21572aM133a4;
                                                range6 = c3824a2.f11584g;
                                                if (range6 != null) {
                                                    c2392v2.f7438p0 = range6;
                                                }
                                                map11.put(c3824a2, c2392v2.m3557n());
                                            }
                                            map14 = map9;
                                        } else {
                                            map14 = map9;
                                            if (map14.containsKey(Integer.valueOf(i14))) {
                                                throw new AssertionError(str5);
                                            }
                                            interfaceC3800E0 = (InterfaceC3800E0) map14.get(Integer.valueOf(i14));
                                            c3836g2 = (C3836g) map30.get(interfaceC3800E0);
                                            c21572aM133a3 = AbstractC0021K0.m133a(c3836g2.f11609d, j11);
                                            if (c21572aM133a3 != null) {
                                                C2392v c2392vM4569a6 = c3836g2.m4569a();
                                                c2392vM4569a6.f7439q0 = c21572aM133a3;
                                                map30.put(interfaceC3800E0, c2392vM4569a6.m3557n());
                                            }
                                        }
                                        i14++;
                                        list2 = list19;
                                        map10 = map13;
                                        map9 = map14;
                                    }
                                    break;
                                    break;
                                }
                                map11 = map3;
                                i14 = 0;
                                while (i14 < list2.size()) {
                                    List list110 = list2;
                                    j11 = ((C3838h) list110.get(i14)).f11614c;
                                    map13 = map10;
                                    if (map13.containsKey(Integer.valueOf(i14))) {
                                        c3824a2 = (C3824a) map13.get(Integer.valueOf(i14));
                                        c21572aM133a4 = AbstractC0021K0.m133a(c3824a2.f11583f, j11);
                                        if (c21572aM133a4 != null) {
                                            Range range24 = C3836g.f11605f;
                                            c2392v2 = new C2392v(7, false);
                                            size2 = c3824a2.f11580c;
                                            if (size2 != null) {
                                                throw new NullPointerException("Null resolution");
                                            }
                                            c2392v2.f7436Z = size2;
                                            range5 = C3836g.f11605f;
                                            if (range5 != null) {
                                                throw new NullPointerException("Null expectedFrameRateRange");
                                            }
                                            c2392v2.f7438p0 = range5;
                                            c2392v2.f7437o0 = c3175v7;
                                            c2392v2.f7440r0 = Boolean.FALSE;
                                            c3175v3 = c3824a2.f11581d;
                                            if (c3175v3 != null) {
                                                throw new NullPointerException("Null dynamicRange");
                                            }
                                            c2392v2.f7437o0 = c3175v3;
                                            c2392v2.f7439q0 = c21572aM133a4;
                                            range6 = c3824a2.f11584g;
                                            if (range6 != null) {
                                                c2392v2.f7438p0 = range6;
                                            }
                                            map11.put(c3824a2, c2392v2.m3557n());
                                        }
                                        map14 = map9;
                                    } else {
                                        map14 = map9;
                                        if (map14.containsKey(Integer.valueOf(i14))) {
                                            throw new AssertionError(str5);
                                        }
                                        interfaceC3800E0 = (InterfaceC3800E0) map14.get(Integer.valueOf(i14));
                                        c3836g2 = (C3836g) map30.get(interfaceC3800E0);
                                        c21572aM133a3 = AbstractC0021K0.m133a(c3836g2.f11609d, j11);
                                        if (c21572aM133a3 != null) {
                                            C2392v c2392vM4569a7 = c3836g2.m4569a();
                                            c2392vM4569a7.f7439q0 = c21572aM133a3;
                                            map30.put(interfaceC3800E0, c2392vM4569a7.m3557n());
                                        }
                                    }
                                    i14++;
                                    list2 = list110;
                                    map10 = map13;
                                    map9 = map14;
                                }
                                break;
                                break;
                            }
                            map11 = map3;
                            i14 = 0;
                            while (i14 < list2.size()) {
                                List list111 = list2;
                                j11 = ((C3838h) list111.get(i14)).f11614c;
                                map13 = map10;
                                if (map13.containsKey(Integer.valueOf(i14))) {
                                    c3824a2 = (C3824a) map13.get(Integer.valueOf(i14));
                                    c21572aM133a4 = AbstractC0021K0.m133a(c3824a2.f11583f, j11);
                                    if (c21572aM133a4 != null) {
                                        Range range25 = C3836g.f11605f;
                                        c2392v2 = new C2392v(7, false);
                                        size2 = c3824a2.f11580c;
                                        if (size2 != null) {
                                            throw new NullPointerException("Null resolution");
                                        }
                                        c2392v2.f7436Z = size2;
                                        range5 = C3836g.f11605f;
                                        if (range5 != null) {
                                            throw new NullPointerException("Null expectedFrameRateRange");
                                        }
                                        c2392v2.f7438p0 = range5;
                                        c2392v2.f7437o0 = c3175v7;
                                        c2392v2.f7440r0 = Boolean.FALSE;
                                        c3175v3 = c3824a2.f11581d;
                                        if (c3175v3 != null) {
                                            throw new NullPointerException("Null dynamicRange");
                                        }
                                        c2392v2.f7437o0 = c3175v3;
                                        c2392v2.f7439q0 = c21572aM133a4;
                                        range6 = c3824a2.f11584g;
                                        if (range6 != null) {
                                            c2392v2.f7438p0 = range6;
                                        }
                                        map11.put(c3824a2, c2392v2.m3557n());
                                    }
                                    map14 = map9;
                                } else {
                                    map14 = map9;
                                    if (map14.containsKey(Integer.valueOf(i14))) {
                                        throw new AssertionError(str5);
                                    }
                                    interfaceC3800E0 = (InterfaceC3800E0) map14.get(Integer.valueOf(i14));
                                    c3836g2 = (C3836g) map30.get(interfaceC3800E0);
                                    c21572aM133a3 = AbstractC0021K0.m133a(c3836g2.f11609d, j11);
                                    if (c21572aM133a3 != null) {
                                        C2392v c2392vM4569a8 = c3836g2.m4569a();
                                        c2392vM4569a8.f7439q0 = c21572aM133a3;
                                        map30.put(interfaceC3800E0, c2392vM4569a8.m3557n());
                                    }
                                }
                                i14++;
                                list2 = list111;
                                map10 = map13;
                                map9 = map14;
                            }
                            break;
                        }
                        List list20 = list4;
                        if (!((Size) list3.get(i33)).equals(list20.get(i33))) {
                            map11 = map3;
                            break;
                        }
                        i33++;
                        list4 = list20;
                    }
                    return new Pair(map30, map11);
                }
                i13 = i13;
                iIntValue2 = iIntValue2;
                map9 = map8;
                str5 = str3;
                map10 = map7;
                range2 = range9;
                while (r2.hasNext()) {
                    arrayList5 = arrayList3;
                    size3 = (Size) list3.get(arrayList5.indexOf(Integer.valueOf(arrayList2.indexOf(interfaceC3800E8))));
                    Range range111 = C3836g.f11605f;
                    c2392v3 = new C2392v(7, false);
                    if (size3 != null) {
                        throw new NullPointerException("Null resolution");
                    }
                    c2392v3.f7436Z = size3;
                    range7 = C3836g.f11605f;
                    if (range7 != null) {
                        throw new NullPointerException("Null expectedFrameRateRange");
                    }
                    c2392v3.f7438p0 = range7;
                    C3175v c3175v8 = c3175v;
                    c2392v3.f7437o0 = c3175v8;
                    c2392v3.f7440r0 = Boolean.FALSE;
                    HashMap map210 = map4;
                    C3175v c3175v9 = (C3175v) map210.get(interfaceC3800E8);
                    c3175v9.getClass();
                    c2392v3.f7437o0 = c3175v9;
                    c3825a0M4558d = C3825a0.m4558d();
                    c3828c2 = C21572a.f68306q0;
                    if (interfaceC3800E8.mo37O(c3828c2)) {
                        c3825a0M4558d.m4561x(c3828c2, (Long) interfaceC3800E8.mo39b(c3828c2));
                    }
                    c3828c3 = InterfaceC3800E0.f11491B;
                    if (interfaceC3800E8.mo37O(c3828c3)) {
                        c3825a0M4558d.m4561x(c3828c3, (Boolean) interfaceC3800E8.mo39b(c3828c3));
                    }
                    c3828c4 = C3815Q.f11548Z;
                    if (interfaceC3800E8.mo37O(c3828c4)) {
                        c3825a0M4558d.m4561x(c3828c4, (Integer) interfaceC3800E8.mo39b(c3828c4));
                    }
                    c3828c5 = InterfaceC3816S.f11560j;
                    if (interfaceC3800E8.mo37O(c3828c5)) {
                        c3825a0M4558d.m4561x(c3828c5, (Integer) interfaceC3800E8.mo39b(c3828c5));
                    }
                    c2392v3.f7439q0 = new C21572a(c3825a0M4558d, 8);
                    c2392v3.f7440r0 = Boolean.valueOf(z10);
                    if (range2 != null) {
                        c2392v3.f7438p0 = range2;
                    }
                    map2.put(interfaceC3800E8, c2392v3.m3557n());
                    map4 = map210;
                    c3175v = c3175v8;
                    arrayList3 = arrayList5;
                }
                C3175v c3175v10 = c3175v;
                HashMap map31 = map2;
                if (list2 == null) {
                    map11 = map3;
                    break;
                }
                map11 = map3;
                break;
                return new Pair(map31, map11);
            }
            InterfaceC3800E0 interfaceC3800E11 = (InterfaceC3800E0) it9.next();
            C3175v c3175vMo40c2 = interfaceC3800E11.mo40c();
            String strMo33F = interfaceC3800E11.mo33F();
            if (!c3175vMo40c2.m4023b()) {
                it3 = it9;
                int i34 = c3175vMo40c2.f9581a;
                arrayList7 = arrayList10;
                int i35 = c3175vMo40c2.f9582b;
                if (i34 == 1 && i35 == 0) {
                    if (!hashSet.contains(c3175v4)) {
                        set = setMo2110c;
                        c3175v4 = null;
                        break;
                    }
                    set = setMo2110c;
                } else {
                    C3175v c3175vM335l = C0093v0.m335l(c3175vMo40c2, linkedHashSet, hashSet);
                    set = setMo2110c;
                    if (c3175vM335l == null) {
                        c3175vM335l = C0093v0.m335l(c3175vMo40c2, linkedHashSet2, hashSet);
                        if (c3175vM335l != null) {
                            AbstractC8072d6.m8486c("DynamicRangeResolver", "Resolved dynamic range for use case " + strMo33F + " from concurrently bound use case.\n" + c3175vMo40c2 + "\n->\n" + c3175vM335l);
                        } else if (!C0093v0.m333g(c3175vMo40c2, c3175v4, hashSet)) {
                            if (i34 == 2 && (i35 == 10 || i35 == 0)) {
                                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                if (Build.VERSION.SDK_INT >= 33) {
                                    c3175vM324b = AbstractC0091u0.m324b((C0703j) c0093v0.f404o0);
                                    if (c3175vM324b != null) {
                                        linkedHashSet3.add(c3175vM324b);
                                    }
                                } else {
                                    c3175vM324b = null;
                                }
                                linkedHashSet3.add(C3175v.f9576e);
                                c3175vM335l = C0093v0.m335l(c3175vMo40c2, linkedHashSet3, hashSet);
                                if (c3175vM335l != null) {
                                    StringBuilder sbM9896o = AbstractC9306j0.m9896o("Resolved dynamic range for use case ", strMo33F, " from ", c3175vM335l.equals(c3175vM324b) ? "recommended" : ParameterNames.REQUIRED, " 10-bit supported dynamic range.\n");
                                    sbM9896o.append(c3175vMo40c2);
                                    sbM9896o.append("\n->\n");
                                    sbM9896o.append(c3175vM335l);
                                    AbstractC8072d6.m8486c("DynamicRangeResolver", sbM9896o.toString());
                                }
                            }
                            Iterator it30 = hashSet.iterator();
                            while (true) {
                                if (!it30.hasNext()) {
                                    c3175v4 = null;
                                    break;
                                }
                                C3175v c3175v11 = (C3175v) it30.next();
                                Iterator it31 = it30;
                                AbstractC4941g.m5559R("Candidate dynamic range must be fully specified.", c3175v11.m4023b());
                                if (!c3175v11.equals(c3175v4) && C0093v0.m332f(c3175vMo40c2, c3175v11)) {
                                    AbstractC8072d6.m8486c("DynamicRangeResolver", "Resolved dynamic range for use case " + strMo33F + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + c3175vMo40c2 + "\n->\n" + c3175v11);
                                    c3175v4 = c3175v11;
                                    break;
                                }
                                it30 = it31;
                            }
                        } else {
                            AbstractC8072d6.m8486c("DynamicRangeResolver", "Resolved dynamic range for use case " + strMo33F + " to no compatible HDR dynamic ranges.\n" + c3175vMo40c2 + "\n->\n" + c3175v4);
                        }
                    } else {
                        AbstractC8072d6.m8486c("DynamicRangeResolver", "Resolved dynamic range for use case " + strMo33F + " from existing attached surface.\n" + c3175vMo40c2 + "\n->\n" + c3175vM335l);
                    }
                    c3175v4 = c3175vM335l;
                }
            } else {
                if (!hashSet.contains(c3175vMo40c2)) {
                    set = setMo2110c;
                    it3 = it9;
                    arrayList7 = arrayList10;
                    c3175v4 = null;
                    break;
                }
                set = setMo2110c;
                it3 = it9;
                arrayList7 = arrayList10;
                c3175v4 = c3175vMo40c2;
            }
            if (c3175v4 == null) {
                String strMo33F2 = interfaceC3800E11.mo33F();
                String str15 = tpXhEMGxfXFVSh.DOCfDVc;
                throw new IllegalArgumentException("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  " + strMo33F2 + "\nRequested dynamic range:\n  " + c3175vMo40c2 + "\nSupported dynamic ranges:\n  " + TextUtils.join(str15, set) + "\nConstrained set of concurrent dynamic ranges:\n  " + TextUtils.join(str15, hashSet));
            }
            C0093v0.m328A(hashSet, c3175v4, c13287b);
            map17.put(interfaceC3800E11, c3175v4);
            if (!linkedHashSet.contains(c3175v4)) {
                linkedHashSet2.add(c3175v4);
            }
            it9 = it3;
            arrayList10 = arrayList7;
            setMo2110c = set;
        }
    }

    /* JADX INFO: renamed from: h */
    public final Pair m156h(int i10, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i11, HashMap map, HashMap map2) {
        int outputMinFrameDuration;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3824a c3824a = (C3824a) it.next();
            arrayList4.add(c3824a.f11578a);
            if (map != null) {
                map.put(Integer.valueOf(arrayList4.size() - 1), c3824a);
            }
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            Size size = (Size) list.get(i12);
            InterfaceC3800E0 interfaceC3800E0 = (InterfaceC3800E0) arrayList2.get(((Integer) arrayList3.get(i12)).intValue());
            int inputFormat = interfaceC3800E0.getInputFormat();
            arrayList4.add(C3838h.m4571b(i10, inputFormat, size, m157i(inputFormat)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList4.size() - 1), interfaceC3800E0);
            }
            try {
                outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.f129k.m1476a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(interfaceC3800E0.getInputFormat(), size));
            } catch (Exception unused) {
                outputMinFrameDuration = 0;
            }
            i11 = Math.min(i11, outputMinFrameDuration);
        }
        return new Pair(arrayList4, Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: i */
    public final C3840i m157i(int i10) {
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = this.f138t;
        if (!arrayList.contains(Integer.valueOf(i10))) {
            m158j(this.f137s.f11616b, AbstractC6542b.f21173d, i10);
            m158j(this.f137s.f11618d, AbstractC6542b.f21175f, i10);
            HashMap map = this.f137s.f11620f;
            C0703j c0703j = this.f129k;
            Size sizeM149c = m149c((StreamConfigurationMap) ((C3032c) c0703j.m1477b().f34018Y).f9127Z, i10, true);
            if (sizeM149c != null) {
                map.put(Integer.valueOf(i10), sizeM149c);
            }
            HashMap map2 = this.f137s.f11621g;
            if (Build.VERSION.SDK_INT >= 31 && this.f136r && (streamConfigurationMap = (StreamConfigurationMap) c0703j.m1476a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(Integer.valueOf(i10), m149c(streamConfigurationMap, i10, true));
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return this.f137s;
    }

    /* JADX INFO: renamed from: j */
    public final void m158j(HashMap map, Size size, int i10) {
        if (this.f134p) {
            Size sizeM149c = m149c((StreamConfigurationMap) ((C3032c) this.f129k.m1477b().f34018Y).f9127Z, i10, false);
            Integer numValueOf = Integer.valueOf(i10);
            if (sizeM149c != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeM149c), new C4493d(false));
            }
            map.put(numValueOf, size);
        }
    }
}
