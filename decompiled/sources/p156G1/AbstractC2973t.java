package p156G1;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16549q;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p225Im.InterfaceC3776x;
import p350O1.C6064m;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: G1.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2973t {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC3776x[] f8942a;

    static {
        C16549q c16549q = new C16549q(AbstractC2973t.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        C16527D c16527d = AbstractC16526C.f51263a;
        f8942a = new InterfaceC3776x[]{c16527d.mo5697f(c16549q), AbstractC0168G.m528q(AbstractC2973t.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, c16527d), AbstractC0168G.m528q(AbstractC2973t.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1, c16527d)};
        C2974u c2974u = C2971r.f8915a;
        C2974u c2974u2 = AbstractC2962i.f8854a;
    }

    /* JADX INFO: renamed from: a */
    public static final C2974u m3806a(String str) {
        C2974u c2974u = new C2974u(str);
        c2974u.f8945c = true;
        return c2974u;
    }

    /* JADX INFO: renamed from: b */
    public static final C2974u m3807b(String str, InterfaceC1439n interfaceC1439n) {
        return new C2974u(str, true, interfaceC1439n);
    }

    /* JADX INFO: renamed from: c */
    public static final void m3808c(C2963j c2963j) {
        C2974u c2974u = C2971r.f8915a;
        c2963j.m3787m(C2971r.f8923i, C17296C.f55119a);
    }

    /* JADX INFO: renamed from: d */
    public static void m3809d(C2963j c2963j, InterfaceC1436k interfaceC1436k) {
        c2963j.m3787m(AbstractC2962i.f8854a, new C2954a(null, interfaceC1436k));
    }

    /* JADX INFO: renamed from: e */
    public static void m3810e(C2963j c2963j, int i10, InterfaceC1426a interfaceC1426a) {
        c2963j.m3787m(C2971r.f8940z, new C6064m(i10));
        c2963j.m3787m(AbstractC2962i.f8867n, new C2954a(null, interfaceC1426a));
    }

    /* JADX INFO: renamed from: f */
    public static final void m3811f(C2963j c2963j, String str) {
        C2974u c2974u = C2971r.f8915a;
        c2963j.m3787m(C2971r.f8915a, AbstractC9393x3.m9974d(str));
    }

    /* JADX INFO: renamed from: g */
    public static final void m3812g(C2963j c2963j, int i10) {
        C2974u c2974u = C2971r.f8933s;
        InterfaceC3776x interfaceC3776x = f8942a[12];
        c2974u.m3814a(c2963j, new C2960g(i10));
    }

    /* JADX INFO: renamed from: h */
    public static final void m3813h(C2963j c2963j) {
        C2974u c2974u = C2971r.f8926l;
        InterfaceC3776x interfaceC3776x = f8942a[6];
        c2974u.m3814a(c2963j, Boolean.TRUE);
    }
}
