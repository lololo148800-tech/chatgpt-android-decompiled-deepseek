package p789hg;

import com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModel;
import kg.C16398d;
import kg.C16399e;
import kg.C16400f;
import kg.C16401g;
import kg.C16402h;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p324Mn.C5554x;
import p872lg.C16946f;

/* JADX INFO: renamed from: hg.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C14506e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f45718Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ FinishAccountViewModel f45719Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14506e(FinishAccountViewModel finishAccountViewModel, int i10) {
        super(1);
        this.f45718Y = i10;
        this.f45719Z = finishAccountViewModel;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f45718Y) {
            case 0:
                String it = (String) obj;
                AbstractC16544l.m18094g(it, "it");
                this.f45719Z.m14395k(new C16400f(it));
                break;
            case 1:
                String it2 = (String) obj;
                AbstractC16544l.m18094g(it2, "it");
                this.f45719Z.m14395k(new C16401g(it2));
                break;
            case 2:
                C5554x it3 = (C5554x) obj;
                AbstractC16544l.m18094g(it3, "it");
                this.f45719Z.m14395k(new C16398d(it3));
                break;
            case 3:
                C16946f it4 = (C16946f) obj;
                AbstractC16544l.m18094g(it4, "it");
                this.f45719Z.m14395k(new C16399e(it4));
                break;
            default:
                String it5 = (String) obj;
                AbstractC16544l.m18094g(it5, "it");
                this.f45719Z.m14395k(new C16402h(it5));
                break;
        }
        return C17296C.f55119a;
    }
}
