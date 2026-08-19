package p1112xm;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p801i5.C14932d;
import p801i5.InterfaceC14933e;
import p825j5.C16124a;

/* JADX INFO: renamed from: xm.i */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C21305i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f67715Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ArrayList f67716Z;

    public /* synthetic */ C21305i(int i10, ArrayList arrayList) {
        this.f67715Y = i10;
        this.f67716Z = arrayList;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f67715Y) {
            case 0:
                String it = (String) obj;
                AbstractC16544l.m18094g(it, "it");
                this.f67716Z.add(it);
                return C17296C.f55119a;
            default:
                C16124a cursor = (C16124a) obj;
                ArrayList arrayList = this.f67716Z;
                AbstractC16544l.m18094g(cursor, "cursor");
                while (Boolean.valueOf(cursor.f50035a.moveToNext()).booleanValue()) {
                    String strM17679a = cursor.m17679a(0);
                    if (strM17679a == null) {
                        strM17679a = "";
                    }
                    arrayList.add(strM17679a);
                }
                InterfaceC14933e.f46523a.getClass();
                return new C14932d(C17296C.f55119a);
        }
    }
}
