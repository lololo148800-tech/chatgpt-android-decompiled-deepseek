package p203I0;

import android.content.Context;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p813ij.C15026j;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: I0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C3561r extends ViewGroup {

    /* JADX INFO: renamed from: o0 */
    public final int f10791o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f10792p0;

    /* JADX INFO: renamed from: q0 */
    public final ArrayList f10793q0;

    /* JADX INFO: renamed from: r0 */
    public final C15026j f10794r0;

    /* JADX INFO: renamed from: s0 */
    public int f10795s0;

    public C3561r(Context context) {
        super(context);
        this.f10791o0 = 5;
        ArrayList arrayList = new ArrayList();
        this.f10792p0 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f10793q0 = arrayList2;
        this.f10794r0 = new C15026j(5);
        setClipChildren(false);
        C3563t c3563t = new C3563t(context);
        addView(c3563t);
        arrayList.add(c3563t);
        arrayList2.add(c3563t);
        this.f10795s0 = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: a */
    public final C3563t m4235a(InterfaceC3562s interfaceC3562s) {
        C15026j c15026j = this.f10794r0;
        C3563t c3563t = (C3563t) ((LinkedHashMap) c15026j.f46724Y).get(interfaceC3562s);
        if (c3563t != null) {
            return c3563t;
        }
        C3563t c3563t2 = (C3563t) AbstractC17686t.m19396D(this.f10793q0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) c15026j.f46724Y;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c15026j.f46725Z;
        if (c3563t2 == null) {
            int i10 = this.f10795s0;
            ArrayList arrayList = this.f10792p0;
            if (i10 > AbstractC17681o.m19381j(arrayList)) {
                c3563t2 = new C3563t(getContext());
                addView(c3563t2);
                arrayList.add(c3563t2);
            } else {
                c3563t2 = (C3563t) arrayList.get(this.f10795s0);
                InterfaceC3562s interfaceC3562s2 = (InterfaceC3562s) linkedHashMap2.get(c3563t2);
                if (interfaceC3562s2 != null) {
                    interfaceC3562s2.mo4224H();
                    C3563t c3563t3 = (C3563t) linkedHashMap.get(interfaceC3562s2);
                    if (c3563t3 != null) {
                    }
                    linkedHashMap.remove(interfaceC3562s2);
                    c3563t2.m4238c();
                }
            }
            int i11 = this.f10795s0;
            if (i11 < this.f10791o0 - 1) {
                this.f10795s0 = i11 + 1;
            } else {
                this.f10795s0 = 0;
            }
        }
        linkedHashMap.put(interfaceC3562s, c3563t2);
        linkedHashMap2.put(c3563t2, interfaceC3562s);
        return c3563t2;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
    }
}
