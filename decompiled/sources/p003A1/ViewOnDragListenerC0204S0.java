package p003A1;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.p650ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import kotlin.jvm.internal.C16556x;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p1140z1.EnumC21705m0;
import p482Tg.C7448e;
import p635a1.AbstractC10458p;
import p692d0.C12962a;
import p692d0.C12967f;
import p693d1.C12989b;
import p693d1.C12992e;
import p693d1.InterfaceC12990c;

/* JADX INFO: renamed from: A1.S0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC0204S0 implements View.OnDragListener, InterfaceC12990c {

    /* JADX INFO: renamed from: a */
    public final C12992e f788a = new C12992e(C0280q.f1029s0);

    /* JADX INFO: renamed from: b */
    public final C12967f f789b = new C12967f(0);

    /* JADX INFO: renamed from: c */
    public final DragAndDropModifierOnDragListener$modifier$1 f790c = new AbstractC21672S() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        @Override // p1140z1.AbstractC21672S
        /* JADX INFO: renamed from: a */
        public final AbstractC10458p mo11196a() {
            return this.f32830Y.f788a;
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.f32830Y.f788a.hashCode();
        }

        @Override // p1140z1.AbstractC21672S
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ void mo11197i(AbstractC10458p abstractC10458p) {
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C12989b c12989b = new C12989b(dragEvent);
        int action = dragEvent.getAction();
        C12992e c12992e = this.f788a;
        switch (action) {
            case 1:
                C16556x c16556x = new C16556x();
                C7448e c7448e = new C7448e(c12989b, c12992e, c16556x, 14);
                if (c7448e.invoke(c12992e) == EnumC21705m0.f68877Y) {
                    AbstractC21690f.m22221z(c12992e, c7448e);
                }
                boolean z6 = c16556x.f51285Y;
                C12967f c12967f = this.f789b;
                c12967f.getClass();
                C12962a c12962a = new C12962a(c12967f);
                while (c12962a.hasNext()) {
                    ((C12992e) c12962a.next()).mo14724e0(c12989b);
                }
                return z6;
            case 2:
                c12992e.mo14726n0(c12989b);
                return false;
            case 3:
                return c12992e.mo14723Q(c12989b);
            case 4:
                c12992e.mo14728w0(c12989b);
                return false;
            case 5:
                c12992e.mo14725n(c12989b);
                return false;
            case 6:
                c12992e.mo14722A(c12989b);
                return false;
            default:
                return false;
        }
    }
}
