package p459Sj;

import bj.AbstractC11471r;
import bj.C11447L;
import bj.InterfaceC11470q;
import com.withpersona.sdk2.inquiry.network.dto.government_id.C12893Id;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: renamed from: Sj.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7143a implements InterfaceC11470q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22718a;

    public /* synthetic */ C7143a(int i10) {
        this.f22718a = i10;
    }

    @Override // bj.InterfaceC11470q
    public final AbstractC11471r create(Type type, Set set, C11447L c11447l) {
        switch (this.f22718a) {
            case 0:
                return C12893Id.Companion.createAdapter$lambda$0(type, set, c11447l);
            default:
                return UiComponentConfig.LocalImage.Companion.createAdapter$lambda$0(type, set, c11447l);
        }
    }
}
