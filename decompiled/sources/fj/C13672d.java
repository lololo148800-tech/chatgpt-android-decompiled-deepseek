package fj;

import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p049Bm.InterfaceC1436k;
import p482Tg.C7445b0;
import p729ej.AbstractC13431v;
import p999s.C19341c1;

/* JADX INFO: renamed from: fj.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13672d extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16525B f43150Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19341c1 f43151Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13672d(C16525B c16525b, C19341c1 c19341c1) {
        super(1, AbstractC16543k.class, "acceptChildOutput", "createChildNode$acceptChildOutput(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/squareup/workflow1/internal/SubtreeManager;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        this.f43150Y = c16525b;
        this.f43151Z = c19341c1;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Object obj2 = this.f43150Y.f51262Y;
        if (obj2 != null) {
            return ((C7445b0) this.f43151Z.f61256o0).invoke((AbstractC13431v) ((C13673e) obj2).f43153b.invoke(obj));
        }
        AbstractC16544l.m18103p("node");
        throw null;
    }
}
