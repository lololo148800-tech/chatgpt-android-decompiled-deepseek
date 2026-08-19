package p870le;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p269Kh.C4688o;

/* JADX INFO: renamed from: le.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16872b0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54152Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f54153Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f54154o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16872b0(InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, int i10) {
        super(1);
        this.f54152Y = i10;
        this.f54153Z = interfaceC1436k;
        this.f54154o0 = interfaceC1426a;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f54152Y) {
            case 0:
                C4688o selectedModel = (C4688o) obj;
                AbstractC16544l.m18094g(selectedModel, "selectedModel");
                this.f54153Z.invoke(selectedModel);
                this.f54154o0.invoke();
                break;
            case 1:
                C4688o selectedModel2 = (C4688o) obj;
                AbstractC16544l.m18094g(selectedModel2, "selectedModel");
                this.f54153Z.invoke(selectedModel2);
                this.f54154o0.invoke();
                break;
            case 2:
                C4688o selectedModel3 = (C4688o) obj;
                AbstractC16544l.m18094g(selectedModel3, "selectedModel");
                this.f54153Z.invoke(selectedModel3);
                this.f54154o0.invoke();
                break;
            default:
                String newName = (String) obj;
                AbstractC16544l.m18094g(newName, "newName");
                this.f54153Z.invoke(newName);
                this.f54154o0.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
