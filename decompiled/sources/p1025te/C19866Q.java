package p1025te;

import android.net.Uri;
import bf.AbstractC11372a0;
import bf.C11349D;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p098Di.InterfaceC2062k;
import p1042uh.C20263a0;
import p1071w0.AbstractC20734X;
import p1082wd.C20908a;
import p1082wd.C20909b;
import p1113xn.AbstractC21322p;
import p1155zi.C21958S;
import p1155zi.C21987b0;
import p1155zi.C21995d0;
import p1155zi.C21999e0;
import p1155zi.EnumC21964U;
import p1155zi.EnumC21968V0;
import p269Kh.C4699z;
import p269Kh.EnumC4691r;
import p350O1.C6045C;
import p523V9.AbstractC7845A4;
import p775h2.AbstractC14376f;
import ye.EnumC21517f;

/* JADX INFO: renamed from: te.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C19866Q implements InterfaceC2062k {

    /* JADX INFO: renamed from: A */
    public final C17309l f62969A;

    /* JADX INFO: renamed from: a */
    public final C6045C f62970a;

    /* JADX INFO: renamed from: b */
    public final C20909b f62971b;

    /* JADX INFO: renamed from: c */
    public final C20908a f62972c;

    /* JADX INFO: renamed from: d */
    public final Uri f62973d;

    /* JADX INFO: renamed from: e */
    public final boolean f62974e;

    /* JADX INFO: renamed from: f */
    public final Map f62975f;

    /* JADX INFO: renamed from: g */
    public final List f62976g;

    /* JADX INFO: renamed from: h */
    public final EnumC21517f f62977h;

    /* JADX INFO: renamed from: i */
    public final boolean f62978i;

    /* JADX INFO: renamed from: j */
    public final boolean f62979j;

    /* JADX INFO: renamed from: k */
    public final C20263a0 f62980k;

    /* JADX INFO: renamed from: l */
    public final List f62981l;

    /* JADX INFO: renamed from: m */
    public final List f62982m;

    /* JADX INFO: renamed from: n */
    public final int f62983n;

    /* JADX INFO: renamed from: o */
    public final boolean f62984o;

    /* JADX INFO: renamed from: p */
    public final boolean f62985p;

    /* JADX INFO: renamed from: q */
    public final boolean f62986q;

    /* JADX INFO: renamed from: r */
    public final AbstractC7845A4 f62987r;

    /* JADX INFO: renamed from: s */
    public final boolean f62988s;

    /* JADX INFO: renamed from: t */
    public final C21999e0 f62989t;

    /* JADX INFO: renamed from: u */
    public final boolean f62990u;

    /* JADX INFO: renamed from: v */
    public final boolean f62991v;

    /* JADX INFO: renamed from: w */
    public final boolean f62992w;

    /* JADX INFO: renamed from: x */
    public final C21987b0 f62993x;

    /* JADX INFO: renamed from: y */
    public final boolean f62994y;

    /* JADX INFO: renamed from: z */
    public final boolean f62995z;

    /* JADX WARN: Code duplicated, block: B:32:0x0128  */
    /* JADX WARN: Code duplicated, block: B:35:0x0136  */
    /* JADX WARN: Code duplicated, block: B:38:0x0155  */
    /* JADX WARN: Code duplicated, block: B:40:0x015b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0172  */
    /* JADX WARN: Code duplicated, block: B:47:0x0176  */
    /* JADX WARN: Code duplicated, block: B:48:0x017b  */
    /* JADX WARN: Code duplicated, block: B:50:0x017e  */
    /* JADX WARN: Code duplicated, block: B:60:0x019e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:1: B:33:0x0130->B:68:?, LOOP_END, SYNTHETIC] */
    public C19866Q(C6045C input, C20909b conversationModelState, C20908a conversationGizmoState, Uri uri, boolean z6, Map attachments, List inputDecorations, EnumC21517f forceSearchMode, boolean z10, boolean z11, C20263a0 c20263a0, List allGizmos, List mentionableGizmos, int i10, boolean z12, boolean z13, boolean z14, AbstractC7845A4 pendingImage, boolean z15, C21999e0 c21999e0, boolean z16, boolean z17, boolean z18) {
        C21987b0 c21987b0;
        Map map;
        C20263a0 c20263a1;
        C20263a0 c20263a2;
        String str;
        C17309l c17309l;
        Iterator it;
        AbstractC16544l.m18094g(input, "input");
        AbstractC16544l.m18094g(conversationModelState, "conversationModelState");
        AbstractC16544l.m18094g(conversationGizmoState, "conversationGizmoState");
        AbstractC16544l.m18094g(attachments, "attachments");
        AbstractC16544l.m18094g(inputDecorations, "inputDecorations");
        AbstractC16544l.m18094g(forceSearchMode, "forceSearchMode");
        AbstractC16544l.m18094g(allGizmos, "allGizmos");
        AbstractC16544l.m18094g(mentionableGizmos, "mentionableGizmos");
        AbstractC16544l.m18094g(pendingImage, "pendingImage");
        this.f62970a = input;
        this.f62971b = conversationModelState;
        this.f62972c = conversationGizmoState;
        this.f62973d = uri;
        this.f62974e = z6;
        this.f62975f = attachments;
        this.f62976g = inputDecorations;
        this.f62977h = forceSearchMode;
        this.f62978i = z10;
        this.f62979j = z11;
        this.f62980k = c20263a0;
        this.f62981l = allGizmos;
        this.f62982m = mentionableGizmos;
        this.f62983n = i10;
        this.f62984o = z12;
        this.f62985p = z13;
        this.f62986q = z14;
        this.f62987r = pendingImage;
        this.f62988s = z15;
        this.f62989t = c21999e0;
        this.f62990u = z16;
        this.f62991v = z17;
        this.f62992w = z18;
        C21995d0 c21995d0 = C21999e0.Companion;
        EnumC21964U enumC21964U = EnumC21964U.GizmoTag;
        c21995d0.getClass();
        C21958S c21958sM22341a = C21995d0.m22341a(c21999e0, enumC21964U);
        if (c21958sM22341a != null) {
            String str2 = c21958sM22341a.f69521c;
            c21987b0 = new C21987b0(str2 == null ? "" : str2, c21958sM22341a.f69522d, "banner_description", c21958sM22341a.f69524f, (String) null, Boolean.TRUE, 16);
        } else {
            c21987b0 = null;
        }
        this.f62993x = c21987b0;
        boolean zContains = conversationModelState.m21453a().f15258g.contains(EnumC4691r.Search);
        C19869U c19869u = C19869U.f62999a;
        this.f62994y = zContains && z11 && attachments.isEmpty() && pendingImage.equals(c19869u) && c20263a0 == null;
        this.f62995z = !pendingImage.equals(c19869u);
        if (attachments.isEmpty()) {
            map = this.f62975f;
            if (map.isEmpty()) {
                c20263a1 = this.f62972c.f66645a;
                if (c20263a1 == null && AbstractC11372a0.m12784c(c20263a1) && this.f62974e) {
                    c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder_with_snorlax), null);
                } else {
                    c20263a2 = this.f62980k;
                    if (c20263a2 != null) {
                        str = c20263a2.f64086c.f64081a;
                    } else {
                        str = null;
                    }
                    if (str != null || AbstractC21322p.m21681O(str)) {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder), null);
                    } else {
                        Integer numValueOf = Integer.valueOf(R.string.conversations_input_placeholder_with_gizmo);
                        C20263a0 c20263a3 = this.f62980k;
                        String str3 = c20263a3 != null ? c20263a3.f64086c.f64081a : null;
                        c17309l = new C17309l(numValueOf, str3 != null ? str3 : "");
                    }
                }
            } else {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (((C19874e) ((Map.Entry) it.next()).getValue()).f63014b == EnumC21968V0.Transformation) {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder_transform), null);
                    }
                }
                c20263a1 = this.f62972c.f66645a;
                if (c20263a1 == null) {
                    c20263a2 = this.f62980k;
                    if (c20263a2 != null) {
                        str = c20263a2.f64086c.f64081a;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder), null);
                    } else {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder), null);
                    }
                } else {
                    c20263a2 = this.f62980k;
                    if (c20263a2 != null) {
                        str = c20263a2.f64086c.f64081a;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder), null);
                    } else {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder), null);
                    }
                }
            }
        } else {
            Iterator it2 = attachments.entrySet().iterator();
            while (it2.hasNext()) {
                if (((C19874e) ((Map.Entry) it2.next()).getValue()).f63014b == EnumC21968V0.Inpainting) {
                    c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder_inpaint), null);
                }
            }
            map = this.f62975f;
            if (map.isEmpty()) {
                c20263a1 = this.f62972c.f66645a;
                if (c20263a1 == null) {
                    c20263a2 = this.f62980k;
                    if (c20263a2 != null) {
                        str = c20263a2.f64086c.f64081a;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder), null);
                    } else {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder), null);
                    }
                } else {
                    c20263a2 = this.f62980k;
                    if (c20263a2 != null) {
                        str = c20263a2.f64086c.f64081a;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder), null);
                    } else {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder), null);
                    }
                }
            } else {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (((C19874e) ((Map.Entry) it.next()).getValue()).f63014b == EnumC21968V0.Transformation) {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder_transform), null);
                    }
                }
                c20263a1 = this.f62972c.f66645a;
                if (c20263a1 == null) {
                    c20263a2 = this.f62980k;
                    if (c20263a2 != null) {
                        str = c20263a2.f64086c.f64081a;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder), null);
                    } else {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder), null);
                    }
                } else {
                    c20263a2 = this.f62980k;
                    if (c20263a2 != null) {
                        str = c20263a2.f64086c.f64081a;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder), null);
                    } else {
                        c17309l = new C17309l(Integer.valueOf(R.string.conversations_input_placeholder), null);
                    }
                }
            }
        }
        this.f62969A = c17309l;
    }

    /* JADX INFO: renamed from: e */
    public static C19866Q m20782e(C19866Q c19866q, C6045C c6045c, C20909b c20909b, C20908a c20908a, Uri uri, boolean z6, Map map, List list, EnumC21517f enumC21517f, boolean z10, C20263a0 c20263a0, ArrayList arrayList, List list2, boolean z11, boolean z12, AbstractC7845A4 abstractC7845A4, boolean z13, C21999e0 c21999e0, boolean z14, boolean z15, boolean z16, int i10) {
        C6045C input = (i10 & 1) != 0 ? c19866q.f62970a : c6045c;
        C20909b conversationModelState = (i10 & 2) != 0 ? c19866q.f62971b : c20909b;
        C20908a conversationGizmoState = (i10 & 4) != 0 ? c19866q.f62972c : c20908a;
        Uri uri2 = (i10 & 8) != 0 ? c19866q.f62973d : uri;
        boolean z17 = (i10 & 16) != 0 ? c19866q.f62974e : z6;
        Map attachments = (i10 & 32) != 0 ? c19866q.f62975f : map;
        List inputDecorations = (i10 & 64) != 0 ? c19866q.f62976g : list;
        EnumC21517f forceSearchMode = (i10 & 128) != 0 ? c19866q.f62977h : enumC21517f;
        boolean z18 = c19866q.f62978i;
        boolean z19 = (i10 & 512) != 0 ? c19866q.f62979j : z10;
        C20263a0 c20263a1 = (i10 & 1024) != 0 ? c19866q.f62980k : c20263a0;
        List allGizmos = (i10 & 2048) != 0 ? c19866q.f62981l : arrayList;
        List mentionableGizmos = (i10 & 4096) != 0 ? c19866q.f62982m : list2;
        int i11 = c19866q.f62983n;
        boolean z20 = (i10 & 16384) != 0 ? c19866q.f62984o : z11;
        boolean z21 = (32768 & i10) != 0 ? c19866q.f62985p : z12;
        boolean z22 = c19866q.f62986q;
        AbstractC7845A4 pendingImage = (i10 & 131072) != 0 ? c19866q.f62987r : abstractC7845A4;
        C20263a0 c20263a2 = c20263a1;
        boolean z23 = (i10 & 262144) != 0 ? c19866q.f62988s : z13;
        C21999e0 c21999e1 = (524288 & i10) != 0 ? c19866q.f62989t : c21999e0;
        boolean z24 = (1048576 & i10) != 0 ? c19866q.f62990u : z14;
        boolean z25 = (2097152 & i10) != 0 ? c19866q.f62991v : z15;
        boolean z26 = (i10 & 4194304) != 0 ? c19866q.f62992w : z16;
        c19866q.getClass();
        AbstractC16544l.m18094g(input, "input");
        AbstractC16544l.m18094g(conversationModelState, "conversationModelState");
        AbstractC16544l.m18094g(conversationGizmoState, "conversationGizmoState");
        AbstractC16544l.m18094g(attachments, "attachments");
        AbstractC16544l.m18094g(inputDecorations, "inputDecorations");
        AbstractC16544l.m18094g(forceSearchMode, "forceSearchMode");
        AbstractC16544l.m18094g(allGizmos, "allGizmos");
        AbstractC16544l.m18094g(mentionableGizmos, "mentionableGizmos");
        AbstractC16544l.m18094g(pendingImage, "pendingImage");
        return new C19866Q(input, conversationModelState, conversationGizmoState, uri2, z17, attachments, inputDecorations, forceSearchMode, z18, z19, c20263a2, allGizmos, mentionableGizmos, i11, z20, z21, z22, pendingImage, z23, c21999e1, z24, z25, z26);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19866Q)) {
            return false;
        }
        C19866Q c19866q = (C19866Q) obj;
        return AbstractC16544l.m18089b(this.f62970a, c19866q.f62970a) && AbstractC16544l.m18089b(this.f62971b, c19866q.f62971b) && AbstractC16544l.m18089b(this.f62972c, c19866q.f62972c) && AbstractC16544l.m18089b(this.f62973d, c19866q.f62973d) && this.f62974e == c19866q.f62974e && AbstractC16544l.m18089b(this.f62975f, c19866q.f62975f) && AbstractC16544l.m18089b(this.f62976g, c19866q.f62976g) && this.f62977h == c19866q.f62977h && this.f62978i == c19866q.f62978i && this.f62979j == c19866q.f62979j && AbstractC16544l.m18089b(this.f62980k, c19866q.f62980k) && AbstractC16544l.m18089b(this.f62981l, c19866q.f62981l) && AbstractC16544l.m18089b(this.f62982m, c19866q.f62982m) && this.f62983n == c19866q.f62983n && this.f62984o == c19866q.f62984o && this.f62985p == c19866q.f62985p && this.f62986q == c19866q.f62986q && AbstractC16544l.m18089b(this.f62987r, c19866q.f62987r) && this.f62988s == c19866q.f62988s && AbstractC16544l.m18089b(this.f62989t, c19866q.f62989t) && this.f62990u == c19866q.f62990u && this.f62991v == c19866q.f62991v && this.f62992w == c19866q.f62992w;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20783f() {
        C4699z c4699z;
        int i10;
        if (this.f62986q) {
            C20908a c20908a = this.f62972c;
            if (c20908a.f66645a != null) {
                C11349D c11349d = c20908a.f66646b;
                c4699z = c11349d != null ? c11349d.f34342y : null;
            } else {
                c4699z = this.f62971b.m21453a().f15259h;
            }
            if (c4699z != null && c4699z.m5398a() && ((i10 = this.f62983n) == 0 || this.f62975f.size() < i10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m20784g() {
        C4699z c4699z;
        int i10;
        C20908a c20908a = this.f62972c;
        if (c20908a.f66645a != null) {
            C11349D c11349d = c20908a.f66646b;
            c4699z = c11349d != null ? c11349d.f34342y : null;
        } else {
            c4699z = this.f62971b.m21453a().f15259h;
        }
        return c4699z != null && c4699z.m5399b() && ((i10 = this.f62983n) == 0 || this.f62975f.size() < i10);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m20785h() {
        C21958S c21958sM22341a;
        C21999e0 c21999e0 = this.f62989t;
        if (c21999e0 != null) {
            C21995d0 c21995d0 = C21999e0.Companion;
            EnumC21964U enumC21964U = EnumC21964U.FileUpload;
            c21995d0.getClass();
            c21958sM22341a = C21995d0.m22341a(c21999e0, enumC21964U);
        } else {
            c21958sM22341a = null;
        }
        return c21958sM22341a != null;
    }

    public final int hashCode() {
        int iHashCode = (this.f62972c.hashCode() + ((this.f62971b.hashCode() + (this.f62970a.hashCode() * 31)) * 31)) * 31;
        Uri uri = this.f62973d;
        int iHashCode2 = (((((this.f62977h.hashCode() + AbstractC14376f.m15858x(this.f62976g, AbstractC20734X.m21250u((((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31) + (this.f62974e ? 1231 : 1237)) * 31, 31, this.f62975f), 31)) * 31) + (this.f62978i ? 1231 : 1237)) * 31) + (this.f62979j ? 1231 : 1237)) * 31;
        C20263a0 c20263a0 = this.f62980k;
        int iHashCode3 = (((this.f62987r.hashCode() + ((((((((AbstractC14376f.m15858x(this.f62982m, AbstractC14376f.m15858x(this.f62981l, (iHashCode2 + (c20263a0 == null ? 0 : c20263a0.hashCode())) * 31, 31), 31) + this.f62983n) * 31) + (this.f62984o ? 1231 : 1237)) * 31) + (this.f62985p ? 1231 : 1237)) * 31) + (this.f62986q ? 1231 : 1237)) * 31)) * 31) + (this.f62988s ? 1231 : 1237)) * 31;
        C21999e0 c21999e0 = this.f62989t;
        return ((((((iHashCode3 + (c21999e0 != null ? c21999e0.hashCode() : 0)) * 31) + (this.f62990u ? 1231 : 1237)) * 31) + (this.f62991v ? 1231 : 1237)) * 31) + (this.f62992w ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
