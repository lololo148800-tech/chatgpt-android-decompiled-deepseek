package p191Hd;

import com.openai.chatgpt.R;
import gd.C13880O0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p025An.C0644w;
import p092Dc.C1991h;
import p403Qd.AbstractC6653q0;
import p403Qd.C6627d0;
import p403Qd.C6633g0;
import p403Qd.EnumC6606L;
import p479Td.C7351f0;
import p505Uf.C7638A;
import p523V9.AbstractC8042a0;
import p658b5.C11241l;
import p871lf.AbstractC16927k;
import p871lf.C16923g;
import p871lf.C16926j;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Hd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3288a extends C11241l {

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC13849E f10026o0;

    public C3288a(InterfaceC13849E interfaceC13849E) {
        super(4);
        this.f10026o0 = interfaceC13849E;
    }

    @Override // p658b5.C11241l
    /* JADX INFO: renamed from: D */
    public final EnumC6606L mo3705D() {
        Object objPrevious;
        ArrayList arrayList = (ArrayList) this.f34016Y;
        EnumC6606L enumC6606LM8415c = AbstractC8042a0.m8415c(arrayList);
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((C7351f0) objPrevious).f23311z == null);
        C7351f0 c7351f0 = (C7351f0) objPrevious;
        AbstractC16927k abstractC16927k = c7351f0 != null ? c7351f0.f23311z : null;
        if (abstractC16927k == null) {
            return enumC6606LM8415c;
        }
        if (abstractC16927k instanceof C16923g) {
            return ((C16923g) abstractC16927k).f54362b != null ? EnumC6606L.f21330p0 : enumC6606LM8415c;
        }
        if (abstractC16927k instanceof C16926j) {
            return enumC6606LM8415c;
        }
        throw new C0644w();
    }

    @Override // p658b5.C11241l
    /* JADX INFO: renamed from: E */
    public final AbstractC6653q0 mo3703E(C1991h c1991h) {
        C7638A c7638a;
        Object objPrevious;
        ArrayList arrayList = (ArrayList) this.f34016Y;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        do {
            c7638a = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((C7351f0) objPrevious).f23311z == null);
        C7351f0 c7351f0 = (C7351f0) objPrevious;
        AbstractC16927k abstractC16927k = c7351f0 != null ? c7351f0.f23311z : null;
        if (abstractC16927k == null) {
            return new C6627d0(c1991h.m3160b(R.string.pre_jawbone_tool_summarizer_text), false, 6);
        }
        if (abstractC16927k instanceof C16923g) {
            String strM3160b = ((C16923g) abstractC16927k).f54362b;
            if (strM3160b == null) {
                strM3160b = c1991h.m3160b(R.string.tool_jawbone_creation_generic_error_text);
            }
            return new C6627d0(strM3160b, false, 6);
        }
        if (!(abstractC16927k instanceof C16926j)) {
            throw new C0644w();
        }
        if (!((C14005w2) this.f10026o0).m15481a(C13880O0.f43918c)) {
            return new C6627d0((String) null, true, 3);
        }
        String str = ((C16926j) abstractC16927k).f54364a.f54359a;
        boolean z6 = c7351f0.f23273I;
        List list = c7351f0.f23278N;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C7638A) {
                    arrayList2.add(obj);
                }
            }
            c7638a = (C7638A) AbstractC17680n.m19343S(arrayList2);
        }
        return new C6633g0(str, z6, c7638a, c7351f0.f23297l);
    }
}
