package p323Mm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8501J3;
import p588Y2.C9642z;

/* JADX INFO: renamed from: Mm.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C5502i extends AbstractC5517x {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f17957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5502i(Member member, Type type, Class cls, Type[] typeArr, int i10) {
        super(member, type, cls, typeArr);
        this.f17957e = i10;
    }

    @Override // p323Mm.InterfaceC5500g
    public final Object call(Object[] args) {
        switch (this.f17957e) {
            case 0:
                AbstractC16544l.m18094g(args, "args");
                AbstractC8501J3.m9165a(this, args);
                Constructor constructor = (Constructor) this.f17969a;
                C9642z c9642z = new C9642z(2);
                c9642z.m10201M(args);
                c9642z.m10200L(null);
                ArrayList arrayList = (ArrayList) c9642z.f29064Z;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                AbstractC16544l.m18094g(args, "args");
                AbstractC8501J3.m9165a(this, args);
                return ((Constructor) this.f17969a).newInstance(Arrays.copyOf(args, args.length));
        }
    }
}
