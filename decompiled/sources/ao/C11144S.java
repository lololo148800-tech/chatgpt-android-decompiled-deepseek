package ao;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p606Yn.C10100a;
import p606Yn.C10106g;
import p606Yn.C10110k;
import p664bc.AbstractC11336c;
import p909nm.C17689w;

/* JADX INFO: renamed from: ao.S */
/* JADX INFO: loaded from: classes2.dex */
public final class C11144S extends AbstractC11137K {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f33780d;

    /* JADX INFO: renamed from: e */
    public final C10106g f33781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11144S(final KSerializer kSerializer, final KSerializer kSerializer2, int i10) {
        super(kSerializer, kSerializer2);
        this.f33780d = i10;
        switch (i10) {
            case 1:
                super(kSerializer, kSerializer2);
                final int i11 = 1;
                this.f33781e = AbstractC11336c.m12773c("kotlin.Pair", new SerialDescriptor[0], new InterfaceC1436k() { // from class: ao.P
                    @Override // p049Bm.InterfaceC1436k
                    public final Object invoke(Object obj) {
                        C10100a buildSerialDescriptor = (C10100a) obj;
                        switch (i11) {
                            case 0:
                                AbstractC16544l.m18094g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                SerialDescriptor descriptor = kSerializer.getDescriptor();
                                C17689w c17689w = C17689w.f56480Y;
                                buildSerialDescriptor.m10678a(SubscriberAttributeKt.JSON_NAME_KEY, descriptor, c17689w, false);
                                buildSerialDescriptor.m10678a("value", kSerializer2.getDescriptor(), c17689w, false);
                                break;
                            default:
                                AbstractC16544l.m18094g(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                SerialDescriptor descriptor2 = kSerializer.getDescriptor();
                                C17689w c17689w2 = C17689w.f56480Y;
                                buildSerialDescriptor.m10678a("first", descriptor2, c17689w2, false);
                                buildSerialDescriptor.m10678a("second", kSerializer2.getDescriptor(), c17689w2, false);
                                break;
                        }
                        return C17296C.f55119a;
                    }
                });
                break;
            default:
                final int i12 = 0;
                this.f33781e = AbstractC11336c.m12774d("kotlin.collections.Map.Entry", C10110k.f29937d, new SerialDescriptor[0], new InterfaceC1436k() { // from class: ao.P
                    @Override // p049Bm.InterfaceC1436k
                    public final Object invoke(Object obj) {
                        C10100a buildSerialDescriptor = (C10100a) obj;
                        switch (i12) {
                            case 0:
                                AbstractC16544l.m18094g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                SerialDescriptor descriptor = kSerializer.getDescriptor();
                                C17689w c17689w = C17689w.f56480Y;
                                buildSerialDescriptor.m10678a(SubscriberAttributeKt.JSON_NAME_KEY, descriptor, c17689w, false);
                                buildSerialDescriptor.m10678a("value", kSerializer2.getDescriptor(), c17689w, false);
                                break;
                            default:
                                AbstractC16544l.m18094g(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                SerialDescriptor descriptor2 = kSerializer.getDescriptor();
                                C17689w c17689w2 = C17689w.f56480Y;
                                buildSerialDescriptor.m10678a("first", descriptor2, c17689w2, false);
                                buildSerialDescriptor.m10678a("second", kSerializer2.getDescriptor(), c17689w2, false);
                                break;
                        }
                        return C17296C.f55119a;
                    }
                });
                break;
        }
    }

    @Override // ao.AbstractC11137K
    /* JADX INFO: renamed from: a */
    public final Object mo12373a(Object obj) {
        switch (this.f33780d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC16544l.m18094g(entry, "<this>");
                return entry.getKey();
            default:
                C17309l c17309l = (C17309l) obj;
                AbstractC16544l.m18094g(c17309l, "<this>");
                return c17309l.f55136Y;
        }
    }

    @Override // ao.AbstractC11137K
    /* JADX INFO: renamed from: b */
    public final Object mo12374b(Object obj) {
        switch (this.f33780d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC16544l.m18094g(entry, "<this>");
                return entry.getValue();
            default:
                C17309l c17309l = (C17309l) obj;
                AbstractC16544l.m18094g(c17309l, "<this>");
                return c17309l.f55137Z;
        }
    }

    @Override // ao.AbstractC11137K
    /* JADX INFO: renamed from: d */
    public final Object mo12375d(Object obj, Object obj2) {
        switch (this.f33780d) {
            case 0:
                return new C11143Q(obj, obj2);
            default:
                return new C17309l(obj, obj2);
        }
    }

    @Override // ao.AbstractC11137K, kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f33780d) {
            case 0:
                break;
        }
        return this.f33781e;
    }
}
