package p770gk;

import androidx.lifecycle.C11082S;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: gk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C14187c implements InterfaceC14185a {

    /* JADX INFO: renamed from: a */
    public final C11082S f44580a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f44581b;

    /* JADX INFO: renamed from: c */
    public final boolean f44582c;

    public C14187c(C11082S savedStateHandle) {
        AbstractC16544l.m18094g(savedStateHandle, "savedStateHandle");
        this.f44580a = savedStateHandle;
        ArrayList arrayList = (ArrayList) savedStateHandle.m12131b("com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector.collectedData");
        this.f44581b = arrayList == null ? new ArrayList() : arrayList;
        this.f44582c = true;
    }

    @Override // p770gk.InterfaceC14185a
    /* JADX INFO: renamed from: a */
    public final boolean mo15506a() {
        return this.f44582c;
    }

    @Override // p770gk.InterfaceC14185a
    /* JADX INFO: renamed from: b */
    public final void mo15507b(InterfaceC14188d interfaceC14188d) {
        ArrayList arrayList = this.f44581b;
        arrayList.add(interfaceC14188d);
        this.f44580a.m12132c("com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector.collectedData", arrayList);
    }
}
