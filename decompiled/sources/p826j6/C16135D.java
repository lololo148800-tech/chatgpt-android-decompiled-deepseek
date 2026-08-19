package p826j6;

import com.revenuecat.purchases.google.usecase.C12746a;
import com.revenuecat.purchases.google.usecase.C12748c;
import java.util.ArrayList;
import java.util.function.Consumer;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j6.D */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16135D implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50058a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f50059b;

    public /* synthetic */ C16135D(Object obj, int i10) {
        this.f50058a = i10;
        this.f50059b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f50058a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ((C12748c) this.f50059b).mo14487b((C16155i) obj, arrayList);
                break;
            default:
                ((C12746a) this.f50059b).m14488c((C16155i) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i10 = this.f50058a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
