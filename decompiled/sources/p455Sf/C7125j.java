package p455Sf;

import com.openai.chatgpt.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1155zi.C22068v1;
import p1155zi.C22072w1;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;

/* JADX INFO: renamed from: Sf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C7125j extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22676Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22072w1 f22677Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7125j(C22072w1 c22072w1, int i10) {
        super(2);
        this.f22676Y = i10;
        this.f22677Z = c22072w1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        switch (this.f22676Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f22677Z.f69784a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    List list = this.f22677Z.f69787d;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        i10 = R.string.notification_settings_task_notified_off_text;
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i10 = R.string.notification_settings_task_notified_off_text;
                            } else if (((C22068v1) it.next()).f69769c) {
                                i10 = R.string.notification_settings_task_notified_on_text;
                            }
                        }
                    }
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(i10, c6021p2), null, ((C3949M0) c6021p2.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131066);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f22677Z.f69784a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 0, 0, 131070);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
