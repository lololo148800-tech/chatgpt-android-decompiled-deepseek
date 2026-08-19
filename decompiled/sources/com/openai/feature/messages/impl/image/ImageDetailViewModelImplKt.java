package com.openai.feature.messages.impl.image;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1025te.C19874e;
import p1025te.C19876g;
import p1025te.InterfaceC19878i;
import p1155zi.C21954Q0;
import p1155zi.C21962T0;
import p1155zi.C21965U0;
import p1155zi.C22071w0;
import p1155zi.EnumC21968V0;
import p1155zi.InterfaceC21915G;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18067d2 = {"impl_release"}, m18068k = 2, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class ImageDetailViewModelImplKt {
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX INFO: renamed from: a */
    public static final boolean m14316a(String str, Map map) {
        boolean zM18089b;
        C21954Q0 c21954q0;
        if (map.size() != 1 || map.isEmpty()) {
            return false;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC19878i interfaceC19878i = ((C19874e) ((Map.Entry) it.next()).getValue()).f63015c;
            if (interfaceC19878i instanceof C19876g) {
                InterfaceC21915G interfaceC21915G = ((C19876g) interfaceC19878i).f63017a;
                if (interfaceC21915G instanceof C22071w0) {
                    C22071w0 c22071w0 = (C22071w0) interfaceC21915G;
                    if (!AbstractC16544l.m18089b(c22071w0.f69777d, str)) {
                        zM18089b = false;
                    } else if (c22071w0.f69774a != EnumC21968V0.Inpainting) {
                        zM18089b = true;
                    } else {
                        zM18089b = false;
                    }
                } else if (interfaceC21915G instanceof C21965U0) {
                    C21962T0 c21962t0 = ((C21965U0) interfaceC21915G).f69539f;
                    zM18089b = AbstractC16544l.m18089b((c21962t0 == null || (c21954q0 = c21962t0.f69526a) == null) ? null : c21954q0.f69512a, str);
                } else {
                    zM18089b = false;
                }
            } else {
                zM18089b = false;
            }
            if (zM18089b) {
                return true;
            }
        }
        return false;
    }
}
