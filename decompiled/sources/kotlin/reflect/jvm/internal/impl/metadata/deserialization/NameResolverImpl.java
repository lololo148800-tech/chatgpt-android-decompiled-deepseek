package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import android.gov.nist.core.Separators;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import mm.C17315r;
import p025An.C0644w;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class NameResolverImpl implements NameResolver {

    /* JADX INFO: renamed from: a */
    public final ProtoBuf.StringTable f52582a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.QualifiedNameTable f52583b;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NameResolverImpl(ProtoBuf.StringTable strings, ProtoBuf.QualifiedNameTable qualifiedNames) {
        AbstractC16544l.m18094g(strings, "strings");
        AbstractC16544l.m18094g(qualifiedNames, "qualifiedNames");
        this.f52582a = strings;
        this.f52583b = qualifiedNames;
    }

    /* JADX INFO: renamed from: a */
    public final C17315r m18257a(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z6 = false;
        while (i10 != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = this.f52583b.getQualifiedName(i10);
            String string = this.f52582a.getString(qualifiedName.getShortName());
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            AbstractC16544l.m18091d(kind);
            int i11 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(string);
            } else if (i11 == 2) {
                linkedList.addFirst(string);
            } else {
                if (i11 != 3) {
                    throw new C0644w();
                }
                linkedList2.addFirst(string);
                z6 = true;
            }
            i10 = qualifiedName.getParentQualifiedName();
        }
        return new C17315r(linkedList, linkedList2, Boolean.valueOf(z6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getQualifiedClassName(int i10) {
        C17315r c17315rM18257a = m18257a(i10);
        List list = (List) c17315rM18257a.f55146Y;
        String strM19349Y = AbstractC17680n.m19349Y((List) c17315rM18257a.f55147Z, Separators.DOT, null, null, 0, null, null, 62);
        if (list.isEmpty()) {
            return strM19349Y;
        }
        return AbstractC17680n.m19349Y(list, Separators.SLASH, null, null, 0, null, null, 62) + '/' + strM19349Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getString(int i10) {
        String string = this.f52582a.getString(i10);
        AbstractC16544l.m18093f(string, "getString(...)");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i10) {
        return ((Boolean) m18257a(i10).f55148o0).booleanValue();
    }
}
