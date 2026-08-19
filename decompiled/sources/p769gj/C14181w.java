package p769gj;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: gj.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C14181w implements InterfaceC14149C {

    /* JADX INFO: renamed from: b */
    public final Map f44574b;

    public C14181w(InterfaceC14147A... bindings) {
        AbstractC16544l.m18094g(bindings, "bindings");
        ArrayList arrayList = new ArrayList(bindings.length);
        int length = bindings.length;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            InterfaceC14147A interfaceC14147A = bindings[i11];
            i11++;
            arrayList.add(new C17309l(interfaceC14147A.getType(), interfaceC14147A));
        }
        Map mapM19253o = AbstractC17659D.m19253o(arrayList);
        if (mapM19253o.keySet().size() == bindings.length) {
            this.f44574b = mapM19253o;
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(bindings.length);
        int length2 = bindings.length;
        while (i10 < length2) {
            InterfaceC14147A interfaceC14147A2 = bindings[i10];
            i10++;
            arrayList2.add(interfaceC14147A2.getType());
        }
        sb2.append(arrayList2);
        sb2.append(" must not have duplicate entries.");
        throw new IllegalStateException(sb2.toString().toString());
    }
}
