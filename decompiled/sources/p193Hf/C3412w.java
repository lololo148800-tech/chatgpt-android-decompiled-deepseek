package p193Hf;

import android.gov.nist.core.Separators;
import ao.AbstractC11137K;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16644c;

/* JADX INFO: renamed from: Hf.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C3412w extends AbstractC11137K {

    /* JADX INFO: renamed from: d */
    public static final C3412w f10393d = new C3412w(AbstractC16526C.f51263a.mo5693b(AbstractC3409v.class));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ao.AbstractC11137K
    /* JADX INFO: renamed from: c */
    public final KSerializer mo1967c(AbstractC16643b element) {
        AbstractC16544l.m18094g(element, "element");
        if (!(element instanceof C16644c)) {
            throw new IllegalStateException(("Unknown Canmore message from web: " + AbstractC16526C.f51263a.mo5693b(element.getClass()).mo4448c() + Separators.f31991SP + element).toString());
        }
        AbstractC16643b abstractC16643b = (AbstractC16643b) ((C16644c) element).get("type");
        if (abstractC16643b instanceof AbstractC16645d) {
            AbstractC16645d abstractC16645d = (AbstractC16645d) abstractC16643b;
            if (abstractC16645d.mo12923j()) {
                String strMo12922f = abstractC16645d.mo12922f();
                switch (strMo12922f.hashCode()) {
                    case -1097519099:
                        if (strMo12922f.equals("loaded")) {
                            return C3388o.INSTANCE.serializer();
                        }
                        break;
                    case -315615134:
                        if (strMo12922f.equals("streaming")) {
                            return C3397r.Companion.serializer();
                        }
                        break;
                    case 94756344:
                        if (strMo12922f.equals("close")) {
                            return C3373j.INSTANCE.serializer();
                        }
                        break;
                    case 1427818632:
                        if (strMo12922f.equals("download")) {
                            return C3385n.Companion.serializer();
                        }
                        break;
                }
                return C3406u.Companion.serializer();
            }
        }
        throw new IllegalStateException(("Expected type to be a JsonPrimitive, but was " + abstractC16643b).toString());
    }
}
