package p1066vk;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.InputSelectBoxComponentStyle;
import fk.C13690k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC16544l;
import p084D4.AbstractC1893Q;
import p084D4.AbstractC1933p0;
import p084D4.C1914g;
import p084D4.RunnableC1910e;
import p1110xk.AbstractC21295r;
import p1113xn.AbstractC21322p;
import p396Q4.InterfaceC6571a;
import p548Wd.p549VF.zakks;
import p571X9.AbstractC9123E2;
import p720e6.C13288c;
import p817j$.util.DesugarCollections;
import p849k7.C16361n;
import p860l0.C16663C;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p994rk.C19067A1;
import uk.C20381k;

/* JADX INFO: renamed from: vk.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C20642j extends AbstractC1893Q {

    /* JADX INFO: renamed from: d */
    public final List f65511d;

    /* JADX INFO: renamed from: e */
    public final InputSelectBoxComponentStyle f65512e;

    /* JADX INFO: renamed from: f */
    public final boolean f65513f;

    /* JADX INFO: renamed from: g */
    public final C16663C f65514g;

    /* JADX INFO: renamed from: h */
    public String f65515h;

    /* JADX INFO: renamed from: i */
    public final LayoutInflater f65516i;

    /* JADX INFO: renamed from: j */
    public final Set f65517j;

    /* JADX INFO: renamed from: k */
    public final C1914g f65518k;

    public C20642j(Context context, List options, InputSelectBoxComponentStyle inputSelectBoxComponentStyle, boolean z6, List initialSelectedOptions, C16663C c16663c) {
        AbstractC16544l.m18094g(options, "options");
        AbstractC16544l.m18094g(initialSelectedOptions, "initialSelectedOptions");
        this.f65511d = options;
        this.f65512e = inputSelectBoxComponentStyle;
        this.f65513f = z6;
        this.f65514g = c16663c;
        this.f65516i = LayoutInflater.from(context);
        this.f65518k = new C1914g(this, new C16361n());
        List list = options;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C19067A1) it.next()).f60745Z);
        }
        Set setM19328G0 = AbstractC17680n.m19328G0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : initialSelectedOptions) {
            if (setM19328G0.contains(((C19067A1) obj).f60745Z)) {
                arrayList2.add(obj);
            }
        }
        this.f65517j = AbstractC17680n.m19326F0(arrayList2);
        m21198g();
    }

    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: a */
    public final int mo2898a() {
        return this.f65518k.f5602f.size();
    }

    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: d */
    public final void mo2901d(final AbstractC1933p0 abstractC1933p0, int i10) {
        Integer focusedBackgroundColorValue;
        C19067A1 c19067a1 = (C19067A1) this.f65518k.f5602f.get(i10);
        C20381k c20381k = (C20381k) ((C13690k) abstractC1933p0).f43189u;
        c20381k.f64458c.setText(c19067a1.f60744Y);
        final int i11 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: vk.i

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C20642j f65509Z;

            {
                this.f65509Z = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        C20642j this$0 = this.f65509Z;
                        AbstractC16544l.m18094g(this$0, "this$0");
                        AbstractC1933p0 holder = abstractC1933p0;
                        AbstractC16544l.m18094g(holder, "$holder");
                        this$0.m21197f(holder.m3087b());
                        break;
                    default:
                        C20642j this$1 = this.f65509Z;
                        AbstractC16544l.m18094g(this$1, "this$0");
                        AbstractC1933p0 holder2 = abstractC1933p0;
                        AbstractC16544l.m18094g(holder2, "$holder");
                        this$1.m21197f(holder2.m3087b());
                        break;
                }
            }
        };
        ConstraintLayout constraintLayout = c20381k.f64456a;
        constraintLayout.setOnClickListener(onClickListener);
        final int i12 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: vk.i

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C20642j f65509Z;

            {
                this.f65509Z = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        C20642j this$0 = this.f65509Z;
                        AbstractC16544l.m18094g(this$0, "this$0");
                        AbstractC1933p0 holder = abstractC1933p0;
                        AbstractC16544l.m18094g(holder, "$holder");
                        this$0.m21197f(holder.m3087b());
                        break;
                    default:
                        C20642j this$1 = this.f65509Z;
                        AbstractC16544l.m18094g(this$1, "this$0");
                        AbstractC1933p0 holder2 = abstractC1933p0;
                        AbstractC16544l.m18094g(holder2, "$holder");
                        this$1.m21197f(holder2.m3087b());
                        break;
                }
            }
        };
        MaterialCheckBox materialCheckBox = c20381k.f64457b;
        materialCheckBox.setOnClickListener(onClickListener2);
        boolean zContains = this.f65517j.contains(c19067a1);
        materialCheckBox.setChecked(zContains);
        InputSelectBoxComponentStyle inputSelectBoxComponentStyle = this.f65512e;
        if (inputSelectBoxComponentStyle == null || (focusedBackgroundColorValue = inputSelectBoxComponentStyle.getFocusedBackgroundColorValue()) == null) {
            return;
        }
        int iIntValue = focusedBackgroundColorValue.intValue();
        if (this.f65513f) {
            return;
        }
        if (zContains) {
            constraintLayout.setBackgroundColor(iIntValue);
            return;
        }
        TypedValue typedValue = new TypedValue();
        constraintLayout.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        constraintLayout.setBackgroundResource(typedValue.resourceId);
    }

    /* JADX INFO: renamed from: f */
    public final void m21197f(int i10) {
        Set set = this.f65517j;
        if (!this.f65513f) {
            set.clear();
        }
        C19067A1 c19067a1 = (C19067A1) this.f65518k.f5602f.get(i10);
        if (set.contains(c19067a1)) {
            set.remove(c19067a1);
        } else {
            AbstractC16544l.m18091d(c19067a1);
            set.add(c19067a1);
        }
        this.f5529a.m2906d(i10, null, 1);
        AbstractC16544l.m18091d(c19067a1);
        this.f65514g.invoke(c19067a1);
    }

    /* JADX INFO: renamed from: g */
    public final void m21198g() {
        String str = this.f65515h;
        List list = this.f65511d;
        if (str != null && !AbstractC21322p.m21681O(str)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (AbstractC21322p.m21667A(((C19067A1) obj).f60744Y, str, true)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        C1914g c1914g = this.f65518k;
        int i10 = c1914g.f5603g + 1;
        c1914g.f5603g = i10;
        List list2 = c1914g.f5601e;
        if (list == list2) {
            return;
        }
        C13288c c13288c = c1914g.f5597a;
        if (list == null) {
            int size = list2.size();
            c1914g.f5601e = null;
            c1914g.f5602f = Collections.emptyList();
            c13288c.m14921a0(0, size);
            c1914g.m3039a();
            return;
        }
        if (list2 != null) {
            ((ExecutorService) c1914g.f5598b.f34016Y).execute(new RunnableC1910e(c1914g, list2, list, i10));
            return;
        }
        c1914g.f5601e = list;
        c1914g.f5602f = DesugarCollections.unmodifiableList(list);
        c13288c.m14920Z(0, list.size());
        c1914g.m3039a();
    }

    @Override // p084D4.AbstractC1893Q
    /* JADX INFO: renamed from: e */
    public final AbstractC1933p0 mo2902e(ViewGroup viewGroup, int i10) {
        AbstractC16544l.m18094g(viewGroup, zakks.YlwQZUpPoqoGK);
        View viewInflate = this.f65516i.inflate(com.openai.chatgpt.R.layout.pi2_ui_list_item, viewGroup, false);
        int i11 = com.openai.chatgpt.R.id.checkbox;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC9123E2.m9654b(viewInflate, com.openai.chatgpt.R.id.checkbox);
        if (materialCheckBox != null) {
            i11 = com.openai.chatgpt.R.id.label;
            TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, com.openai.chatgpt.R.id.label);
            if (textView != null) {
                C13690k c13690k = new C13690k(new C20381k((ConstraintLayout) viewInflate, materialCheckBox, textView));
                InterfaceC6571a interfaceC6571a = c13690k.f43189u;
                AbstractC16544l.m18093f(interfaceC6571a, "<get-binding>(...)");
                C20381k c20381k = (C20381k) interfaceC6571a;
                TextView textView2 = c20381k.f64458c;
                InputSelectBoxComponentStyle inputSelectBoxComponentStyle = this.f65512e;
                if (inputSelectBoxComponentStyle != null) {
                    AbstractC21295r.m21637c(textView2, inputSelectBoxComponentStyle.getTextBasedStyle());
                }
                MaterialCheckBox materialCheckBox2 = c20381k.f64457b;
                if (this.f65513f) {
                    materialCheckBox2.setVisibility(0);
                    materialCheckBox2.setButtonTintList(ColorStateList.valueOf(textView2.getCurrentTextColor()));
                } else {
                    materialCheckBox2.setVisibility(8);
                }
                return c13690k;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
