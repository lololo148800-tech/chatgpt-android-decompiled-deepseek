package p003A1;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.p650ui.platform.AndroidComposeView;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import mm.InterfaceC17302e;
import p001A.C0013G0;
import p001A.RunnableC0000A;
import p025An.C0644w;
import p030B2.C0747b;
import p049Bm.InterfaceC1440o;
import p056C2.C1512f;
import p077Cn.C1743k;
import p1140z1.AbstractC21678Y;
import p1140z1.C21658D;
import p156G1.AbstractC2962i;
import p156G1.C2954a;
import p156G1.C2959f;
import p156G1.C2960g;
import p156G1.C2961h;
import p156G1.C2963j;
import p156G1.C2968o;
import p156G1.C2971r;
import p156G1.C2974u;
import p180H1.EnumC3197a;
import p200Hm.C3505d;
import p204I1.C3578I;
import p204I1.C3581L;
import p204I1.C3590f;
import p310M9.C5311e;
import p523V9.AbstractC8017W3;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8111i5;
import p530Vi.AbstractC8301I;
import p594Y9.AbstractC9918k3;
import p692d0.AbstractC12971j;
import p692d0.AbstractC12972k;
import p692d0.AbstractC12973l;
import p692d0.C12960M;
import p692d0.C12967f;
import p692d0.C12980s;
import p692d0.C12981t;
import p692d0.C12982u;
import p692d0.C12983v;
import p759g1.C13800b;
import p759g1.C13801c;
import p774h1.AbstractC14334L;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17685s;
import p909nm.C17689w;
import p960q9.C18655i;

/* JADX INFO: renamed from: A1.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0203S extends C0747b {

    /* JADX INFO: renamed from: N */
    public static final C12981t f751N;

    /* JADX INFO: renamed from: A */
    public C12982u f752A;

    /* JADX INFO: renamed from: B */
    public final C12983v f753B;

    /* JADX INFO: renamed from: C */
    public final C12980s f754C;

    /* JADX INFO: renamed from: D */
    public final C12980s f755D;

    /* JADX INFO: renamed from: E */
    public final String f756E;

    /* JADX INFO: renamed from: F */
    public final String f757F;

    /* JADX INFO: renamed from: G */
    public final C5311e f758G;

    /* JADX INFO: renamed from: H */
    public final C12982u f759H;

    /* JADX INFO: renamed from: I */
    public C0294u1 f760I;

    /* JADX INFO: renamed from: J */
    public boolean f761J;

    /* JADX INFO: renamed from: K */
    public final RunnableC0000A f762K;

    /* JADX INFO: renamed from: L */
    public final ArrayList f763L;

    /* JADX INFO: renamed from: M */
    public final C0192O f764M;

    /* JADX INFO: renamed from: d */
    public final AndroidComposeView f765d;

    /* JADX INFO: renamed from: e */
    public int f766e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f */
    public final C0192O f767f = new C0192O(this, 0);

    /* JADX INFO: renamed from: g */
    public final AccessibilityManager f768g;

    /* JADX INFO: renamed from: h */
    public long f769h;

    /* JADX INFO: renamed from: i */
    public final AccessibilityManagerAccessibilityStateChangeListenerC0162E f770i;

    /* JADX INFO: renamed from: j */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC0165F f771j;

    /* JADX INFO: renamed from: k */
    public List f772k;

    /* JADX INFO: renamed from: l */
    public final Handler f773l;

    /* JADX INFO: renamed from: m */
    public final C0180K f774m;

    /* JADX INFO: renamed from: n */
    public int f775n;

    /* JADX INFO: renamed from: o */
    public C1512f f776o;

    /* JADX INFO: renamed from: p */
    public boolean f777p;

    /* JADX INFO: renamed from: q */
    public final C12982u f778q;

    /* JADX INFO: renamed from: r */
    public final C12982u f779r;

    /* JADX INFO: renamed from: s */
    public final C12960M f780s;

    /* JADX INFO: renamed from: t */
    public final C12960M f781t;

    /* JADX INFO: renamed from: u */
    public int f782u;

    /* JADX INFO: renamed from: v */
    public Integer f783v;

    /* JADX INFO: renamed from: w */
    public final C12967f f784w;

    /* JADX INFO: renamed from: x */
    public final C1743k f785x;

    /* JADX INFO: renamed from: y */
    public boolean f786y;

    /* JADX INFO: renamed from: z */
    public C0186M f787z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i10 = AbstractC12971j.f41181a;
        C12981t c12981t = new C12981t(32);
        int i11 = c12981t.f41203b;
        if (i11 < 0) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i11, "Index ", " must be in 0..");
            sbM11057o.append(c12981t.f41203b);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        int i12 = i11 + 32;
        c12981t.m14685b(i12);
        int[] iArr2 = c12981t.f41202a;
        int i13 = c12981t.f41203b;
        if (i11 != i13) {
            AbstractC17678l.m19303j(i12, i11, i13, iArr2, iArr2);
        }
        AbstractC17678l.m19307n(i11, 0, 12, iArr, iArr2);
        c12981t.f41203b += 32;
        f751N = c12981t;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [A1.E] */
    /* JADX WARN: Type inference failed for: r2v5, types: [A1.F] */
    public C0203S(AndroidComposeView androidComposeView) {
        this.f765d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f768g = accessibilityManager;
        this.f769h = 100L;
        this.f770i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: A1.E
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z6) {
                C0203S c0203s = this.f643a;
                c0203s.f772k = z6 ? c0203s.f768g.getEnabledAccessibilityServiceList(-1) : C17689w.f56480Y;
            }
        };
        this.f771j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: A1.F
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z6) {
                C0203S c0203s = this.f647a;
                c0203s.f772k = c0203s.f768g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f772k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f773l = new Handler(Looper.getMainLooper());
        this.f774m = new C0180K(this, 0);
        this.f775n = Integer.MIN_VALUE;
        this.f778q = new C12982u();
        this.f779r = new C12982u();
        this.f780s = new C12960M(0);
        this.f781t = new C12960M(0);
        this.f782u = -1;
        this.f784w = new C12967f(0);
        this.f785x = AbstractC8017W3.m8337a(1, 6, null);
        this.f786y = true;
        C12982u c12982u = AbstractC12972k.f41182a;
        AbstractC16544l.m18092e(c12982u, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f752A = c12982u;
        this.f753B = new C12983v();
        this.f754C = new C12980s();
        this.f755D = new C12980s();
        this.f756E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f757F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f758G = new C5311e(10);
        this.f759H = new C12982u();
        C2968o c2968oM3805a = androidComposeView.getSemanticsOwner().m3805a();
        AbstractC16544l.m18092e(c12982u, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f760I = new C0294u1(c2968oM3805a, c12982u);
        androidComposeView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0171H(this, 0));
        this.f762K = new RunnableC0000A(this, 8);
        this.f763L = new ArrayList();
        this.f764M = new C0192O(this, 1);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r3v2, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: B */
    public static final boolean m615B(C2961h c2961h, float f10) {
        ?? r6 = c2961h.f8850a;
        return (f10 < 0.0f && ((Number) r6.invoke()).floatValue() > 0.0f) || (f10 > 0.0f && ((Number) r6.invoke()).floatValue() < ((Number) c2961h.f8851b.invoke()).floatValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r3v1, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: C */
    public static final boolean m616C(C2961h c2961h) {
        ?? r6 = c2961h.f8850a;
        float fFloatValue = ((Number) r6.invoke()).floatValue();
        boolean z6 = c2961h.f8852c;
        return (fFloatValue > 0.0f && !z6) || (((Number) r6.invoke()).floatValue() < ((Number) c2961h.f8851b.invoke()).floatValue() && z6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: D */
    public static final boolean m617D(C2961h c2961h) {
        ?? r6 = c2961h.f8850a;
        float fFloatValue = ((Number) r6.invoke()).floatValue();
        float fFloatValue2 = ((Number) c2961h.f8851b.invoke()).floatValue();
        boolean z6 = c2961h.f8852c;
        return (fFloatValue < fFloatValue2 && !z6) || (((Number) r6.invoke()).floatValue() > 0.0f && z6);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m618I(C0203S c0203s, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        c0203s.m627H(i10, i11, num, null);
    }

    /* JADX INFO: renamed from: Q */
    public static CharSequence m619Q(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i10 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i10 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
                AbstractC16544l.m18092e(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m620u(C2968o c2968o) {
        Object obj = c2968o.f8889d.f8880Y.get(C2971r.f8909B);
        if (obj == null) {
            obj = null;
        }
        EnumC3197a enumC3197a = (EnumC3197a) obj;
        C2974u c2974u = C2971r.f8933s;
        LinkedHashMap linkedHashMap = c2968o.f8889d.f8880Y;
        Object obj2 = linkedHashMap.get(c2974u);
        if (obj2 == null) {
            obj2 = null;
        }
        C2960g c2960g = (C2960g) obj2;
        boolean z6 = enumC3197a != null;
        Object obj3 = linkedHashMap.get(C2971r.f8908A);
        if (((Boolean) (obj3 != null ? obj3 : null)) != null) {
            return c2960g != null ? C2960g.m3783a(c2960g.f8849a, 4) : false ? z6 : true;
        }
        return z6;
    }

    /* JADX INFO: renamed from: w */
    public static C3590f m621w(C2968o c2968o) {
        Object obj = c2968o.f8889d.f8880Y.get(C2971r.f8938x);
        if (obj == null) {
            obj = null;
        }
        C3590f c3590f = (C3590f) obj;
        Object obj2 = c2968o.f8889d.f8880Y.get(C2971r.f8935u);
        if (obj2 == null) {
            obj2 = null;
        }
        List list = (List) obj2;
        return c3590f == null ? list != null ? (C3590f) AbstractC17680n.m19343S(list) : null : c3590f;
    }

    /* JADX INFO: renamed from: x */
    public static String m622x(C2968o c2968o) {
        C3590f c3590f;
        if (c2968o == null) {
            return null;
        }
        C2974u c2974u = C2971r.f8915a;
        C2963j c2963j = c2968o.f8889d;
        LinkedHashMap linkedHashMap = c2963j.f8880Y;
        if (linkedHashMap.containsKey(c2974u)) {
            return AbstractC9918k3.m10573a((List) c2963j.m3786j(c2974u), Separators.COMMA, null, 62);
        }
        C2974u c2974u2 = C2971r.f8938x;
        if (linkedHashMap.containsKey(c2974u2)) {
            Object obj = linkedHashMap.get(c2974u2);
            if (obj == null) {
                obj = null;
            }
            C3590f c3590f2 = (C3590f) obj;
            if (c3590f2 != null) {
                return c3590f2.f10934Y;
            }
            return null;
        }
        Object obj2 = linkedHashMap.get(C2971r.f8935u);
        if (obj2 == null) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list == null || (c3590f = (C3590f) AbstractC17680n.m19343S(list)) == null) {
            return null;
        }
        return c3590f.f10934Y;
    }

    /* JADX INFO: renamed from: A */
    public final void m623A(C21658D c21658d) {
        if (this.f784w.add(c21658d)) {
            this.f785x.mo2524p(C17296C.f55119a);
        }
    }

    /* JADX INFO: renamed from: E */
    public final int m624E(int i10) {
        if (i10 == this.f765d.getSemanticsOwner().m3805a().f8892g) {
            return -1;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x008a A[LOOP:1: B:16:0x004d->B:29:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x008c A[EDGE_INSN: B:43:0x008c->B:30:0x008c BREAK  A[LOOP:1: B:16:0x004d->B:29:0x008a], SYNTHETIC] */
    /* JADX INFO: renamed from: F */
    public final void m625F(C2968o c2968o, C0294u1 c0294u1) {
        int[] iArr = AbstractC12973l.f41183a;
        C12983v c12983v = new C12983v();
        List listM3790h = C2968o.m3790h(c2968o, true, 4);
        int size = listM3790h.size();
        int i10 = 0;
        while (true) {
            C21658D c21658d = c2968o.f8888c;
            if (i10 >= size) {
                C12983v c12983v2 = c0294u1.f1065b;
                int[] iArr2 = c12983v2.f41211b;
                long[] jArr = c12983v2.f41210a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr[i11];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i11 != length) {
                                break;
                                break;
                            }
                            i11++;
                        } else {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j10 & 255) < 128 && !c12983v.m14700c(iArr2[(i11 << 3) + i13])) {
                                    m623A(c21658d);
                                    return;
                                }
                                j10 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            } else if (i11 != length) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                List listM3790h2 = C2968o.m3790h(c2968o, true, 4);
                int size2 = listM3790h2.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    C2968o c2968o2 = (C2968o) listM3790h2.get(i14);
                    if (m647t().m14690b(c2968o2.f8892g)) {
                        Object objM14694f = this.f759H.m14694f(c2968o2.f8892g);
                        AbstractC16544l.m18091d(objM14694f);
                        m625F(c2968o2, (C0294u1) objM14694f);
                    }
                }
                return;
            }
            C2968o c2968o3 = (C2968o) listM3790h.get(i10);
            if (m647t().m14690b(c2968o3.f8892g)) {
                C12983v c12983v3 = c0294u1.f1065b;
                int i15 = c2968o3.f8892g;
                if (!c12983v3.m14700c(i15)) {
                    m623A(c21658d);
                    return;
                }
                c12983v.m14698a(i15);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m626G(AccessibilityEvent accessibilityEvent) {
        if (!m649y()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f777p = true;
        }
        try {
            return ((Boolean) this.f767f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f777p = false;
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m627H(int i10, int i11, Integer num, List list) {
        if (i10 == Integer.MIN_VALUE || !m649y()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM642o = m642o(i10, i11);
        if (num != null) {
            accessibilityEventM642o.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM642o.setContentDescription(AbstractC9918k3.m10573a(list, Separators.COMMA, null, 62));
        }
        Trace.beginSection("sendEvent");
        try {
            return m626G(accessibilityEventM642o);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m628J(int i10, int i11, String str) {
        AccessibilityEvent accessibilityEventM642o = m642o(m624E(i10), 32);
        accessibilityEventM642o.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventM642o.getText().add(str);
        }
        m626G(accessibilityEventM642o);
    }

    /* JADX INFO: renamed from: K */
    public final void m629K(int i10) {
        C0186M c0186m = this.f787z;
        if (c0186m != null) {
            C2968o c2968o = (C2968o) c0186m.f698f;
            if (i10 != c2968o.f8892g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0186m.f694b <= 1000) {
                AccessibilityEvent accessibilityEventM642o = m642o(m624E(c2968o.f8892g), 131072);
                accessibilityEventM642o.setFromIndex(c0186m.f696d);
                accessibilityEventM642o.setToIndex(c0186m.f697e);
                accessibilityEventM642o.setAction(c0186m.f693a);
                accessibilityEventM642o.setMovementGranularity(c0186m.f695c);
                accessibilityEventM642o.getText().add(m622x(c2968o));
                m626G(accessibilityEventM642o);
            }
        }
        this.f787z = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0260  */
    /* JADX WARN: Code duplicated, block: B:101:0x027c  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:108:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:110:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:114:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:117:0x02da  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:132:0x0307 A[LOOP:4: B:127:0x02f6->B:132:0x0307, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x0315  */
    /* JADX WARN: Code duplicated, block: B:140:0x0329 A[LOOP:5: B:135:0x0311->B:140:0x0329, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x0345 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x034b  */
    /* JADX WARN: Code duplicated, block: B:148:0x034e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x0355  */
    /* JADX WARN: Code duplicated, block: B:153:0x0359 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x0385  */
    /* JADX WARN: Code duplicated, block: B:159:0x03b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:163:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:164:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:168:0x0411  */
    /* JADX WARN: Code duplicated, block: B:171:0x0416  */
    /* JADX WARN: Code duplicated, block: B:176:0x045a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0464  */
    /* JADX WARN: Code duplicated, block: B:179:0x0466  */
    /* JADX WARN: Code duplicated, block: B:183:0x0478  */
    /* JADX WARN: Code duplicated, block: B:186:0x0489 A[LOOP:3: B:182:0x0476->B:186:0x0489, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:190:0x0496  */
    /* JADX WARN: Code duplicated, block: B:193:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:197:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:198:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:202:0x04de  */
    /* JADX WARN: Code duplicated, block: B:204:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:206:0x0500  */
    /* JADX WARN: Code duplicated, block: B:208:0x050c  */
    /* JADX WARN: Code duplicated, block: B:213:0x051c  */
    /* JADX WARN: Code duplicated, block: B:215:0x0527  */
    /* JADX WARN: Code duplicated, block: B:217:0x052d  */
    /* JADX WARN: Code duplicated, block: B:220:0x0534  */
    /* JADX WARN: Code duplicated, block: B:227:0x0569  */
    /* JADX WARN: Code duplicated, block: B:232:0x058f  */
    /* JADX WARN: Code duplicated, block: B:234:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:236:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:237:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:240:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:243:0x05be  */
    /* JADX WARN: Code duplicated, block: B:245:0x05c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x05c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:266:0x0623  */
    /* JADX WARN: Code duplicated, block: B:276:0x055b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x054d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0571 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x040b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x046e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0587 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0511 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x0539 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x048c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x030e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0310 A[EDGE_INSN: B:305:0x0310->B:134:0x0310 BREAK  A[LOOP:4: B:127:0x02f6->B:132:0x0307], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x032e A[EDGE_INSN: B:307:0x032e->B:141:0x032e BREAK  A[LOOP:5: B:135:0x0311->B:140:0x0329], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0114  */
    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:57:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0169  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x0201  */
    /* JADX WARN: Code duplicated, block: B:88:0x0214  */
    /* JADX WARN: Code duplicated, block: B:91:0x0219  */
    /* JADX WARN: Code duplicated, block: B:92:0x021f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0222  */
    /* JADX WARN: Code duplicated, block: B:96:0x0227  */
    /* JADX WARN: Code duplicated, block: B:98:0x0241  */
    /* JADX WARN: Not found block with instruction: 0x02f3: MOVE (r0v21 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] (LINE:756) */
    /* JADX INFO: renamed from: L */
    public final void m630L(C12982u c12982u) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i13;
        int i14;
        int i15;
        C0291t1 c0291t1;
        boolean z6;
        LinkedHashMap linkedHashMap;
        C2974u c2974u;
        C2974u c2974u2;
        String str;
        char c9;
        boolean zM18089b;
        int i16;
        int i17;
        C2974u c2974u3;
        boolean zM18089b2;
        C21658D c21658d;
        LinkedHashMap linkedHashMap2;
        Object obj;
        C2960g c2960g;
        boolean zM3783a;
        char c10;
        Object obj2;
        AccessibilityEvent accessibilityEventM642o;
        Object obj3;
        String strM10573a;
        Object obj4;
        List list;
        String strM10573a2;
        char c11;
        C2974u c2974u4;
        String str2;
        Object obj5;
        C3590f c3590f;
        Object obj6;
        CharSequence charSequence;
        CharSequence charSequenceM619Q;
        int length;
        int length2;
        int i18;
        int i19;
        int i20;
        boolean zContainsKey;
        boolean z10;
        boolean z11;
        AccessibilityEvent accessibilityEventM643p;
        int i21;
        C2974u c2974u5;
        boolean zM18089b3;
        int i22;
        Object obj7;
        C3590f c3590f2;
        String str3;
        boolean zM18089b4;
        int size;
        int i23;
        C0291t1 c0291t2;
        Object obj8;
        Object obj9;
        Object value;
        C2974u c2974u6;
        C2954a c2954a;
        Object obj10;
        C2954a c2954a2;
        boolean z12;
        List list2;
        Object obj11;
        List list3;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        Object value2;
        Object obj12;
        C12982u c12982u2 = c12982u;
        ArrayList arrayList3 = this.f763L;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int[] iArr3 = c12982u2.f41205b;
        long[] jArr3 = c12982u2.f41204a;
        int length3 = jArr3.length - 2;
        if (length3 < 0) {
            return;
        }
        int i24 = 0;
        while (true) {
            long j10 = jArr3[i24];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i25 = 8;
                int i26 = 8 - ((~(i24 - length3)) >>> 31);
                long j11 = j10;
                int i27 = 0;
                while (i27 < i26) {
                    if ((j11 & 255) < 128) {
                        int i28 = iArr3[(i24 << 3) + i27];
                        C0294u1 c0294u1 = (C0294u1) this.f759H.m14694f(i28);
                        if (c0294u1 == null) {
                            i11 = i27;
                            i12 = i26;
                            arrayList2 = arrayList4;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i13 = length3;
                            i14 = i25;
                        } else {
                            C0297v1 c0297v1 = (C0297v1) c12982u2.m14694f(i28);
                            C2968o c2968o = c0297v1 != null ? c0297v1.f1070a : null;
                            if (c2968o == null) {
                                AbstractC8111i5.m8593d("no value for specified key");
                                throw null;
                            }
                            C2963j c2963j = c2968o.f8889d;
                            Iterator it = c2963j.iterator();
                            boolean z13 = false;
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                C2963j c2963j2 = c0294u1.f1064a;
                                if (!zHasNext) {
                                    int i29 = i28;
                                    i11 = i27;
                                    arrayList2 = arrayList4;
                                    iArr2 = iArr3;
                                    jArr2 = jArr3;
                                    i13 = length3;
                                    i14 = 8;
                                    C2968o c2968o2 = c2968o;
                                    i12 = i26;
                                    if (!z13) {
                                        Iterator it2 = c2963j2.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                z13 = false;
                                                break;
                                            } else {
                                                if (!c2968o2.m3798i().f8880Y.containsKey((C2974u) ((Map.Entry) it2.next()).getKey())) {
                                                    z13 = true;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    if (!z13) {
                                        break;
                                    }
                                    m618I(this, m624E(i29), 2048, 0, 8);
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                Object key = entry.getKey();
                                C0294u1 c0294u2 = c0294u1;
                                C2974u c2974u7 = C2971r.f8929o;
                                if (AbstractC16544l.m18089b(key, c2974u7)) {
                                    i15 = i27;
                                } else {
                                    i15 = i27;
                                    if (!AbstractC16544l.m18089b(entry.getKey(), C2971r.f8930p)) {
                                        z6 = false;
                                    }
                                    linkedHashMap = c2963j2.f8880Y;
                                    if (z6) {
                                        c2974u = (C2974u) entry.getKey();
                                        c2974u2 = C2971r.f8918d;
                                        if (AbstractC16544l.m18089b(c2974u, c2974u2)) {
                                            Object value3 = entry.getValue();
                                            AbstractC16544l.m18092e(value3, "null cannot be cast to non-null type kotlin.String");
                                            str = (String) value3;
                                            if (linkedHashMap.containsKey(c2974u2)) {
                                                m628J(i28, 8, str);
                                                c9 = '\b';
                                            } else {
                                                c9 = '\b';
                                            }
                                        } else {
                                            if (AbstractC16544l.m18089b(c2974u, C2971r.f8916b)) {
                                                zM18089b = true;
                                            } else {
                                                zM18089b = AbstractC16544l.m18089b(c2974u, C2971r.f8909B);
                                            }
                                            if (zM18089b) {
                                                m618I(this, m624E(i28), 2048, 64, 8);
                                                m618I(this, m624E(i28), 2048, 0, 8);
                                                c9 = '\b';
                                            } else {
                                                i16 = i26;
                                                if (AbstractC16544l.m18089b(c2974u, C2971r.f8917c)) {
                                                    m618I(this, m624E(i28), 2048, 64, 8);
                                                    m618I(this, m624E(i28), 2048, 0, 8);
                                                    arrayList4 = arrayList4;
                                                    iArr3 = iArr3;
                                                    c9 = '\b';
                                                } else {
                                                    c2974u3 = C2971r.f8908A;
                                                    zM18089b2 = AbstractC16544l.m18089b(c2974u, c2974u3);
                                                    c21658d = c2968o.f8888c;
                                                    arrayList4 = arrayList4;
                                                    linkedHashMap2 = c2963j.f8880Y;
                                                    iArr3 = iArr3;
                                                    if (zM18089b2) {
                                                        obj = linkedHashMap2.get(C2971r.f8933s);
                                                        if (obj == null) {
                                                            obj = null;
                                                        }
                                                        c2960g = (C2960g) obj;
                                                        if (c2960g == null) {
                                                            zM3783a = false;
                                                        } else {
                                                            zM3783a = C2960g.m3783a(c2960g.f8849a, 4);
                                                        }
                                                        if (zM3783a) {
                                                            obj2 = linkedHashMap2.get(c2974u3);
                                                            if (obj2 == null) {
                                                                obj2 = null;
                                                            }
                                                            if (AbstractC16544l.m18089b(obj2, Boolean.TRUE)) {
                                                                accessibilityEventM642o = m642o(m624E(i28), 4);
                                                                C2968o c2968o3 = new C2968o(c2968o.f8886a, true, c21658d, c2963j);
                                                                obj3 = c2968o3.m3798i().f8880Y.get(C2971r.f8915a);
                                                                if (obj3 == null) {
                                                                    obj3 = null;
                                                                }
                                                                List list4 = (List) obj3;
                                                                if (list4 != null) {
                                                                }
                                                                obj4 = c2968o3.m3798i().f8880Y.get(C2971r.f8935u);
                                                                if (obj4 == null) {
                                                                    obj4 = null;
                                                                }
                                                                list = (List) obj4;
                                                                if (list != null) {
                                                                    strM10573a2 = AbstractC9918k3.m10573a(list, Separators.COMMA, null, 62);
                                                                } else {
                                                                    strM10573a2 = null;
                                                                }
                                                                if (strM10573a != null) {
                                                                    accessibilityEventM642o.setContentDescription(strM10573a);
                                                                }
                                                                if (strM10573a2 != null) {
                                                                    accessibilityEventM642o.getText().add(strM10573a2);
                                                                }
                                                                m626G(accessibilityEventM642o);
                                                                c2968o = c2968o;
                                                                i28 = i28;
                                                                jArr3 = jArr3;
                                                                length3 = length3;
                                                                c0294u2 = c0294u2;
                                                                i15 = i15;
                                                                i17 = i16;
                                                                c9 = '\b';
                                                            } else {
                                                                c10 = '\b';
                                                                m618I(this, m624E(i28), 2048, 0, 8);
                                                            }
                                                        } else {
                                                            c10 = '\b';
                                                            m618I(this, m624E(i28), 2048, 64, 8);
                                                            m618I(this, m624E(i28), 2048, 0, 8);
                                                        }
                                                        c2968o = c2968o;
                                                        i28 = i28;
                                                        jArr3 = jArr3;
                                                        length3 = length3;
                                                        c0294u2 = c0294u2;
                                                        i15 = i15;
                                                        i17 = i16;
                                                        c9 = c10;
                                                    } else {
                                                        c11 = '\b';
                                                        if (AbstractC16544l.m18089b(c2974u, C2971r.f8915a)) {
                                                            int iM624E = m624E(i28);
                                                            Object value4 = entry.getValue();
                                                            AbstractC16544l.m18092e(value4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                            m627H(iM624E, 2048, 4, (List) value4);
                                                            c9 = '\b';
                                                        } else {
                                                            c2974u4 = C2971r.f8938x;
                                                            str2 = "";
                                                            if (AbstractC16544l.m18089b(c2974u, c2974u4)) {
                                                                if (linkedHashMap2.containsKey(AbstractC2962i.f8862i)) {
                                                                    obj5 = linkedHashMap.get(c2974u4);
                                                                    if (obj5 == null) {
                                                                        obj5 = null;
                                                                    }
                                                                    c3590f = (C3590f) obj5;
                                                                    if (c3590f == null) {
                                                                        c3590f = "";
                                                                    }
                                                                    obj6 = linkedHashMap2.get(c2974u4);
                                                                    if (obj6 == null) {
                                                                        obj6 = null;
                                                                    }
                                                                    charSequence = (C3590f) obj6;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    charSequenceM619Q = m619Q(charSequence);
                                                                    length = c3590f.length();
                                                                    length2 = charSequence.length();
                                                                    if (length > length2) {
                                                                        i18 = length2;
                                                                    } else {
                                                                        i18 = length;
                                                                    }
                                                                    i19 = 0;
                                                                    while (true) {
                                                                        jArr3 = jArr3;
                                                                        if (i19 < i18) {
                                                                            length3 = length3;
                                                                            break;
                                                                        }
                                                                        length3 = length3;
                                                                        if (c3590f.charAt(i19) != charSequence.charAt(i19)) {
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            i19++;
                                                                            jArr3 = jArr3;
                                                                            length3 = length3;
                                                                        }
                                                                    }
                                                                    i20 = 0;
                                                                    while (i20 < i18 - i19) {
                                                                        i21 = i18;
                                                                        if (c3590f.charAt((length - 1) - i20) != charSequence.charAt((length2 - 1) - i20)) {
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            i20++;
                                                                            i18 = i21;
                                                                        }
                                                                    }
                                                                    int i30 = (length - i20) - i19;
                                                                    int i31 = (length2 - i20) - i19;
                                                                    C2974u c2974u8 = C2971r.f8910C;
                                                                    boolean zContainsKey2 = linkedHashMap.containsKey(c2974u8);
                                                                    boolean zContainsKey3 = linkedHashMap2.containsKey(c2974u8);
                                                                    zContainsKey = linkedHashMap.containsKey(C2971r.f8938x);
                                                                    if (zContainsKey) {
                                                                        z10 = false;
                                                                    } else {
                                                                        z10 = false;
                                                                    }
                                                                    if (zContainsKey) {
                                                                        z11 = false;
                                                                    } else {
                                                                        z11 = false;
                                                                    }
                                                                    if (z10) {
                                                                        accessibilityEventM643p = m643p(m624E(i28), 0, 0, Integer.valueOf(length2), charSequenceM619Q);
                                                                    } else {
                                                                        accessibilityEventM643p = m643p(m624E(i28), 0, 0, Integer.valueOf(length2), charSequenceM619Q);
                                                                    }
                                                                    accessibilityEventM643p.setClassName("android.widget.EditText");
                                                                    m626G(accessibilityEventM643p);
                                                                    if (z10) {
                                                                        long j12 = ((C3581L) c2963j.m3786j(C2971r.f8939y)).f10908a;
                                                                        accessibilityEventM643p.setFromIndex((int) (j12 >> 32));
                                                                        accessibilityEventM643p.setToIndex((int) (j12 & 4294967295L));
                                                                        m626G(accessibilityEventM643p);
                                                                    } else {
                                                                        long j13 = ((C3581L) c2963j.m3786j(C2971r.f8939y)).f10908a;
                                                                        accessibilityEventM643p.setFromIndex((int) (j13 >> 32));
                                                                        accessibilityEventM643p.setToIndex((int) (j13 & 4294967295L));
                                                                        m626G(accessibilityEventM643p);
                                                                    }
                                                                } else {
                                                                    i28 = i28;
                                                                    jArr3 = jArr3;
                                                                    length3 = length3;
                                                                    c11 = '\b';
                                                                    c0294u2 = c0294u2;
                                                                    i15 = i15;
                                                                    i16 = i16;
                                                                    m618I(this, m624E(i28), 2048, 2, 8);
                                                                }
                                                                i17 = i16;
                                                                c0294u2 = c0294u2;
                                                                c9 = c11;
                                                            } else {
                                                                c2968o = c2968o;
                                                                i28 = i28;
                                                                jArr3 = jArr3;
                                                                length3 = length3;
                                                                i15 = i15;
                                                                i17 = i16;
                                                                c2974u5 = C2971r.f8939y;
                                                                zM18089b3 = AbstractC16544l.m18089b(c2974u, c2974u5);
                                                                i22 = c2968o.f8892g;
                                                                if (zM18089b3) {
                                                                    obj7 = linkedHashMap2.get(c2974u4);
                                                                    if (obj7 == null) {
                                                                        obj7 = null;
                                                                    }
                                                                    c3590f2 = (C3590f) obj7;
                                                                    if (c3590f2 != null) {
                                                                        str2 = str3;
                                                                    }
                                                                    C3581L c3581l = (C3581L) c2963j.m3786j(c2974u5);
                                                                    int iM624E2 = m624E(i28);
                                                                    long j14 = c3581l.f10908a;
                                                                    c0294u2 = c0294u2;
                                                                    c9 = '\b';
                                                                    m626G(m643p(iM624E2, Integer.valueOf((int) (j14 >> 32)), Integer.valueOf((int) (j14 & 4294967295L)), Integer.valueOf(str2.length()), m619Q(str2)));
                                                                    m629K(i22);
                                                                    i17 = i17;
                                                                } else {
                                                                    c0294u2 = c0294u2;
                                                                    c9 = '\b';
                                                                    if (AbstractC16544l.m18089b(c2974u, c2974u7)) {
                                                                        zM18089b4 = true;
                                                                    } else {
                                                                        zM18089b4 = AbstractC16544l.m18089b(c2974u, C2971r.f8930p);
                                                                    }
                                                                    if (zM18089b4) {
                                                                        m623A(c21658d);
                                                                        size = arrayList3.size();
                                                                        i23 = 0;
                                                                        while (true) {
                                                                            if (i23 < size) {
                                                                                c0291t2 = null;
                                                                                break;
                                                                            } else {
                                                                                if (((C0291t1) arrayList3.get(i23)).f1054Y == i28) {
                                                                                    c0291t2 = (C0291t1) arrayList3.get(i23);
                                                                                    break;
                                                                                }
                                                                                i23++;
                                                                            }
                                                                        }
                                                                        AbstractC16544l.m18091d(c0291t2);
                                                                        obj8 = linkedHashMap2.get(c2974u7);
                                                                        if (obj8 == null) {
                                                                            obj8 = null;
                                                                        }
                                                                        c0291t2.f1058q0 = (C2961h) obj8;
                                                                        obj9 = linkedHashMap2.get(C2971r.f8930p);
                                                                        if (obj9 == null) {
                                                                            obj9 = null;
                                                                        }
                                                                        c0291t2.f1059r0 = (C2961h) obj9;
                                                                        if (c0291t2.f1055Z.contains(c0291t2)) {
                                                                            this.f765d.getSnapshotObserver().m22222a(c0291t2, this.f764M, new C0286s(c0291t2, 2, this));
                                                                        }
                                                                    } else if (AbstractC16544l.m18089b(c2974u, C2971r.f8925k)) {
                                                                        value = entry.getValue();
                                                                        AbstractC16544l.m18092e(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                                        if (((Boolean) value).booleanValue()) {
                                                                            m626G(m642o(m624E(i22), 8));
                                                                        }
                                                                        m618I(this, m624E(i22), 2048, 0, 8);
                                                                    } else {
                                                                        c2974u6 = AbstractC2962i.f8875v;
                                                                        if (AbstractC16544l.m18089b(c2974u, c2974u6)) {
                                                                            list2 = (List) c2963j.m3786j(c2974u6);
                                                                            obj11 = linkedHashMap.get(c2974u6);
                                                                            if (obj11 == null) {
                                                                                obj11 = null;
                                                                            }
                                                                            list3 = (List) obj11;
                                                                            if (list3 != null) {
                                                                                linkedHashSet = new LinkedHashSet();
                                                                                if (list2.size() <= 0) {
                                                                                    list2.get(0).getClass();
                                                                                    throw new ClassCastException();
                                                                                }
                                                                                linkedHashSet2 = new LinkedHashSet();
                                                                                if (list3.size() <= 0) {
                                                                                    list3.get(0).getClass();
                                                                                    throw new ClassCastException();
                                                                                }
                                                                                if (linkedHashSet.containsAll(linkedHashSet2)) {
                                                                                }
                                                                                z13 = true;
                                                                            } else if (!list2.isEmpty()) {
                                                                                i26 = i17;
                                                                                c2968o = c2968o;
                                                                                i28 = i28;
                                                                                c0294u1 = c0294u2;
                                                                                i27 = i15;
                                                                                arrayList4 = arrayList4;
                                                                                iArr3 = iArr3;
                                                                                jArr3 = jArr3;
                                                                                length3 = length3;
                                                                                z13 = true;
                                                                            }
                                                                        } else {
                                                                            if (entry.getValue() instanceof C2954a) {
                                                                                Object value5 = entry.getValue();
                                                                                AbstractC16544l.m18092e(value5, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                                                c2954a = (C2954a) value5;
                                                                                obj10 = linkedHashMap.get((C2974u) entry.getKey());
                                                                                if (obj10 == null) {
                                                                                    obj10 = null;
                                                                                }
                                                                                if (c2954a != obj10) {
                                                                                    if (obj10 instanceof C2954a) {
                                                                                        c2954a2 = (C2954a) obj10;
                                                                                        if (AbstractC16544l.m18089b(c2954a.f8837a, c2954a2.f8837a)) {
                                                                                            InterfaceC17302e interfaceC17302e = c2954a2.f8838b;
                                                                                            InterfaceC17302e interfaceC17302e2 = c2954a.f8838b;
                                                                                            if (interfaceC17302e2 == null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (!z12) {
                                                                                    z13 = false;
                                                                                }
                                                                            }
                                                                            z13 = true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i26 = i17;
                                                    c2968o = c2968o;
                                                    i28 = i28;
                                                    c0294u1 = c0294u2;
                                                    i27 = i15;
                                                    arrayList4 = arrayList4;
                                                    iArr3 = iArr3;
                                                    jArr3 = jArr3;
                                                    length3 = length3;
                                                }
                                                i17 = i16;
                                                i26 = i17;
                                                c2968o = c2968o;
                                                i28 = i28;
                                                c0294u1 = c0294u2;
                                                i27 = i15;
                                                arrayList4 = arrayList4;
                                                iArr3 = iArr3;
                                                jArr3 = jArr3;
                                                length3 = length3;
                                            }
                                        }
                                        i17 = i26;
                                        i26 = i17;
                                        c2968o = c2968o;
                                        i28 = i28;
                                        c0294u1 = c0294u2;
                                        i27 = i15;
                                        arrayList4 = arrayList4;
                                        iArr3 = iArr3;
                                        jArr3 = jArr3;
                                        length3 = length3;
                                    } else {
                                        value2 = entry.getValue();
                                        obj12 = linkedHashMap.get((C2974u) entry.getKey());
                                        if (obj12 == null) {
                                            obj12 = null;
                                        }
                                        if (AbstractC16544l.m18089b(value2, obj12)) {
                                            c2974u = (C2974u) entry.getKey();
                                            c2974u2 = C2971r.f8918d;
                                            if (AbstractC16544l.m18089b(c2974u, c2974u2)) {
                                                Object value6 = entry.getValue();
                                                AbstractC16544l.m18092e(value6, "null cannot be cast to non-null type kotlin.String");
                                                str = (String) value6;
                                                if (linkedHashMap.containsKey(c2974u2)) {
                                                    m628J(i28, 8, str);
                                                    c9 = '\b';
                                                }
                                            } else {
                                                if (AbstractC16544l.m18089b(c2974u, C2971r.f8916b)) {
                                                    zM18089b = true;
                                                } else {
                                                    zM18089b = AbstractC16544l.m18089b(c2974u, C2971r.f8909B);
                                                }
                                                if (zM18089b) {
                                                    m618I(this, m624E(i28), 2048, 64, 8);
                                                    m618I(this, m624E(i28), 2048, 0, 8);
                                                    c9 = '\b';
                                                } else {
                                                    i16 = i26;
                                                    if (AbstractC16544l.m18089b(c2974u, C2971r.f8917c)) {
                                                        m618I(this, m624E(i28), 2048, 64, 8);
                                                        m618I(this, m624E(i28), 2048, 0, 8);
                                                        arrayList4 = arrayList4;
                                                        iArr3 = iArr3;
                                                        c9 = '\b';
                                                    } else {
                                                        c2974u3 = C2971r.f8908A;
                                                        zM18089b2 = AbstractC16544l.m18089b(c2974u, c2974u3);
                                                        c21658d = c2968o.f8888c;
                                                        arrayList4 = arrayList4;
                                                        linkedHashMap2 = c2963j.f8880Y;
                                                        iArr3 = iArr3;
                                                        if (zM18089b2) {
                                                            obj = linkedHashMap2.get(C2971r.f8933s);
                                                            if (obj == null) {
                                                                obj = null;
                                                            }
                                                            c2960g = (C2960g) obj;
                                                            if (c2960g == null) {
                                                                zM3783a = false;
                                                            } else {
                                                                zM3783a = C2960g.m3783a(c2960g.f8849a, 4);
                                                            }
                                                            if (zM3783a) {
                                                                obj2 = linkedHashMap2.get(c2974u3);
                                                                if (obj2 == null) {
                                                                    obj2 = null;
                                                                }
                                                                if (AbstractC16544l.m18089b(obj2, Boolean.TRUE)) {
                                                                    accessibilityEventM642o = m642o(m624E(i28), 4);
                                                                    C2968o c2968o4 = new C2968o(c2968o.f8886a, true, c21658d, c2963j);
                                                                    obj3 = c2968o4.m3798i().f8880Y.get(C2971r.f8915a);
                                                                    if (obj3 == null) {
                                                                        obj3 = null;
                                                                    }
                                                                    List list5 = (List) obj3;
                                                                    strM10573a = list5 != null ? AbstractC9918k3.m10573a(list5, Separators.COMMA, null, 62) : null;
                                                                    obj4 = c2968o4.m3798i().f8880Y.get(C2971r.f8935u);
                                                                    if (obj4 == null) {
                                                                        obj4 = null;
                                                                    }
                                                                    list = (List) obj4;
                                                                    if (list != null) {
                                                                        strM10573a2 = AbstractC9918k3.m10573a(list, Separators.COMMA, null, 62);
                                                                    } else {
                                                                        strM10573a2 = null;
                                                                    }
                                                                    if (strM10573a != null) {
                                                                        accessibilityEventM642o.setContentDescription(strM10573a);
                                                                    }
                                                                    if (strM10573a2 != null) {
                                                                        accessibilityEventM642o.getText().add(strM10573a2);
                                                                    }
                                                                    m626G(accessibilityEventM642o);
                                                                    c2968o = c2968o;
                                                                    i28 = i28;
                                                                    jArr3 = jArr3;
                                                                    length3 = length3;
                                                                    c0294u2 = c0294u2;
                                                                    i15 = i15;
                                                                    i17 = i16;
                                                                    c9 = '\b';
                                                                } else {
                                                                    c10 = '\b';
                                                                    m618I(this, m624E(i28), 2048, 0, 8);
                                                                }
                                                            } else {
                                                                c10 = '\b';
                                                                m618I(this, m624E(i28), 2048, 64, 8);
                                                                m618I(this, m624E(i28), 2048, 0, 8);
                                                            }
                                                            c2968o = c2968o;
                                                            i28 = i28;
                                                            jArr3 = jArr3;
                                                            length3 = length3;
                                                            c0294u2 = c0294u2;
                                                            i15 = i15;
                                                            i17 = i16;
                                                            c9 = c10;
                                                        } else {
                                                            c11 = '\b';
                                                            if (AbstractC16544l.m18089b(c2974u, C2971r.f8915a)) {
                                                                int iM624E3 = m624E(i28);
                                                                Object value7 = entry.getValue();
                                                                AbstractC16544l.m18092e(value7, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                m627H(iM624E3, 2048, 4, (List) value7);
                                                                c9 = '\b';
                                                            } else {
                                                                c2974u4 = C2971r.f8938x;
                                                                str2 = "";
                                                                if (AbstractC16544l.m18089b(c2974u, c2974u4)) {
                                                                    if (linkedHashMap2.containsKey(AbstractC2962i.f8862i)) {
                                                                        obj5 = linkedHashMap.get(c2974u4);
                                                                        if (obj5 == null) {
                                                                            obj5 = null;
                                                                        }
                                                                        c3590f = (C3590f) obj5;
                                                                        if (c3590f == null) {
                                                                            c3590f = "";
                                                                        }
                                                                        obj6 = linkedHashMap2.get(c2974u4);
                                                                        if (obj6 == null) {
                                                                            obj6 = null;
                                                                        }
                                                                        charSequence = (C3590f) obj6;
                                                                        if (charSequence == null) {
                                                                            charSequence = "";
                                                                        }
                                                                        charSequenceM619Q = m619Q(charSequence);
                                                                        length = c3590f.length();
                                                                        length2 = charSequence.length();
                                                                        if (length > length2) {
                                                                            i18 = length2;
                                                                        } else {
                                                                            i18 = length;
                                                                        }
                                                                        i19 = 0;
                                                                        while (true) {
                                                                            jArr3 = jArr3;
                                                                            if (i19 < i18) {
                                                                                length3 = length3;
                                                                                break;
                                                                            }
                                                                            length3 = length3;
                                                                            if (c3590f.charAt(i19) != charSequence.charAt(i19)) {
                                                                                break;
                                                                            }
                                                                            i19++;
                                                                            jArr3 = jArr3;
                                                                            length3 = length3;
                                                                        }
                                                                        i20 = 0;
                                                                        while (i20 < i18 - i19) {
                                                                            i21 = i18;
                                                                            if (c3590f.charAt((length - 1) - i20) != charSequence.charAt((length2 - 1) - i20)) {
                                                                                break;
                                                                            }
                                                                            i20++;
                                                                            i18 = i21;
                                                                        }
                                                                        int i32 = (length - i20) - i19;
                                                                        int i33 = (length2 - i20) - i19;
                                                                        C2974u c2974u9 = C2971r.f8910C;
                                                                        boolean zContainsKey4 = linkedHashMap.containsKey(c2974u9);
                                                                        boolean zContainsKey5 = linkedHashMap2.containsKey(c2974u9);
                                                                        zContainsKey = linkedHashMap.containsKey(C2971r.f8938x);
                                                                        if (zContainsKey || zContainsKey4 || !zContainsKey5) {
                                                                            z10 = false;
                                                                        } else {
                                                                            z10 = true;
                                                                        }
                                                                        if (zContainsKey || !zContainsKey4 || zContainsKey5) {
                                                                            z11 = false;
                                                                        } else {
                                                                            z11 = true;
                                                                        }
                                                                        if (z10 || z11) {
                                                                            accessibilityEventM643p = m643p(m624E(i28), 0, 0, Integer.valueOf(length2), charSequenceM619Q);
                                                                        } else {
                                                                            accessibilityEventM643p = m642o(m624E(i28), 16);
                                                                            accessibilityEventM643p.setFromIndex(i19);
                                                                            accessibilityEventM643p.setRemovedCount(i32);
                                                                            accessibilityEventM643p.setAddedCount(i33);
                                                                            accessibilityEventM643p.setBeforeText(c3590f);
                                                                            accessibilityEventM643p.getText().add(charSequenceM619Q);
                                                                        }
                                                                        accessibilityEventM643p.setClassName("android.widget.EditText");
                                                                        m626G(accessibilityEventM643p);
                                                                        if (z10 || z11) {
                                                                            long j15 = ((C3581L) c2963j.m3786j(C2971r.f8939y)).f10908a;
                                                                            accessibilityEventM643p.setFromIndex((int) (j15 >> 32));
                                                                            accessibilityEventM643p.setToIndex((int) (j15 & 4294967295L));
                                                                            m626G(accessibilityEventM643p);
                                                                        }
                                                                    } else {
                                                                        i28 = i28;
                                                                        jArr3 = jArr3;
                                                                        length3 = length3;
                                                                        c11 = '\b';
                                                                        c0294u2 = c0294u2;
                                                                        i15 = i15;
                                                                        i16 = i16;
                                                                        m618I(this, m624E(i28), 2048, 2, 8);
                                                                    }
                                                                    i17 = i16;
                                                                    c0294u2 = c0294u2;
                                                                    c9 = c11;
                                                                } else {
                                                                    c2968o = c2968o;
                                                                    i28 = i28;
                                                                    jArr3 = jArr3;
                                                                    length3 = length3;
                                                                    i15 = i15;
                                                                    i17 = i16;
                                                                    c2974u5 = C2971r.f8939y;
                                                                    zM18089b3 = AbstractC16544l.m18089b(c2974u, c2974u5);
                                                                    i22 = c2968o.f8892g;
                                                                    if (zM18089b3) {
                                                                        obj7 = linkedHashMap2.get(c2974u4);
                                                                        if (obj7 == null) {
                                                                            obj7 = null;
                                                                        }
                                                                        c3590f2 = (C3590f) obj7;
                                                                        if (c3590f2 != null && (str3 = c3590f2.f10934Y) != null) {
                                                                            str2 = str3;
                                                                        }
                                                                        C3581L c3581l2 = (C3581L) c2963j.m3786j(c2974u5);
                                                                        int iM624E4 = m624E(i28);
                                                                        long j16 = c3581l2.f10908a;
                                                                        c0294u2 = c0294u2;
                                                                        c9 = '\b';
                                                                        m626G(m643p(iM624E4, Integer.valueOf((int) (j16 >> 32)), Integer.valueOf((int) (j16 & 4294967295L)), Integer.valueOf(str2.length()), m619Q(str2)));
                                                                        m629K(i22);
                                                                        i17 = i17;
                                                                    } else {
                                                                        c0294u2 = c0294u2;
                                                                        c9 = '\b';
                                                                        if (AbstractC16544l.m18089b(c2974u, c2974u7)) {
                                                                            zM18089b4 = true;
                                                                        } else {
                                                                            zM18089b4 = AbstractC16544l.m18089b(c2974u, C2971r.f8930p);
                                                                        }
                                                                        if (zM18089b4) {
                                                                            m623A(c21658d);
                                                                            size = arrayList3.size();
                                                                            i23 = 0;
                                                                            while (true) {
                                                                                if (i23 < size) {
                                                                                    c0291t2 = null;
                                                                                    break;
                                                                                } else {
                                                                                    if (((C0291t1) arrayList3.get(i23)).f1054Y == i28) {
                                                                                        c0291t2 = (C0291t1) arrayList3.get(i23);
                                                                                        break;
                                                                                    }
                                                                                    i23++;
                                                                                }
                                                                            }
                                                                            AbstractC16544l.m18091d(c0291t2);
                                                                            obj8 = linkedHashMap2.get(c2974u7);
                                                                            if (obj8 == null) {
                                                                                obj8 = null;
                                                                            }
                                                                            c0291t2.f1058q0 = (C2961h) obj8;
                                                                            obj9 = linkedHashMap2.get(C2971r.f8930p);
                                                                            if (obj9 == null) {
                                                                                obj9 = null;
                                                                            }
                                                                            c0291t2.f1059r0 = (C2961h) obj9;
                                                                            if (c0291t2.f1055Z.contains(c0291t2)) {
                                                                                this.f765d.getSnapshotObserver().m22222a(c0291t2, this.f764M, new C0286s(c0291t2, 2, this));
                                                                            }
                                                                        } else if (AbstractC16544l.m18089b(c2974u, C2971r.f8925k)) {
                                                                            value = entry.getValue();
                                                                            AbstractC16544l.m18092e(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                                            if (((Boolean) value).booleanValue()) {
                                                                                m626G(m642o(m624E(i22), 8));
                                                                            }
                                                                            m618I(this, m624E(i22), 2048, 0, 8);
                                                                        } else {
                                                                            c2974u6 = AbstractC2962i.f8875v;
                                                                            if (AbstractC16544l.m18089b(c2974u, c2974u6)) {
                                                                                list2 = (List) c2963j.m3786j(c2974u6);
                                                                                obj11 = linkedHashMap.get(c2974u6);
                                                                                if (obj11 == null) {
                                                                                    obj11 = null;
                                                                                }
                                                                                list3 = (List) obj11;
                                                                                if (list3 != null) {
                                                                                    linkedHashSet = new LinkedHashSet();
                                                                                    if (list2.size() <= 0) {
                                                                                        list2.get(0).getClass();
                                                                                        throw new ClassCastException();
                                                                                    }
                                                                                    linkedHashSet2 = new LinkedHashSet();
                                                                                    if (list3.size() <= 0) {
                                                                                        list3.get(0).getClass();
                                                                                        throw new ClassCastException();
                                                                                    }
                                                                                    if (linkedHashSet.containsAll(linkedHashSet2) || !linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                        z13 = true;
                                                                                    } else {
                                                                                        z13 = false;
                                                                                    }
                                                                                } else if (!list2.isEmpty()) {
                                                                                    i26 = i17;
                                                                                    c2968o = c2968o;
                                                                                    i28 = i28;
                                                                                    c0294u1 = c0294u2;
                                                                                    i27 = i15;
                                                                                    arrayList4 = arrayList4;
                                                                                    iArr3 = iArr3;
                                                                                    jArr3 = jArr3;
                                                                                    length3 = length3;
                                                                                    z13 = true;
                                                                                }
                                                                            } else {
                                                                                if (entry.getValue() instanceof C2954a) {
                                                                                    Object value8 = entry.getValue();
                                                                                    AbstractC16544l.m18092e(value8, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                                                    c2954a = (C2954a) value8;
                                                                                    obj10 = linkedHashMap.get((C2974u) entry.getKey());
                                                                                    if (obj10 == null) {
                                                                                        obj10 = null;
                                                                                    }
                                                                                    if (c2954a != obj10) {
                                                                                        if (obj10 instanceof C2954a) {
                                                                                            c2954a2 = (C2954a) obj10;
                                                                                            if (AbstractC16544l.m18089b(c2954a.f8837a, c2954a2.f8837a)) {
                                                                                                InterfaceC17302e interfaceC17302e3 = c2954a2.f8838b;
                                                                                                InterfaceC17302e interfaceC17302e4 = c2954a.f8838b;
                                                                                                z12 = (interfaceC17302e4 == null || interfaceC17302e3 == null) && (interfaceC17302e4 == null || interfaceC17302e3 != null);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (!z12) {
                                                                                        z13 = false;
                                                                                    }
                                                                                }
                                                                                z13 = true;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i26 = i17;
                                                        c2968o = c2968o;
                                                        i28 = i28;
                                                        c0294u1 = c0294u2;
                                                        i27 = i15;
                                                        arrayList4 = arrayList4;
                                                        iArr3 = iArr3;
                                                        jArr3 = jArr3;
                                                        length3 = length3;
                                                    }
                                                    i17 = i16;
                                                    i26 = i17;
                                                    c2968o = c2968o;
                                                    i28 = i28;
                                                    c0294u1 = c0294u2;
                                                    i27 = i15;
                                                    arrayList4 = arrayList4;
                                                    iArr3 = iArr3;
                                                    jArr3 = jArr3;
                                                    length3 = length3;
                                                }
                                            }
                                            i17 = i26;
                                            i26 = i17;
                                            c2968o = c2968o;
                                            i28 = i28;
                                            c0294u1 = c0294u2;
                                            i27 = i15;
                                            arrayList4 = arrayList4;
                                            iArr3 = iArr3;
                                            jArr3 = jArr3;
                                            length3 = length3;
                                        }
                                        c9 = '\b';
                                        i17 = i26;
                                        i26 = i17;
                                        c2968o = c2968o;
                                        i28 = i28;
                                        c0294u1 = c0294u2;
                                        i27 = i15;
                                        arrayList4 = arrayList4;
                                        iArr3 = iArr3;
                                        jArr3 = jArr3;
                                        length3 = length3;
                                    }
                                }
                                int size2 = arrayList4.size();
                                int i34 = 0;
                                while (true) {
                                    if (i34 >= size2) {
                                        c0291t1 = null;
                                        break;
                                    }
                                    int i35 = size2;
                                    if (((C0291t1) arrayList4.get(i34)).f1054Y == i28) {
                                        c0291t1 = (C0291t1) arrayList4.get(i34);
                                        break;
                                    } else {
                                        i34++;
                                        size2 = i35;
                                    }
                                }
                                if (c0291t1 != null) {
                                    z6 = false;
                                } else {
                                    c0291t1 = new C0291t1(i28, arrayList3);
                                    z6 = true;
                                }
                                arrayList3.add(c0291t1);
                                linkedHashMap = c2963j2.f8880Y;
                                if (z6) {
                                    value2 = entry.getValue();
                                    obj12 = linkedHashMap.get((C2974u) entry.getKey());
                                    if (obj12 == null) {
                                        obj12 = null;
                                    }
                                    if (AbstractC16544l.m18089b(value2, obj12)) {
                                        c2974u = (C2974u) entry.getKey();
                                        c2974u2 = C2971r.f8918d;
                                        if (AbstractC16544l.m18089b(c2974u, c2974u2)) {
                                            Object value9 = entry.getValue();
                                            AbstractC16544l.m18092e(value9, "null cannot be cast to non-null type kotlin.String");
                                            str = (String) value9;
                                            if (linkedHashMap.containsKey(c2974u2)) {
                                                m628J(i28, 8, str);
                                                c9 = '\b';
                                            }
                                        } else {
                                            if (AbstractC16544l.m18089b(c2974u, C2971r.f8916b)) {
                                                zM18089b = true;
                                            } else {
                                                zM18089b = AbstractC16544l.m18089b(c2974u, C2971r.f8909B);
                                            }
                                            if (zM18089b) {
                                                m618I(this, m624E(i28), 2048, 64, 8);
                                                m618I(this, m624E(i28), 2048, 0, 8);
                                                c9 = '\b';
                                            } else {
                                                i16 = i26;
                                                if (AbstractC16544l.m18089b(c2974u, C2971r.f8917c)) {
                                                    m618I(this, m624E(i28), 2048, 64, 8);
                                                    m618I(this, m624E(i28), 2048, 0, 8);
                                                    arrayList4 = arrayList4;
                                                    iArr3 = iArr3;
                                                    c9 = '\b';
                                                } else {
                                                    c2974u3 = C2971r.f8908A;
                                                    zM18089b2 = AbstractC16544l.m18089b(c2974u, c2974u3);
                                                    c21658d = c2968o.f8888c;
                                                    arrayList4 = arrayList4;
                                                    linkedHashMap2 = c2963j.f8880Y;
                                                    iArr3 = iArr3;
                                                    if (zM18089b2) {
                                                        obj = linkedHashMap2.get(C2971r.f8933s);
                                                        if (obj == null) {
                                                            obj = null;
                                                        }
                                                        c2960g = (C2960g) obj;
                                                        if (c2960g == null) {
                                                            zM3783a = false;
                                                        } else {
                                                            zM3783a = C2960g.m3783a(c2960g.f8849a, 4);
                                                        }
                                                        if (zM3783a) {
                                                            obj2 = linkedHashMap2.get(c2974u3);
                                                            if (obj2 == null) {
                                                                obj2 = null;
                                                            }
                                                            if (AbstractC16544l.m18089b(obj2, Boolean.TRUE)) {
                                                                accessibilityEventM642o = m642o(m624E(i28), 4);
                                                                C2968o c2968o5 = new C2968o(c2968o.f8886a, true, c21658d, c2963j);
                                                                obj3 = c2968o5.m3798i().f8880Y.get(C2971r.f8915a);
                                                                if (obj3 == null) {
                                                                    obj3 = null;
                                                                }
                                                                List list6 = (List) obj3;
                                                                if (list6 != null) {
                                                                }
                                                                obj4 = c2968o5.m3798i().f8880Y.get(C2971r.f8935u);
                                                                if (obj4 == null) {
                                                                    obj4 = null;
                                                                }
                                                                list = (List) obj4;
                                                                if (list != null) {
                                                                    strM10573a2 = AbstractC9918k3.m10573a(list, Separators.COMMA, null, 62);
                                                                } else {
                                                                    strM10573a2 = null;
                                                                }
                                                                if (strM10573a != null) {
                                                                    accessibilityEventM642o.setContentDescription(strM10573a);
                                                                }
                                                                if (strM10573a2 != null) {
                                                                    accessibilityEventM642o.getText().add(strM10573a2);
                                                                }
                                                                m626G(accessibilityEventM642o);
                                                                c2968o = c2968o;
                                                                i28 = i28;
                                                                jArr3 = jArr3;
                                                                length3 = length3;
                                                                c0294u2 = c0294u2;
                                                                i15 = i15;
                                                                i17 = i16;
                                                                c9 = '\b';
                                                            } else {
                                                                c10 = '\b';
                                                                m618I(this, m624E(i28), 2048, 0, 8);
                                                            }
                                                        } else {
                                                            c10 = '\b';
                                                            m618I(this, m624E(i28), 2048, 64, 8);
                                                            m618I(this, m624E(i28), 2048, 0, 8);
                                                        }
                                                        c2968o = c2968o;
                                                        i28 = i28;
                                                        jArr3 = jArr3;
                                                        length3 = length3;
                                                        c0294u2 = c0294u2;
                                                        i15 = i15;
                                                        i17 = i16;
                                                        c9 = c10;
                                                    } else {
                                                        c11 = '\b';
                                                        if (AbstractC16544l.m18089b(c2974u, C2971r.f8915a)) {
                                                            int iM624E5 = m624E(i28);
                                                            Object value10 = entry.getValue();
                                                            AbstractC16544l.m18092e(value10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                            m627H(iM624E5, 2048, 4, (List) value10);
                                                            c9 = '\b';
                                                        } else {
                                                            c2974u4 = C2971r.f8938x;
                                                            str2 = "";
                                                            if (AbstractC16544l.m18089b(c2974u, c2974u4)) {
                                                                if (linkedHashMap2.containsKey(AbstractC2962i.f8862i)) {
                                                                    obj5 = linkedHashMap.get(c2974u4);
                                                                    if (obj5 == null) {
                                                                        obj5 = null;
                                                                    }
                                                                    c3590f = (C3590f) obj5;
                                                                    if (c3590f == null) {
                                                                        c3590f = "";
                                                                    }
                                                                    obj6 = linkedHashMap2.get(c2974u4);
                                                                    if (obj6 == null) {
                                                                        obj6 = null;
                                                                    }
                                                                    charSequence = (C3590f) obj6;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    charSequenceM619Q = m619Q(charSequence);
                                                                    length = c3590f.length();
                                                                    length2 = charSequence.length();
                                                                    if (length > length2) {
                                                                        i18 = length2;
                                                                    } else {
                                                                        i18 = length;
                                                                    }
                                                                    i19 = 0;
                                                                    while (true) {
                                                                        jArr3 = jArr3;
                                                                        if (i19 < i18) {
                                                                            length3 = length3;
                                                                            break;
                                                                        }
                                                                        length3 = length3;
                                                                        if (c3590f.charAt(i19) != charSequence.charAt(i19)) {
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            i19++;
                                                                            jArr3 = jArr3;
                                                                            length3 = length3;
                                                                        }
                                                                    }
                                                                    i20 = 0;
                                                                    while (i20 < i18 - i19) {
                                                                        i21 = i18;
                                                                        if (c3590f.charAt((length - 1) - i20) != charSequence.charAt((length2 - 1) - i20)) {
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            i20++;
                                                                            i18 = i21;
                                                                        }
                                                                    }
                                                                    int i36 = (length - i20) - i19;
                                                                    int i37 = (length2 - i20) - i19;
                                                                    C2974u c2974u10 = C2971r.f8910C;
                                                                    boolean zContainsKey6 = linkedHashMap.containsKey(c2974u10);
                                                                    boolean zContainsKey7 = linkedHashMap2.containsKey(c2974u10);
                                                                    zContainsKey = linkedHashMap.containsKey(C2971r.f8938x);
                                                                    if (zContainsKey) {
                                                                        z10 = false;
                                                                    } else {
                                                                        z10 = false;
                                                                    }
                                                                    if (zContainsKey) {
                                                                        z11 = false;
                                                                    } else {
                                                                        z11 = false;
                                                                    }
                                                                    if (z10) {
                                                                        accessibilityEventM643p = m643p(m624E(i28), 0, 0, Integer.valueOf(length2), charSequenceM619Q);
                                                                    } else {
                                                                        accessibilityEventM643p = m643p(m624E(i28), 0, 0, Integer.valueOf(length2), charSequenceM619Q);
                                                                    }
                                                                    accessibilityEventM643p.setClassName("android.widget.EditText");
                                                                    m626G(accessibilityEventM643p);
                                                                    if (z10) {
                                                                        long j17 = ((C3581L) c2963j.m3786j(C2971r.f8939y)).f10908a;
                                                                        accessibilityEventM643p.setFromIndex((int) (j17 >> 32));
                                                                        accessibilityEventM643p.setToIndex((int) (j17 & 4294967295L));
                                                                        m626G(accessibilityEventM643p);
                                                                    } else {
                                                                        long j18 = ((C3581L) c2963j.m3786j(C2971r.f8939y)).f10908a;
                                                                        accessibilityEventM643p.setFromIndex((int) (j18 >> 32));
                                                                        accessibilityEventM643p.setToIndex((int) (j18 & 4294967295L));
                                                                        m626G(accessibilityEventM643p);
                                                                    }
                                                                } else {
                                                                    i28 = i28;
                                                                    jArr3 = jArr3;
                                                                    length3 = length3;
                                                                    c11 = '\b';
                                                                    c0294u2 = c0294u2;
                                                                    i15 = i15;
                                                                    i16 = i16;
                                                                    m618I(this, m624E(i28), 2048, 2, 8);
                                                                }
                                                                i17 = i16;
                                                                c0294u2 = c0294u2;
                                                                c9 = c11;
                                                            } else {
                                                                c2968o = c2968o;
                                                                i28 = i28;
                                                                jArr3 = jArr3;
                                                                length3 = length3;
                                                                i15 = i15;
                                                                i17 = i16;
                                                                c2974u5 = C2971r.f8939y;
                                                                zM18089b3 = AbstractC16544l.m18089b(c2974u, c2974u5);
                                                                i22 = c2968o.f8892g;
                                                                if (zM18089b3) {
                                                                    obj7 = linkedHashMap2.get(c2974u4);
                                                                    if (obj7 == null) {
                                                                        obj7 = null;
                                                                    }
                                                                    c3590f2 = (C3590f) obj7;
                                                                    if (c3590f2 != null) {
                                                                        str2 = str3;
                                                                    }
                                                                    C3581L c3581l3 = (C3581L) c2963j.m3786j(c2974u5);
                                                                    int iM624E6 = m624E(i28);
                                                                    long j19 = c3581l3.f10908a;
                                                                    c0294u2 = c0294u2;
                                                                    c9 = '\b';
                                                                    m626G(m643p(iM624E6, Integer.valueOf((int) (j19 >> 32)), Integer.valueOf((int) (j19 & 4294967295L)), Integer.valueOf(str2.length()), m619Q(str2)));
                                                                    m629K(i22);
                                                                    i17 = i17;
                                                                } else {
                                                                    c0294u2 = c0294u2;
                                                                    c9 = '\b';
                                                                    if (AbstractC16544l.m18089b(c2974u, c2974u7)) {
                                                                        zM18089b4 = true;
                                                                    } else {
                                                                        zM18089b4 = AbstractC16544l.m18089b(c2974u, C2971r.f8930p);
                                                                    }
                                                                    if (zM18089b4) {
                                                                        m623A(c21658d);
                                                                        size = arrayList3.size();
                                                                        i23 = 0;
                                                                        while (true) {
                                                                            if (i23 < size) {
                                                                                c0291t2 = null;
                                                                                break;
                                                                            } else {
                                                                                if (((C0291t1) arrayList3.get(i23)).f1054Y == i28) {
                                                                                    c0291t2 = (C0291t1) arrayList3.get(i23);
                                                                                    break;
                                                                                }
                                                                                i23++;
                                                                            }
                                                                        }
                                                                        AbstractC16544l.m18091d(c0291t2);
                                                                        obj8 = linkedHashMap2.get(c2974u7);
                                                                        if (obj8 == null) {
                                                                            obj8 = null;
                                                                        }
                                                                        c0291t2.f1058q0 = (C2961h) obj8;
                                                                        obj9 = linkedHashMap2.get(C2971r.f8930p);
                                                                        if (obj9 == null) {
                                                                            obj9 = null;
                                                                        }
                                                                        c0291t2.f1059r0 = (C2961h) obj9;
                                                                        if (c0291t2.f1055Z.contains(c0291t2)) {
                                                                            this.f765d.getSnapshotObserver().m22222a(c0291t2, this.f764M, new C0286s(c0291t2, 2, this));
                                                                        }
                                                                    } else if (AbstractC16544l.m18089b(c2974u, C2971r.f8925k)) {
                                                                        value = entry.getValue();
                                                                        AbstractC16544l.m18092e(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                                        if (((Boolean) value).booleanValue()) {
                                                                            m626G(m642o(m624E(i22), 8));
                                                                        }
                                                                        m618I(this, m624E(i22), 2048, 0, 8);
                                                                    } else {
                                                                        c2974u6 = AbstractC2962i.f8875v;
                                                                        if (AbstractC16544l.m18089b(c2974u, c2974u6)) {
                                                                            list2 = (List) c2963j.m3786j(c2974u6);
                                                                            obj11 = linkedHashMap.get(c2974u6);
                                                                            if (obj11 == null) {
                                                                                obj11 = null;
                                                                            }
                                                                            list3 = (List) obj11;
                                                                            if (list3 != null) {
                                                                                linkedHashSet = new LinkedHashSet();
                                                                                if (list2.size() <= 0) {
                                                                                    list2.get(0).getClass();
                                                                                    throw new ClassCastException();
                                                                                }
                                                                                linkedHashSet2 = new LinkedHashSet();
                                                                                if (list3.size() <= 0) {
                                                                                    list3.get(0).getClass();
                                                                                    throw new ClassCastException();
                                                                                }
                                                                                if (linkedHashSet.containsAll(linkedHashSet2)) {
                                                                                }
                                                                                z13 = true;
                                                                            } else if (!list2.isEmpty()) {
                                                                                i26 = i17;
                                                                                c2968o = c2968o;
                                                                                i28 = i28;
                                                                                c0294u1 = c0294u2;
                                                                                i27 = i15;
                                                                                arrayList4 = arrayList4;
                                                                                iArr3 = iArr3;
                                                                                jArr3 = jArr3;
                                                                                length3 = length3;
                                                                                z13 = true;
                                                                            }
                                                                        } else {
                                                                            if (entry.getValue() instanceof C2954a) {
                                                                                Object value11 = entry.getValue();
                                                                                AbstractC16544l.m18092e(value11, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                                                c2954a = (C2954a) value11;
                                                                                obj10 = linkedHashMap.get((C2974u) entry.getKey());
                                                                                if (obj10 == null) {
                                                                                    obj10 = null;
                                                                                }
                                                                                if (c2954a != obj10) {
                                                                                    if (obj10 instanceof C2954a) {
                                                                                        c2954a2 = (C2954a) obj10;
                                                                                        if (AbstractC16544l.m18089b(c2954a.f8837a, c2954a2.f8837a)) {
                                                                                            InterfaceC17302e interfaceC17302e5 = c2954a2.f8838b;
                                                                                            InterfaceC17302e interfaceC17302e6 = c2954a.f8838b;
                                                                                            if (interfaceC17302e6 == null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (!z12) {
                                                                                    z13 = false;
                                                                                }
                                                                            }
                                                                            z13 = true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i26 = i17;
                                                    c2968o = c2968o;
                                                    i28 = i28;
                                                    c0294u1 = c0294u2;
                                                    i27 = i15;
                                                    arrayList4 = arrayList4;
                                                    iArr3 = iArr3;
                                                    jArr3 = jArr3;
                                                    length3 = length3;
                                                }
                                                i17 = i16;
                                                i26 = i17;
                                                c2968o = c2968o;
                                                i28 = i28;
                                                c0294u1 = c0294u2;
                                                i27 = i15;
                                                arrayList4 = arrayList4;
                                                iArr3 = iArr3;
                                                jArr3 = jArr3;
                                                length3 = length3;
                                            }
                                        }
                                        i17 = i26;
                                        i26 = i17;
                                        c2968o = c2968o;
                                        i28 = i28;
                                        c0294u1 = c0294u2;
                                        i27 = i15;
                                        arrayList4 = arrayList4;
                                        iArr3 = iArr3;
                                        jArr3 = jArr3;
                                        length3 = length3;
                                    }
                                    c9 = '\b';
                                    i17 = i26;
                                    i26 = i17;
                                    c2968o = c2968o;
                                    i28 = i28;
                                    c0294u1 = c0294u2;
                                    i27 = i15;
                                    arrayList4 = arrayList4;
                                    iArr3 = iArr3;
                                    jArr3 = jArr3;
                                    length3 = length3;
                                } else {
                                    c2974u = (C2974u) entry.getKey();
                                    c2974u2 = C2971r.f8918d;
                                    if (AbstractC16544l.m18089b(c2974u, c2974u2)) {
                                        Object value12 = entry.getValue();
                                        AbstractC16544l.m18092e(value12, "null cannot be cast to non-null type kotlin.String");
                                        str = (String) value12;
                                        if (linkedHashMap.containsKey(c2974u2)) {
                                            m628J(i28, 8, str);
                                            c9 = '\b';
                                        } else {
                                            c9 = '\b';
                                        }
                                    } else {
                                        if (AbstractC16544l.m18089b(c2974u, C2971r.f8916b)) {
                                            zM18089b = true;
                                        } else {
                                            zM18089b = AbstractC16544l.m18089b(c2974u, C2971r.f8909B);
                                        }
                                        if (zM18089b) {
                                            m618I(this, m624E(i28), 2048, 64, 8);
                                            m618I(this, m624E(i28), 2048, 0, 8);
                                            c9 = '\b';
                                        } else {
                                            i16 = i26;
                                            if (AbstractC16544l.m18089b(c2974u, C2971r.f8917c)) {
                                                m618I(this, m624E(i28), 2048, 64, 8);
                                                m618I(this, m624E(i28), 2048, 0, 8);
                                                arrayList4 = arrayList4;
                                                iArr3 = iArr3;
                                                c9 = '\b';
                                            } else {
                                                c2974u3 = C2971r.f8908A;
                                                zM18089b2 = AbstractC16544l.m18089b(c2974u, c2974u3);
                                                c21658d = c2968o.f8888c;
                                                arrayList4 = arrayList4;
                                                linkedHashMap2 = c2963j.f8880Y;
                                                iArr3 = iArr3;
                                                if (zM18089b2) {
                                                    obj = linkedHashMap2.get(C2971r.f8933s);
                                                    if (obj == null) {
                                                        obj = null;
                                                    }
                                                    c2960g = (C2960g) obj;
                                                    if (c2960g == null) {
                                                        zM3783a = false;
                                                    } else {
                                                        zM3783a = C2960g.m3783a(c2960g.f8849a, 4);
                                                    }
                                                    if (zM3783a) {
                                                        obj2 = linkedHashMap2.get(c2974u3);
                                                        if (obj2 == null) {
                                                            obj2 = null;
                                                        }
                                                        if (AbstractC16544l.m18089b(obj2, Boolean.TRUE)) {
                                                            accessibilityEventM642o = m642o(m624E(i28), 4);
                                                            C2968o c2968o6 = new C2968o(c2968o.f8886a, true, c21658d, c2963j);
                                                            obj3 = c2968o6.m3798i().f8880Y.get(C2971r.f8915a);
                                                            if (obj3 == null) {
                                                                obj3 = null;
                                                            }
                                                            List list7 = (List) obj3;
                                                            if (list7 != null) {
                                                            }
                                                            obj4 = c2968o6.m3798i().f8880Y.get(C2971r.f8935u);
                                                            if (obj4 == null) {
                                                                obj4 = null;
                                                            }
                                                            list = (List) obj4;
                                                            if (list != null) {
                                                                strM10573a2 = AbstractC9918k3.m10573a(list, Separators.COMMA, null, 62);
                                                            } else {
                                                                strM10573a2 = null;
                                                            }
                                                            if (strM10573a != null) {
                                                                accessibilityEventM642o.setContentDescription(strM10573a);
                                                            }
                                                            if (strM10573a2 != null) {
                                                                accessibilityEventM642o.getText().add(strM10573a2);
                                                            }
                                                            m626G(accessibilityEventM642o);
                                                            c2968o = c2968o;
                                                            i28 = i28;
                                                            jArr3 = jArr3;
                                                            length3 = length3;
                                                            c0294u2 = c0294u2;
                                                            i15 = i15;
                                                            i17 = i16;
                                                            c9 = '\b';
                                                        } else {
                                                            c10 = '\b';
                                                            m618I(this, m624E(i28), 2048, 0, 8);
                                                        }
                                                    } else {
                                                        c10 = '\b';
                                                        m618I(this, m624E(i28), 2048, 64, 8);
                                                        m618I(this, m624E(i28), 2048, 0, 8);
                                                    }
                                                    c2968o = c2968o;
                                                    i28 = i28;
                                                    jArr3 = jArr3;
                                                    length3 = length3;
                                                    c0294u2 = c0294u2;
                                                    i15 = i15;
                                                    i17 = i16;
                                                    c9 = c10;
                                                } else {
                                                    c11 = '\b';
                                                    if (AbstractC16544l.m18089b(c2974u, C2971r.f8915a)) {
                                                        int iM624E7 = m624E(i28);
                                                        Object value13 = entry.getValue();
                                                        AbstractC16544l.m18092e(value13, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                        m627H(iM624E7, 2048, 4, (List) value13);
                                                        c9 = '\b';
                                                    } else {
                                                        c2974u4 = C2971r.f8938x;
                                                        str2 = "";
                                                        if (AbstractC16544l.m18089b(c2974u, c2974u4)) {
                                                            if (linkedHashMap2.containsKey(AbstractC2962i.f8862i)) {
                                                                obj5 = linkedHashMap.get(c2974u4);
                                                                if (obj5 == null) {
                                                                    obj5 = null;
                                                                }
                                                                c3590f = (C3590f) obj5;
                                                                if (c3590f == null) {
                                                                    c3590f = "";
                                                                }
                                                                obj6 = linkedHashMap2.get(c2974u4);
                                                                if (obj6 == null) {
                                                                    obj6 = null;
                                                                }
                                                                charSequence = (C3590f) obj6;
                                                                if (charSequence == null) {
                                                                    charSequence = "";
                                                                }
                                                                charSequenceM619Q = m619Q(charSequence);
                                                                length = c3590f.length();
                                                                length2 = charSequence.length();
                                                                if (length > length2) {
                                                                    i18 = length2;
                                                                } else {
                                                                    i18 = length;
                                                                }
                                                                i19 = 0;
                                                                while (true) {
                                                                    jArr3 = jArr3;
                                                                    if (i19 < i18) {
                                                                        length3 = length3;
                                                                        break;
                                                                    }
                                                                    length3 = length3;
                                                                    if (c3590f.charAt(i19) != charSequence.charAt(i19)) {
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        i19++;
                                                                        jArr3 = jArr3;
                                                                        length3 = length3;
                                                                    }
                                                                }
                                                                i20 = 0;
                                                                while (i20 < i18 - i19) {
                                                                    i21 = i18;
                                                                    if (c3590f.charAt((length - 1) - i20) != charSequence.charAt((length2 - 1) - i20)) {
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        i20++;
                                                                        i18 = i21;
                                                                    }
                                                                }
                                                                int i38 = (length - i20) - i19;
                                                                int i39 = (length2 - i20) - i19;
                                                                C2974u c2974u11 = C2971r.f8910C;
                                                                boolean zContainsKey8 = linkedHashMap.containsKey(c2974u11);
                                                                boolean zContainsKey9 = linkedHashMap2.containsKey(c2974u11);
                                                                zContainsKey = linkedHashMap.containsKey(C2971r.f8938x);
                                                                if (zContainsKey) {
                                                                    z10 = false;
                                                                } else {
                                                                    z10 = false;
                                                                }
                                                                if (zContainsKey) {
                                                                    z11 = false;
                                                                } else {
                                                                    z11 = false;
                                                                }
                                                                if (z10) {
                                                                    accessibilityEventM643p = m643p(m624E(i28), 0, 0, Integer.valueOf(length2), charSequenceM619Q);
                                                                } else {
                                                                    accessibilityEventM643p = m643p(m624E(i28), 0, 0, Integer.valueOf(length2), charSequenceM619Q);
                                                                }
                                                                accessibilityEventM643p.setClassName("android.widget.EditText");
                                                                m626G(accessibilityEventM643p);
                                                                if (z10) {
                                                                    long j110 = ((C3581L) c2963j.m3786j(C2971r.f8939y)).f10908a;
                                                                    accessibilityEventM643p.setFromIndex((int) (j110 >> 32));
                                                                    accessibilityEventM643p.setToIndex((int) (j110 & 4294967295L));
                                                                    m626G(accessibilityEventM643p);
                                                                } else {
                                                                    long j111 = ((C3581L) c2963j.m3786j(C2971r.f8939y)).f10908a;
                                                                    accessibilityEventM643p.setFromIndex((int) (j111 >> 32));
                                                                    accessibilityEventM643p.setToIndex((int) (j111 & 4294967295L));
                                                                    m626G(accessibilityEventM643p);
                                                                }
                                                            } else {
                                                                i28 = i28;
                                                                jArr3 = jArr3;
                                                                length3 = length3;
                                                                c11 = '\b';
                                                                c0294u2 = c0294u2;
                                                                i15 = i15;
                                                                i16 = i16;
                                                                m618I(this, m624E(i28), 2048, 2, 8);
                                                            }
                                                            i17 = i16;
                                                            c0294u2 = c0294u2;
                                                            c9 = c11;
                                                        } else {
                                                            c2968o = c2968o;
                                                            i28 = i28;
                                                            jArr3 = jArr3;
                                                            length3 = length3;
                                                            i15 = i15;
                                                            i17 = i16;
                                                            c2974u5 = C2971r.f8939y;
                                                            zM18089b3 = AbstractC16544l.m18089b(c2974u, c2974u5);
                                                            i22 = c2968o.f8892g;
                                                            if (zM18089b3) {
                                                                obj7 = linkedHashMap2.get(c2974u4);
                                                                if (obj7 == null) {
                                                                    obj7 = null;
                                                                }
                                                                c3590f2 = (C3590f) obj7;
                                                                if (c3590f2 != null) {
                                                                    str2 = str3;
                                                                }
                                                                C3581L c3581l4 = (C3581L) c2963j.m3786j(c2974u5);
                                                                int iM624E8 = m624E(i28);
                                                                long j112 = c3581l4.f10908a;
                                                                c0294u2 = c0294u2;
                                                                c9 = '\b';
                                                                m626G(m643p(iM624E8, Integer.valueOf((int) (j112 >> 32)), Integer.valueOf((int) (j112 & 4294967295L)), Integer.valueOf(str2.length()), m619Q(str2)));
                                                                m629K(i22);
                                                                i17 = i17;
                                                            } else {
                                                                c0294u2 = c0294u2;
                                                                c9 = '\b';
                                                                if (AbstractC16544l.m18089b(c2974u, c2974u7)) {
                                                                    zM18089b4 = true;
                                                                } else {
                                                                    zM18089b4 = AbstractC16544l.m18089b(c2974u, C2971r.f8930p);
                                                                }
                                                                if (zM18089b4) {
                                                                    m623A(c21658d);
                                                                    size = arrayList3.size();
                                                                    i23 = 0;
                                                                    while (true) {
                                                                        if (i23 < size) {
                                                                            c0291t2 = null;
                                                                            break;
                                                                        } else {
                                                                            if (((C0291t1) arrayList3.get(i23)).f1054Y == i28) {
                                                                                c0291t2 = (C0291t1) arrayList3.get(i23);
                                                                                break;
                                                                            }
                                                                            i23++;
                                                                        }
                                                                    }
                                                                    AbstractC16544l.m18091d(c0291t2);
                                                                    obj8 = linkedHashMap2.get(c2974u7);
                                                                    if (obj8 == null) {
                                                                        obj8 = null;
                                                                    }
                                                                    c0291t2.f1058q0 = (C2961h) obj8;
                                                                    obj9 = linkedHashMap2.get(C2971r.f8930p);
                                                                    if (obj9 == null) {
                                                                        obj9 = null;
                                                                    }
                                                                    c0291t2.f1059r0 = (C2961h) obj9;
                                                                    if (c0291t2.f1055Z.contains(c0291t2)) {
                                                                        this.f765d.getSnapshotObserver().m22222a(c0291t2, this.f764M, new C0286s(c0291t2, 2, this));
                                                                    }
                                                                } else if (AbstractC16544l.m18089b(c2974u, C2971r.f8925k)) {
                                                                    value = entry.getValue();
                                                                    AbstractC16544l.m18092e(value, "null cannot be cast to non-null type kotlin.Boolean");
                                                                    if (((Boolean) value).booleanValue()) {
                                                                        m626G(m642o(m624E(i22), 8));
                                                                    }
                                                                    m618I(this, m624E(i22), 2048, 0, 8);
                                                                } else {
                                                                    c2974u6 = AbstractC2962i.f8875v;
                                                                    if (AbstractC16544l.m18089b(c2974u, c2974u6)) {
                                                                        list2 = (List) c2963j.m3786j(c2974u6);
                                                                        obj11 = linkedHashMap.get(c2974u6);
                                                                        if (obj11 == null) {
                                                                            obj11 = null;
                                                                        }
                                                                        list3 = (List) obj11;
                                                                        if (list3 != null) {
                                                                            linkedHashSet = new LinkedHashSet();
                                                                            if (list2.size() <= 0) {
                                                                                list2.get(0).getClass();
                                                                                throw new ClassCastException();
                                                                            }
                                                                            linkedHashSet2 = new LinkedHashSet();
                                                                            if (list3.size() <= 0) {
                                                                                list3.get(0).getClass();
                                                                                throw new ClassCastException();
                                                                            }
                                                                            if (linkedHashSet.containsAll(linkedHashSet2)) {
                                                                            }
                                                                            z13 = true;
                                                                        } else if (!list2.isEmpty()) {
                                                                            i26 = i17;
                                                                            c2968o = c2968o;
                                                                            i28 = i28;
                                                                            c0294u1 = c0294u2;
                                                                            i27 = i15;
                                                                            arrayList4 = arrayList4;
                                                                            iArr3 = iArr3;
                                                                            jArr3 = jArr3;
                                                                            length3 = length3;
                                                                            z13 = true;
                                                                        }
                                                                    } else {
                                                                        if (entry.getValue() instanceof C2954a) {
                                                                            Object value14 = entry.getValue();
                                                                            AbstractC16544l.m18092e(value14, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                                            c2954a = (C2954a) value14;
                                                                            obj10 = linkedHashMap.get((C2974u) entry.getKey());
                                                                            if (obj10 == null) {
                                                                                obj10 = null;
                                                                            }
                                                                            if (c2954a != obj10) {
                                                                                if (obj10 instanceof C2954a) {
                                                                                    c2954a2 = (C2954a) obj10;
                                                                                    if (AbstractC16544l.m18089b(c2954a.f8837a, c2954a2.f8837a)) {
                                                                                        InterfaceC17302e interfaceC17302e7 = c2954a2.f8838b;
                                                                                        InterfaceC17302e interfaceC17302e8 = c2954a.f8838b;
                                                                                        if (interfaceC17302e8 == null) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (!z12) {
                                                                                z13 = false;
                                                                            }
                                                                        }
                                                                        z13 = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i26 = i17;
                                                c2968o = c2968o;
                                                i28 = i28;
                                                c0294u1 = c0294u2;
                                                i27 = i15;
                                                arrayList4 = arrayList4;
                                                iArr3 = iArr3;
                                                jArr3 = jArr3;
                                                length3 = length3;
                                            }
                                            i17 = i16;
                                            i26 = i17;
                                            c2968o = c2968o;
                                            i28 = i28;
                                            c0294u1 = c0294u2;
                                            i27 = i15;
                                            arrayList4 = arrayList4;
                                            iArr3 = iArr3;
                                            jArr3 = jArr3;
                                            length3 = length3;
                                        }
                                    }
                                    i17 = i26;
                                    i26 = i17;
                                    c2968o = c2968o;
                                    i28 = i28;
                                    c0294u1 = c0294u2;
                                    i27 = i15;
                                    arrayList4 = arrayList4;
                                    iArr3 = iArr3;
                                    jArr3 = jArr3;
                                    length3 = length3;
                                }
                            }
                        }
                    } else {
                        i11 = i27;
                        i12 = i26;
                        arrayList2 = arrayList4;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i13 = length3;
                        i14 = i25;
                    }
                    j11 >>= i14;
                    i27 = i11 + 1;
                    c12982u2 = c12982u;
                    i26 = i12;
                    i25 = i14;
                    arrayList4 = arrayList2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    length3 = i13;
                }
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                int i40 = length3;
                if (i26 != i25) {
                    return;
                } else {
                    i10 = i40;
                }
            } else {
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                i10 = length3;
            }
            if (i24 == i10) {
                return;
            }
            i24++;
            c12982u2 = c12982u;
            length3 = i10;
            arrayList4 = arrayList;
            iArr3 = iArr;
            jArr3 = jArr;
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m631M(C21658D c21658d, C12983v c12983v) {
        C2963j c2963jM22056q;
        if (c21658d.m22024V() && !this.f765d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c21658d)) {
            C21658D c21658d2 = null;
            if (!c21658d.f68638I0.m2020g(8)) {
                c21658d = c21658d.m22009G();
                while (true) {
                    if (c21658d == null) {
                        c21658d = null;
                        break;
                    } else if (c21658d.f68638I0.m2020g(8)) {
                        break;
                    } else {
                        c21658d = c21658d.m22009G();
                    }
                }
            }
            if (c21658d == null || (c2963jM22056q = c21658d.m22056q()) == null) {
                return;
            }
            if (!c2963jM22056q.f8881Z) {
                for (C21658D c21658dM22009G = c21658d.m22009G(); c21658dM22009G != null; c21658dM22009G = c21658dM22009G.m22009G()) {
                    C2963j c2963jM22056q2 = c21658dM22009G.m22056q();
                    if (c2963jM22056q2 != null && c2963jM22056q2.f8881Z) {
                        c21658d2 = c21658dM22009G;
                        break;
                    }
                }
                if (c21658d2 != null) {
                    c21658d = c21658d2;
                }
            }
            int i10 = c21658d.f68651Z;
            if (c12983v.m14698a(i10)) {
                m618I(this, m624E(i10), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v18, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: N */
    public final void m632N(C21658D c21658d) {
        if (c21658d.m22024V() && !this.f765d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c21658d)) {
            int i10 = c21658d.f68651Z;
            C2961h c2961h = (C2961h) this.f778q.m14694f(i10);
            C2961h c2961h2 = (C2961h) this.f779r.m14694f(i10);
            if (c2961h == null && c2961h2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM642o = m642o(i10, 4096);
            if (c2961h != null) {
                accessibilityEventM642o.setScrollX((int) ((Number) c2961h.f8850a.invoke()).floatValue());
                accessibilityEventM642o.setMaxScrollX((int) ((Number) c2961h.f8851b.invoke()).floatValue());
            }
            if (c2961h2 != null) {
                accessibilityEventM642o.setScrollY((int) ((Number) c2961h2.f8850a.invoke()).floatValue());
                accessibilityEventM642o.setMaxScrollY((int) ((Number) c2961h2.f8851b.invoke()).floatValue());
            }
            m626G(accessibilityEventM642o);
        }
    }

    /* JADX INFO: renamed from: O */
    public final boolean m633O(C2968o c2968o, int i10, int i11, boolean z6) {
        String strM622x;
        C2963j c2963j = c2968o.f8889d;
        C2974u c2974u = AbstractC2962i.f8861h;
        if (c2963j.f8880Y.containsKey(c2974u) && AbstractC0240d0.m790a(c2968o)) {
            InterfaceC1440o interfaceC1440o = (InterfaceC1440o) ((C2954a) c2968o.f8889d.m3786j(c2974u)).f8838b;
            if (interfaceC1440o != null) {
                return ((Boolean) interfaceC1440o.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z6))).booleanValue();
            }
            return false;
        }
        if ((i10 == i11 && i11 == this.f782u) || (strM622x = m622x(c2968o)) == null) {
            return false;
        }
        if (i10 < 0 || i10 != i11 || i11 > strM622x.length()) {
            i10 = -1;
        }
        this.f782u = i10;
        boolean z10 = strM622x.length() > 0;
        int i12 = c2968o.f8892g;
        m626G(m643p(m624E(i12), z10 ? Integer.valueOf(this.f782u) : null, z10 ? Integer.valueOf(this.f782u) : null, z10 ? Integer.valueOf(strM622x.length()) : null, strM622x));
        m629K(i12);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b9 A[EDGE_INSN: B:28:0x00b9->B:29:0x00ce BREAK  A[LOOP:2: B:17:0x0051->B:27:0x00b7]] */
    /* JADX INFO: renamed from: P */
    public final ArrayList m634P(ArrayList arrayList, boolean z6) {
        int size;
        int i10 = 1;
        C12982u c12982u = AbstractC12972k.f41182a;
        C12982u c12982u2 = new C12982u();
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            m644q((C2968o) arrayList.get(i11), arrayList2, c12982u2);
        }
        ArrayList arrayList3 = new ArrayList();
        int iM19381j = AbstractC17681o.m19381j(arrayList2);
        if (iM19381j >= 0) {
            int i12 = 0;
            while (true) {
                C2968o c2968o = (C2968o) arrayList2.get(i12);
                if (i12 == 0) {
                    size = 0;
                    arrayList3.add(new C17309l(c2968o.m3796f(), AbstractC17681o.m19384m(c2968o)));
                    break;
                }
                C13801c c13801cM3796f = c2968o.m3796f();
                C13801c c13801cM3796f2 = c2968o.m3796f();
                float f10 = c13801cM3796f.f43587b;
                float f11 = c13801cM3796f2.f43589d;
                boolean z10 = f10 >= f11;
                int iM19381j2 = AbstractC17681o.m19381j(arrayList3);
                if (iM19381j2 < 0) {
                    size = 0;
                    arrayList3.add(new C17309l(c2968o.m3796f(), AbstractC17681o.m19384m(c2968o)));
                    break;
                }
                int i13 = 0;
                while (true) {
                    C13801c c13801c = (C13801c) ((C17309l) arrayList3.get(i13)).f55136Y;
                    float f12 = c13801c.f43587b;
                    float f13 = c13801c.f43589d;
                    boolean z11 = f12 >= f13;
                    if (!z10 && !z11 && Math.max(f10, f12) < Math.min(f11, f13)) {
                        arrayList3.set(i13, new C17309l(new C13801c(Math.max(c13801c.f43586a, 0.0f), Math.max(c13801c.f43587b, f10), Math.min(c13801c.f43588c, Float.POSITIVE_INFINITY), Math.min(f13, f11)), ((C17309l) arrayList3.get(i13)).f55137Z));
                        ((List) ((C17309l) arrayList3.get(i13)).f55137Z).add(c2968o);
                        size = 0;
                        break;
                    }
                    if (i13 == iM19381j2) {
                        size = 0;
                        arrayList3.add(new C17309l(c2968o.m3796f(), AbstractC17681o.m19384m(c2968o)));
                        break;
                    }
                    i13++;
                }
                if (i12 == iM19381j) {
                    break;
                }
                i12++;
            }
        } else {
            size = 0;
        }
        AbstractC17685s.m19392u(arrayList3, C0183L.f684p0);
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList3.size();
        for (int i14 = size; i14 < size3; i14++) {
            C17309l c17309l = (C17309l) arrayList3.get(i14);
            AbstractC17685s.m19392u((List) c17309l.f55137Z, new C0195P(new C0195P(z6 ? C0183L.f683o0 : C0183L.f682Z), i10));
            arrayList4.addAll((Collection) c17309l.f55137Z);
        }
        AbstractC17685s.m19392u(arrayList4, new C0013G0(i10));
        while (size <= AbstractC17681o.m19381j(arrayList4)) {
            List list = (List) c12982u2.m14694f(((C2968o) arrayList4.get(size)).f8892g);
            if (list != null) {
                if (m650z((C2968o) arrayList4.get(size))) {
                    size++;
                } else {
                    arrayList4.remove(size);
                }
                arrayList4.addAll(size, list);
                size += list.size();
            } else {
                size++;
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0093 A[LOOP:0: B:5:0x001d->B:29:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x009c A[EDGE_INSN: B:91:0x009c->B:30:0x009c BREAK  A[LOOP:0: B:5:0x001d->B:29:0x0093], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [A1.S] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r29v0, types: [A1.S] */
    /* JADX INFO: renamed from: R */
    public final void m635R() {
        ?? r13;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i10;
        int i11;
        int[] iArr2;
        int iNumberOfTrailingZeros;
        C0294u1 c0294u1;
        C12983v c12983v = new C12983v();
        C12983v c12983v2 = this.f753B;
        int[] iArr3 = c12983v2.f41211b;
        long[] jArr3 = c12983v2.f41210a;
        int length = jArr3.length - 2;
        C12982u c12982u = this.f759H;
        char c9 = 7;
        long j10 = -9187201950435737472L;
        int i12 = 8;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j11 = jArr3[i13];
                if ((((~j11) << c9) & j11 & j10) != j10) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j11 & 255) < 128) {
                            int i16 = iArr3[(i13 << 3) + i15];
                            C0297v1 c0297v1 = (C0297v1) m647t().m14694f(i16);
                            Object obj = null;
                            C2968o c2968o = c0297v1 != null ? c0297v1.f1070a : null;
                            if (c2968o == null) {
                                c12983v.m14698a(i16);
                                c0294u1 = (C0294u1) c12982u.m14694f(i16);
                                if (c0294u1 != null) {
                                    Object obj2 = c0294u1.f1064a.f8880Y.get(C2971r.f8918d);
                                    obj = (String) (obj2 != null ? obj2 : null);
                                }
                                m628J(i16, 32, obj);
                            } else if (!c2968o.f8889d.f8880Y.containsKey(C2971r.f8918d)) {
                                c12983v.m14698a(i16);
                                c0294u1 = (C0294u1) c12982u.m14694f(i16);
                                if (c0294u1 != null) {
                                    Object obj3 = c0294u1.f1064a.f8880Y.get(C2971r.f8918d);
                                    obj = (String) (obj3 != null ? obj3 : null);
                                }
                                m628J(i16, 32, obj);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                    c9 = 7;
                    j10 = -9187201950435737472L;
                } else if (i13 != length) {
                    break;
                    break;
                } else {
                    i13++;
                    c9 = 7;
                    j10 = -9187201950435737472L;
                }
            }
        }
        int[] iArr4 = c12983v.f41211b;
        long[] jArr4 = c12983v.f41210a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i17 = 0;
            while (true) {
                long j12 = jArr4[i17];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j12 & 255) < 128) {
                            int i20 = iArr4[(i17 << 3) + i19];
                            int i21 = (-862048943) * i20;
                            int i22 = i21 ^ (i21 << 16);
                            int i23 = i22 & 127;
                            int i24 = c12983v2.f41212c;
                            int i25 = (i22 >>> 7) & i24;
                            int i26 = 0;
                            while (true) {
                                long[] jArr5 = c12983v2.f41210a;
                                int i27 = i25 >> 3;
                                jArr2 = jArr4;
                                int i28 = (i25 & 7) << 3;
                                long j13 = (jArr5[i27] >>> i28) | ((jArr5[i27 + 1] << (64 - i28)) & ((-i28) >> 63));
                                iArr2 = iArr4;
                                i10 = length2;
                                long j14 = (((long) i23) * 72340172838076673L) ^ j13;
                                long j15 = (j14 - 72340172838076673L) & (~j14) & (-9187201950435737472L);
                                while (j15 != 0) {
                                    iNumberOfTrailingZeros = (i25 + (Long.numberOfTrailingZeros(j15) >> 3)) & i24;
                                    int i29 = i23;
                                    if (c12983v2.f41211b[iNumberOfTrailingZeros] == i20) {
                                        break;
                                    }
                                    j15 &= j15 - 1;
                                    i23 = i29;
                                }
                                int i30 = i23;
                                if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i26 += 8;
                                i25 = (i25 + i26) & i24;
                                iArr4 = iArr2;
                                length2 = i10;
                                jArr4 = jArr2;
                                i23 = i30;
                            }
                            int i31 = iNumberOfTrailingZeros;
                            if (i31 >= 0) {
                                c12983v2.m14703f(i31);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr4;
                            i10 = length2;
                            i11 = i12;
                            iArr2 = iArr4;
                        }
                        j12 >>= i11;
                        i19++;
                        iArr4 = iArr2;
                        length2 = i10;
                        jArr4 = jArr2;
                        i12 = i11;
                    }
                    jArr = jArr4;
                    int i32 = length2;
                    int i33 = i12;
                    iArr = iArr4;
                    if (i18 != i33) {
                        break;
                    } else {
                        length2 = i32;
                    }
                } else {
                    jArr = jArr4;
                    iArr = iArr4;
                }
                if (i17 == length2) {
                    break;
                }
                i17++;
                iArr4 = iArr;
                jArr4 = jArr;
                i12 = 8;
            }
        }
        c12982u.m14689a();
        C12982u c12982uM647t = m647t();
        int[] iArr5 = c12982uM647t.f41205b;
        Object[] objArr = c12982uM647t.f41206c;
        long[] jArr6 = c12982uM647t.f41204a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i34 = 0;
            while (true) {
                long j16 = jArr6[i34];
                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i35 = 8 - ((~(i34 - length3)) >>> 31);
                    for (int i36 = 0; i36 < i35; i36++) {
                        if ((j16 & 255) < 128) {
                            int i37 = (i34 << 3) + i36;
                            int i38 = iArr5[i37];
                            C0297v1 c0297v2 = (C0297v1) objArr[i37];
                            C2963j c2963j = c0297v2.f1070a.f8889d;
                            C2974u c2974u = C2971r.f8918d;
                            boolean zContainsKey = c2963j.f8880Y.containsKey(c2974u);
                            C2968o c2968o2 = c0297v2.f1070a;
                            if (zContainsKey && c12983v2.m14698a(i38)) {
                                m628J(i38, 16, (String) c2968o2.f8889d.m3786j(c2974u));
                            }
                            c12982u.m14697i(i38, new C0294u1(c2968o2, m647t()));
                        }
                        j16 >>= 8;
                    }
                    r13 = this;
                    r13 = r13;
                    if (i35 != 8) {
                        break;
                    }
                } else {
                    r13 = this;
                }
                if (i34 == length3) {
                    break;
                } else {
                    i34++;
                }
            }
        } else {
            r13 = this;
        }
        r13.f760I = new C0294u1(r13.f765d.getSemanticsOwner().m3805a(), m647t());
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: b */
    public final C18655i mo636b(View view) {
        return this.f774m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final void m637j(int i10, C1512f c1512f, String str, Bundle bundle) {
        C2968o c2968o;
        C13801c c13801c;
        RectF rectF;
        C13801c c13801cM15322i;
        C0297v1 c0297v1 = (C0297v1) m647t().m14694f(i10);
        if (c0297v1 == null || (c2968o = c0297v1.f1070a) == null) {
            return;
        }
        String strM622x = m622x(c2968o);
        boolean zM18089b = AbstractC16544l.m18089b(str, this.f756E);
        AccessibilityNodeInfo accessibilityNodeInfo = c1512f.f4042a;
        if (zM18089b) {
            int iM14681e = this.f754C.m14681e(i10);
            if (iM14681e != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM14681e);
                return;
            }
            return;
        }
        if (AbstractC16544l.m18089b(str, this.f757F)) {
            int iM14681e2 = this.f755D.m14681e(i10);
            if (iM14681e2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM14681e2);
                return;
            }
            return;
        }
        C2974u c2974u = AbstractC2962i.f8854a;
        C2963j c2963j = c2968o.f8889d;
        LinkedHashMap linkedHashMap = c2963j.f8880Y;
        AbstractC21678Y abstractC21678Y = null;
        if (!linkedHashMap.containsKey(c2974u) || bundle == null || !AbstractC16544l.m18089b(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            C2974u c2974u2 = C2971r.f8934t;
            if (!linkedHashMap.containsKey(c2974u2) || bundle == null || !AbstractC16544l.m18089b(str, "androidx.compose.ui.semantics.testTag")) {
                if (AbstractC16544l.m18089b(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, c2968o.f8892g);
                    return;
                }
                return;
            } else {
                Object obj = linkedHashMap.get(c2974u2);
                String str2 = (String) (obj == null ? null : obj);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i12 > 0 && i11 >= 0) {
            if (i11 < (strM622x != null ? strM622x.length() : Integer.MAX_VALUE)) {
                C3578I c3578iM797h = AbstractC0240d0.m797h(c2963j);
                if (c3578iM797h == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i13 = 0;
                while (i13 < i12) {
                    int i14 = i11 + i13;
                    if (i14 >= c3578iM797h.f10892a.f10882a.f10934Y.length()) {
                        arrayList.add(abstractC21678Y);
                    } else {
                        C13801c c13801cM4252b = c3578iM797h.m4252b(i14);
                        AbstractC21678Y abstractC21678YM3793c = c2968o.m3793c();
                        long jMo21517D = 0;
                        if (abstractC21678YM3793c != null) {
                            if (!abstractC21678YM3793c.mo22159J0().f30972y0) {
                                abstractC21678YM3793c = abstractC21678Y;
                            }
                            if (abstractC21678YM3793c != null) {
                                jMo21517D = abstractC21678YM3793c.mo21517D(0L);
                            }
                        }
                        C13801c c13801cM15326m = c13801cM4252b.m15326m(jMo21517D);
                        C13801c c13801cM3795e = c2968o.m3795e();
                        if (c13801cM15326m.m15324k(c13801cM3795e)) {
                            c13801cM15322i = c13801cM15326m.m15322i(c13801cM3795e);
                        } else {
                            c13801c = abstractC21678Y;
                        }
                        if (c13801c != 0) {
                            c13801c = c13801cM15322i;
                            long jM8536b = AbstractC8088f6.m8536b(c13801c.f43586a, c13801c.f43587b);
                            AndroidComposeView androidComposeView = this.f765d;
                            long jM11344r = androidComposeView.m11344r(jM8536b);
                            long jM11344r2 = androidComposeView.m11344r(AbstractC8088f6.m8536b(c13801c.f43588c, c13801c.f43589d));
                            rectF = new RectF(C13800b.m15306g(jM11344r), C13800b.m15307h(jM11344r), C13800b.m15306g(jM11344r2), C13800b.m15307h(jM11344r2));
                        } else {
                            c13801c = c13801cM15322i;
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i13++;
                    abstractC21678Y = null;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        AbstractC15256t.m16465c("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    /* JADX INFO: renamed from: k */
    public final Rect m638k(C0297v1 c0297v1) {
        Rect rect = c0297v1.f1071b;
        long jM8536b = AbstractC8088f6.m8536b(rect.left, rect.top);
        AndroidComposeView androidComposeView = this.f765d;
        long jM11344r = androidComposeView.m11344r(jM8536b);
        long jM11344r2 = androidComposeView.m11344r(AbstractC8088f6.m8536b(rect.right, rect.bottom));
        return new Rect((int) Math.floor(C13800b.m15306g(jM11344r)), (int) Math.floor(C13800b.m15307h(jM11344r)), (int) Math.ceil(C13800b.m15306g(jM11344r2)), (int) Math.ceil(C13800b.m15307h(jM11344r2)));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:25:0x0059, B:29:0x006c, B:31:0x0074, B:34:0x007f, B:36:0x0084, B:37:0x0093, B:39:0x009a, B:40:0x00a3, B:20:0x0042), top: B:51:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007f A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:25:0x0059, B:29:0x006c, B:31:0x0074, B:34:0x007f, B:36:0x0084, B:37:0x0093, B:39:0x009a, B:40:0x00a3, B:20:0x0042), top: B:51:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[Catch: all -> 0x0031, LOOP:0: B:35:0x0082->B:36:0x0084, LOOP_END, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:25:0x0059, B:29:0x006c, B:31:0x0074, B:34:0x007f, B:36:0x0084, B:37:0x0093, B:39:0x009a, B:40:0x00a3, B:20:0x0042), top: B:51:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009a A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:25:0x0059, B:29:0x006c, B:31:0x0074, B:34:0x007f, B:36:0x0084, B:37:0x0093, B:39:0x009a, B:40:0x00a3, B:20:0x0042), top: B:51:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007d -> B:43:0x00c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00be -> B:43:0x00c1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    /* JADX INFO: renamed from: l */
    public final java.lang.Object m639l(sm.AbstractC19687c r12) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p003A1.C0203S.m639l(sm.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00df A[DONT_INVERT, PHI: r10
      0x00df: PHI (r10v2 boolean) = (r10v1 boolean), (r10v4 boolean) binds: [B:19:0x0054, B:52:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1 A[LOOP:0: B:18:0x0046->B:54:0x00e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e7 A[EDGE_INSN: B:61:0x00e7->B:55:0x00e7 BREAK  A[LOOP:0: B:18:0x0046->B:54:0x00e1], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v19, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r6v10, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: m */
    public final boolean m640m(int i10, long j10, boolean z6) {
        C2974u c2974u;
        int i11;
        int i12 = 0;
        if (!AbstractC16544l.m18089b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        C12982u c12982uM647t = m647t();
        if (!C13800b.m15303d(j10, 9205357640488583168L) && C13800b.m15309j(j10)) {
            if (z6) {
                c2974u = C2971r.f8930p;
            } else {
                if (z6) {
                    throw new C0644w();
                }
                c2974u = C2971r.f8929o;
            }
            Object[] objArr = c12982uM647t.f41206c;
            long[] jArr = c12982uM647t.f41204a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                boolean z10 = false;
                while (true) {
                    long j11 = jArr[i13];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i13 != length) {
                            break;
                            break;
                        }
                        i13++;
                        i12 = 0;
                    } else {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = i12;
                        while (i16 < i15) {
                            if ((j11 & 255) < 128) {
                                C0297v1 c0297v1 = (C0297v1) objArr[(i13 << 3) + i16];
                                if (AbstractC14334L.m15619H(c0297v1.f1071b).m15315a(j10)) {
                                    Object obj = c0297v1.f1070a.f8889d.f8880Y.get(c2974u);
                                    if (obj == null) {
                                        obj = null;
                                    }
                                    C2961h c2961h = (C2961h) obj;
                                    if (c2961h != null) {
                                        boolean z11 = c2961h.f8852c;
                                        int i17 = z11 ? -i10 : i10;
                                        if (i10 == 0 && z11) {
                                            i17 = -1;
                                        }
                                        ?? r6 = c2961h.f8850a;
                                        if (i17 >= 0 ? ((Number) r6.invoke()).floatValue() < ((Number) c2961h.f8851b.invoke()).floatValue() : ((Number) r6.invoke()).floatValue() > 0.0f) {
                                            z10 = true;
                                        }
                                    }
                                }
                                i11 = 8;
                            } else {
                                i11 = i14;
                            }
                            j11 >>= i11;
                            i16++;
                            i14 = i11;
                        }
                        if (i15 != i14) {
                            break;
                        }
                        if (i13 != length) {
                            break;
                        }
                        i13++;
                        i12 = 0;
                    }
                }
                return z10;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m641n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m649y()) {
                m625F(this.f765d.getSemanticsOwner().m3805a(), this.f760I);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m630L(m647t());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m635R();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: o */
    public final AccessibilityEvent m642o(int i10, int i11) {
        C0297v1 c0297v1;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f765d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i10);
        if (m649y() && (c0297v1 = (C0297v1) m647t().m14694f(i10)) != null) {
            accessibilityEventObtain.setPassword(c0297v1.f1070a.f8889d.f8880Y.containsKey(C2971r.f8910C));
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: p */
    public final AccessibilityEvent m643p(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM642o = m642o(i10, 8192);
        if (num != null) {
            accessibilityEventM642o.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM642o.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM642o.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM642o.getText().add(charSequence);
        }
        return accessibilityEventM642o;
    }

    /* JADX INFO: renamed from: q */
    public final void m644q(C2968o c2968o, ArrayList arrayList, C12982u c12982u) {
        boolean zM791b = AbstractC0240d0.m791b(c2968o);
        Object obj = c2968o.f8889d.f8880Y.get(C2971r.f8926l);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = c2968o.f8892g;
        if ((zBooleanValue || m650z(c2968o)) && m647t().m14691c(i10)) {
            arrayList.add(c2968o);
        }
        if (zBooleanValue) {
            c12982u.m14697i(i10, m634P(AbstractC17680n.m19323D0(C2968o.m3790h(c2968o, false, 7)), zM791b));
            return;
        }
        List listM3790h = C2968o.m3790h(c2968o, false, 7);
        int size = listM3790h.size();
        for (int i11 = 0; i11 < size; i11++) {
            m644q((C2968o) listM3790h.get(i11), arrayList, c12982u);
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m645r(C2968o c2968o) {
        C2963j c2963j = c2968o.f8889d;
        if (!c2963j.f8880Y.containsKey(C2971r.f8915a)) {
            C2974u c2974u = C2971r.f8939y;
            C2963j c2963j2 = c2968o.f8889d;
            if (c2963j2.f8880Y.containsKey(c2974u)) {
                return (int) (4294967295L & ((C3581L) c2963j2.m3786j(c2974u)).f10908a);
            }
        }
        return this.f782u;
    }

    /* JADX INFO: renamed from: s */
    public final int m646s(C2968o c2968o) {
        C2963j c2963j = c2968o.f8889d;
        if (!c2963j.f8880Y.containsKey(C2971r.f8915a)) {
            C2974u c2974u = C2971r.f8939y;
            C2963j c2963j2 = c2968o.f8889d;
            if (c2963j2.f8880Y.containsKey(c2974u)) {
                return (int) (((C3581L) c2963j2.m3786j(c2974u)).f10908a >> 32);
            }
        }
        return this.f782u;
    }

    /* JADX INFO: renamed from: t */
    public final C12982u m647t() {
        if (this.f786y) {
            this.f786y = false;
            this.f752A = AbstractC0240d0.m795f(this.f765d.getSemanticsOwner());
            if (m649y()) {
                C12980s c12980s = this.f754C;
                c12980s.m14677a();
                C12980s c12980s2 = this.f755D;
                c12980s2.m14677a();
                C0297v1 c0297v1 = (C0297v1) m647t().m14694f(-1);
                C2968o c2968o = c0297v1 != null ? c0297v1.f1070a : null;
                AbstractC16544l.m18091d(c2968o);
                ArrayList arrayListM634P = m634P(AbstractC17681o.m19384m(c2968o), AbstractC0240d0.m791b(c2968o));
                int iM19381j = AbstractC17681o.m19381j(arrayListM634P);
                if (1 <= iM19381j) {
                    int i10 = 1;
                    while (true) {
                        int i11 = ((C2968o) arrayListM634P.get(i10 - 1)).f8892g;
                        int i12 = ((C2968o) arrayListM634P.get(i10)).f8892g;
                        c12980s.m14683g(i11, i12);
                        c12980s2.m14683g(i12, i11);
                        if (i10 == iM19381j) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return this.f752A;
    }

    /* JADX INFO: renamed from: v */
    public final String m648v(C2968o c2968o) {
        int iM8921l;
        Object string = c2968o.f8889d.f8880Y.get(C2971r.f8916b);
        String string2 = null;
        if (string == null) {
            string = null;
        }
        C2974u c2974u = C2971r.f8909B;
        C2963j c2963j = c2968o.f8889d;
        LinkedHashMap linkedHashMap = c2963j.f8880Y;
        Object obj = linkedHashMap.get(c2974u);
        if (obj == null) {
            obj = null;
        }
        EnumC3197a enumC3197a = (EnumC3197a) obj;
        Object obj2 = linkedHashMap.get(C2971r.f8933s);
        if (obj2 == null) {
            obj2 = null;
        }
        C2960g c2960g = (C2960g) obj2;
        AndroidComposeView androidComposeView = this.f765d;
        if (enumC3197a != null) {
            int iOrdinal = enumC3197a.ordinal();
            if (iOrdinal == 0) {
                if ((c2960g == null ? false : C2960g.m3783a(c2960g.f8849a, 2)) && string == null) {
                    string = androidComposeView.getContext().getResources().getString(R.string.state_on);
                }
            } else if (iOrdinal == 1) {
                if ((c2960g == null ? false : C2960g.m3783a(c2960g.f8849a, 2)) && string == null) {
                    string = androidComposeView.getContext().getResources().getString(R.string.state_off);
                }
            } else if (iOrdinal == 2 && string == null) {
                string = androidComposeView.getContext().getResources().getString(R.string.indeterminate);
            }
        }
        Object obj3 = linkedHashMap.get(C2971r.f8908A);
        if (obj3 == null) {
            obj3 = null;
        }
        Boolean bool = (Boolean) obj3;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(c2960g == null ? false : C2960g.m3783a(c2960g.f8849a, 4)) && string == null) {
                string = zBooleanValue ? androidComposeView.getContext().getResources().getString(R.string.selected) : androidComposeView.getContext().getResources().getString(R.string.not_selected);
            }
        }
        Object obj4 = linkedHashMap.get(C2971r.f8917c);
        if (obj4 == null) {
            obj4 = null;
        }
        C2959f c2959f = (C2959f) obj4;
        if (c2959f != null) {
            if (c2959f != C2959f.f8845d) {
                if (string == null) {
                    C3505d c3505d = c2959f.f8847b;
                    float f10 = c3505d.f10590b;
                    float f11 = c3505d.f10589a;
                    float f12 = ((f10 - f11) > 0.0f ? 1 : ((f10 - f11) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (c2959f.f8846a - f11) / (f10 - f11);
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 > 1.0f) {
                        f12 = 1.0f;
                    }
                    if (f12 == 0.0f) {
                        iM8921l = 0;
                    } else {
                        iM8921l = 100;
                        if (!(f12 == 1.0f)) {
                            iM8921l = AbstractC8301I.m8921l(Math.round(f12 * 100), 1, 99);
                        }
                    }
                    string = androidComposeView.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(iM8921l));
                }
            } else if (string == null) {
                string = androidComposeView.getContext().getResources().getString(R.string.in_progress);
            }
        }
        C2974u c2974u2 = C2971r.f8938x;
        if (linkedHashMap.containsKey(c2974u2)) {
            C2963j c2963jM3798i = new C2968o(c2968o.f8886a, true, c2968o.f8888c, c2963j).m3798i();
            C2974u c2974u3 = C2971r.f8915a;
            LinkedHashMap linkedHashMap2 = c2963jM3798i.f8880Y;
            Object obj5 = linkedHashMap2.get(c2974u3);
            if (obj5 == null) {
                obj5 = null;
            }
            Collection collection = (Collection) obj5;
            if (collection == null || collection.isEmpty()) {
                Object obj6 = linkedHashMap2.get(C2971r.f8935u);
                if (obj6 == null) {
                    obj6 = null;
                }
                Collection collection2 = (Collection) obj6;
                if (collection2 == null || collection2.isEmpty()) {
                    Object obj7 = linkedHashMap2.get(c2974u2);
                    if (obj7 == null) {
                        obj7 = null;
                    }
                    CharSequence charSequence = (CharSequence) obj7;
                    if (charSequence == null || charSequence.length() == 0) {
                        string2 = androidComposeView.getContext().getResources().getString(R.string.state_empty);
                    }
                }
            }
            string = string2;
        }
        return (String) string;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m649y() {
        return this.f768g.isEnabled() && !this.f772k.isEmpty();
    }

    /* JADX INFO: renamed from: z */
    public final boolean m650z(C2968o c2968o) {
        Object obj = c2968o.f8889d.f8880Y.get(C2971r.f8915a);
        if (obj == null) {
            obj = null;
        }
        List list = (List) obj;
        boolean z6 = ((list != null ? (String) AbstractC17680n.m19343S(list) : null) == null && m621w(c2968o) == null && m648v(c2968o) == null && !m620u(c2968o)) ? false : true;
        if (AbstractC0240d0.m802m(c2968o)) {
            if (c2968o.f8889d.f8881Z) {
                return true;
            }
            if (c2968o.m3802m() && z6) {
                return true;
            }
        }
        return false;
    }
}
