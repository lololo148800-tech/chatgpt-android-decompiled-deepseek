package kotlinx.serialization.descriptors;

import io.sentry.config.AbstractC15340a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface SerialDescriptor {
    /* JADX INFO: renamed from: a */
    String mo10679a();

    /* JADX INFO: renamed from: c */
    boolean mo10680c();

    /* JADX INFO: renamed from: d */
    int mo10681d(String str);

    /* JADX INFO: renamed from: e */
    int mo10682e();

    /* JADX INFO: renamed from: f */
    String mo10683f(int i10);

    /* JADX INFO: renamed from: g */
    List mo10684g(int i10);

    List getAnnotations();

    AbstractC15340a getKind();

    /* JADX INFO: renamed from: h */
    SerialDescriptor mo10685h(int i10);

    /* JADX INFO: renamed from: i */
    boolean mo10686i(int i10);

    boolean isInline();
}
