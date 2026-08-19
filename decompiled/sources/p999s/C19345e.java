package p999s;

import android.content.Context;
import android.view.View;
import com.openai.chatgpt.R;
import p604Yk.C10077b;
import p976r.AbstractC18822t;
import p976r.C18824v;
import p976r.MenuC18814l;
import p976r.SubMenuC18802D;

/* JADX INFO: renamed from: s.e */
/* JADX INFO: loaded from: classes.dex */
public final class C19345e extends C18824v {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f61275l = 0;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C19356i f61276m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19345e(C19356i c19356i, Context context, MenuC18814l menuC18814l, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC18814l, true);
        this.f61276m = c19356i;
        this.f59918f = 8388613;
        C10077b c10077b = c19356i.f61295I0;
        this.f59920h = c10077b;
        AbstractC18822t abstractC18822t = this.f59921i;
        if (abstractC18822t != null) {
            abstractC18822t.mo20085b(c10077b);
        }
    }

    @Override // p976r.C18824v
    /* JADX INFO: renamed from: c */
    public final void mo20144c() {
        switch (this.f61275l) {
            case 0:
                C19356i c19356i = this.f61276m;
                c19356i.f61292F0 = null;
                c19356i.getClass();
                super.mo20144c();
                break;
            default:
                C19356i c19356i2 = this.f61276m;
                MenuC18814l menuC18814l = c19356i2.f61298o0;
                if (menuC18814l != null) {
                    menuC18814l.m20122c(true);
                }
                c19356i2.f61291E0 = null;
                super.mo20144c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19345e(C19356i c19356i, Context context, SubMenuC18802D subMenuC18802D, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC18802D, false);
        this.f61276m = c19356i;
        if (!subMenuC18802D.f59780A.m20138f()) {
            View view2 = c19356i.f61304u0;
            this.f59917e = view2 == null ? (View) c19356i.f61303t0 : view2;
        }
        C10077b c10077b = c19356i.f61295I0;
        this.f59920h = c10077b;
        AbstractC18822t abstractC18822t = this.f59921i;
        if (abstractC18822t != null) {
            abstractC18822t.mo20085b(c10077b);
        }
    }
}
