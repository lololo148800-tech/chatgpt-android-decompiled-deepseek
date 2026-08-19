package p375P6;

import android.gov.nist.core.Separators;
import android.opengl.GLDebugHelper;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import kotlin.jvm.internal.AbstractC16544l;
import p477Tb.C7296c;
import p571X9.AbstractC9141H2;
import p571X9.AbstractC9227W;
import p720e6.C13287b;
import p999s.C19341c1;

/* JADX INFO: renamed from: P6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6368e extends Thread {

    /* JADX INFO: renamed from: A0 */
    public final ArrayList f20723A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f20724B0;

    /* JADX INFO: renamed from: C0 */
    public C19341c1 f20725C0;

    /* JADX INFO: renamed from: D0 */
    public final WeakReference f20726D0;

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ AbstractTextureViewSurfaceTextureListenerC6373j f20727E0;

    /* JADX INFO: renamed from: Y */
    public boolean f20728Y;

    /* JADX INFO: renamed from: Z */
    public boolean f20729Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f20730o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f20731p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f20732q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f20733r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f20734s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f20735t0;

    /* JADX INFO: renamed from: u0 */
    public int f20736u0;

    /* JADX INFO: renamed from: v0 */
    public int f20737v0;

    /* JADX INFO: renamed from: w0 */
    public int f20738w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f20739x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f20740y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f20741z0;

    public C6368e(AbstractTextureViewSurfaceTextureListenerC6373j this$0, WeakReference GLTextureViewWeakRef) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(GLTextureViewWeakRef, "GLTextureViewWeakRef");
        this.f20727E0 = this$0;
        this.f20739x0 = true;
        this.f20723A0 = new ArrayList();
        this.f20724B0 = true;
        this.f20738w0 = 1;
        this.f20740y0 = false;
        this.f20726D0 = GLTextureViewWeakRef;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0213 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x022f A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0237 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x023f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0241  */
    /* JADX WARN: Code duplicated, block: B:133:0x0246 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x024c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0252  */
    /* JADX WARN: Code duplicated, block: B:138:0x025d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0261 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x027d  */
    /* JADX WARN: Code duplicated, block: B:151:0x027e A[Catch: all -> 0x0287, TRY_LEAVE, TryCatch #4 {, blocks: (B:148:0x0279, B:151:0x027e), top: B:250:0x0279, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x028d A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0293 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b9 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c9 A[Catch: all -> 0x02cd, TRY_LEAVE, TryCatch #6 {, blocks: (B:165:0x02c4, B:168:0x02c9), top: B:254:0x02c4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x02d6 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:178:0x02f8 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:184:0x030c  */
    /* JADX WARN: Code duplicated, block: B:185:0x030d A[Catch: all -> 0x0311, TRY_LEAVE, TryCatch #7 {, blocks: (B:182:0x0308, B:185:0x030d), top: B:256:0x0308, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x032f A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x033b  */
    /* JADX WARN: Code duplicated, block: B:194:0x033e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0342 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x034f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0350 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x0367 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x036e A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x038a  */
    /* JADX WARN: Code duplicated, block: B:213:0x038b A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #3 {all -> 0x0046, blocks: (B:4:0x002f, B:7:0x0036, B:95:0x01ba, B:97:0x01bf, B:99:0x01cb, B:101:0x01d1, B:104:0x01d8, B:105:0x01db, B:107:0x01e6, B:110:0x01ef, B:112:0x01f5, B:113:0x01f8, B:114:0x01f9, B:117:0x0204, B:120:0x020d, B:121:0x0210, B:123:0x0213, B:125:0x022f, B:127:0x0237, B:131:0x0242, B:133:0x0246, B:135:0x024d, B:137:0x0254, B:140:0x0261, B:142:0x0267, B:145:0x026e, B:146:0x0271, B:154:0x0288, B:157:0x028d, B:159:0x0293, B:162:0x02b9, B:163:0x02bc, B:171:0x02ce, B:173:0x02d0, B:175:0x02d6, B:180:0x0300, B:189:0x0313, B:191:0x032f, B:196:0x0342, B:200:0x0353, B:203:0x035c, B:206:0x0363, B:207:0x0366, B:199:0x0350, B:208:0x0367, B:210:0x036e, B:213:0x038b, B:188:0x0312, B:178:0x02f8, B:202:0x0357, B:148:0x0279, B:151:0x027e, B:116:0x01fd, B:165:0x02c4, B:168:0x02c9, B:182:0x0308, B:185:0x030d, B:109:0x01ea), top: B:249:0x002f, inners: #0, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x0390  */
    /* JADX WARN: Code duplicated, block: B:250:0x0279 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x02c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0308 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x039f A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:159:0x0293, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:210:0x036e, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final void m6977a() throws Throwable {
        ReentrantLock reentrantLock;
        Condition condition;
        boolean z6;
        boolean z10;
        boolean z11;
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j;
        InterfaceC6371h interfaceC6371h;
        C19341c1 c19341c1;
        EGL10 egl10;
        int iEglGetError;
        boolean z12;
        String message;
        String message2;
        String message3;
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j2;
        InterfaceC6371h interfaceC6371h2;
        String message4;
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j3;
        InterfaceC6371h interfaceC6371h3;
        GL gl2;
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j4;
        int i10;
        int i11;
        C6370g c6370g;
        boolean z13;
        boolean z14;
        Condition condition2;
        WeakReference weakReference;
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j5;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i12;
        int i13;
        boolean z20;
        C6368e c6368e = this;
        WeakReference mGLTextureViewWeakRef = c6368e.f20726D0;
        AbstractTextureViewSurfaceTextureListenerC6373j this$0 = c6368e.f20727E0;
        C19341c1 c19341c2 = new C19341c1();
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(mGLTextureViewWeakRef, "mGLTextureViewWeakRef");
        c19341c2.f61260s0 = this$0;
        c19341c2.f61254Y = mGLTextureViewWeakRef;
        ReentrantLock reentrantLock2 = this$0.f20761w0;
        c6368e.f20725C0 = c19341c2;
        c6368e.f20733r0 = false;
        c6368e.f20734s0 = false;
        c6368e.f20740y0 = false;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        boolean z26 = false;
        boolean z27 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            Object objRemove = null;
            while (true) {
                try {
                    reentrantLock2.lock();
                    while (true) {
                        try {
                            if (c6368e.f20728Y) {
                                reentrantLock2.unlock();
                                reentrantLock2.lock();
                                m6982f();
                                m6981e();
                                reentrantLock2.unlock();
                                return;
                            }
                            ArrayList arrayList = c6368e.f20723A0;
                            boolean zIsEmpty = arrayList.isEmpty();
                            condition = this$0.f20762x0;
                            z6 = z21;
                            if (!zIsEmpty) {
                                boolean z28 = z22;
                                objRemove = arrayList.remove(0);
                                z22 = z28;
                                break;
                            }
                            boolean z29 = z22;
                            if (z24) {
                                m6982f();
                                m6981e();
                                z24 = false;
                            }
                            if (c6368e.f20730o0 || c6368e.f20732q0) {
                                z13 = z23;
                                z14 = z24;
                            } else {
                                if (this$0.getEnableLogSurface$lib_release()) {
                                    long id2 = getId();
                                    z13 = z23;
                                    StringBuilder sb2 = new StringBuilder();
                                    z14 = z24;
                                    sb2.append("noticed surfaceView surface lost tid=");
                                    sb2.append(id2);
                                    String message5 = sb2.toString();
                                    AbstractC16544l.m18094g(message5, "message");
                                    if (AbstractC9141H2.f27918a) {
                                        Log.i("GLThread", message5);
                                    }
                                } else {
                                    z13 = z23;
                                    z14 = z24;
                                }
                                if (c6368e.f20734s0) {
                                    m6982f();
                                }
                                c6368e.f20732q0 = true;
                                c6368e.f20731p0 = false;
                                condition.signalAll();
                            }
                            if (c6368e.f20730o0 && c6368e.f20732q0) {
                                if (this$0.getEnableLogSurface$lib_release()) {
                                    String message6 = "noticed surfaceView surface acquired tid=" + getId();
                                    AbstractC16544l.m18094g(message6, "message");
                                    if (AbstractC9141H2.f27918a) {
                                        Log.i("GLThread", message6);
                                    }
                                }
                                c6368e.f20732q0 = false;
                                condition.signalAll();
                            }
                            if (z27) {
                                if (this$0.getEnableLogSurface$lib_release()) {
                                    String message7 = "sending render notification tid=" + getId();
                                    AbstractC16544l.m18094g(message7, "message");
                                    if (AbstractC9141H2.f27918a) {
                                        Log.i("GLThread", message7);
                                    }
                                }
                                c6368e.f20740y0 = false;
                                c6368e.f20741z0 = true;
                                condition.signalAll();
                                z27 = false;
                            }
                            if (m6978b()) {
                                if (!c6368e.f20733r0) {
                                    try {
                                        C19341c1 c19341c3 = c6368e.f20725C0;
                                        AbstractC16544l.m18091d(c19341c3);
                                        c19341c3.m20445n();
                                        c6368e.f20733r0 = true;
                                        condition.signalAll();
                                        z6 = true;
                                    } catch (RuntimeException e10) {
                                        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j6 = (AbstractTextureViewSurfaceTextureListenerC6373j) this$0.f20760v0.f42000Z;
                                        ReentrantLock reentrantLock3 = abstractTextureViewSurfaceTextureListenerC6373j6.f20761w0;
                                        reentrantLock3.lock();
                                        try {
                                            abstractTextureViewSurfaceTextureListenerC6373j6.f20762x0.signalAll();
                                            throw e10;
                                        } finally {
                                            reentrantLock3.unlock();
                                        }
                                    }
                                }
                                if (!c6368e.f20733r0 || c6368e.f20734s0) {
                                    z22 = z29;
                                    z23 = z13;
                                } else {
                                    c6368e.f20734s0 = true;
                                    z22 = true;
                                    z23 = true;
                                    z25 = true;
                                }
                                if (c6368e.f20734s0) {
                                    if (c6368e.f20724B0) {
                                        i14 = c6368e.f20736u0;
                                        i15 = c6368e.f20737v0;
                                        c6368e.f20740y0 = true;
                                        if (this$0.getEnableLogSurface$lib_release()) {
                                            String message8 = "noticing that we want render notification tid=" + getId();
                                            AbstractC16544l.m18094g(message8, "message");
                                            if (AbstractC9141H2.f27918a) {
                                                Log.i("GLThread", message8);
                                            }
                                        }
                                        c6368e.f20724B0 = false;
                                        z20 = false;
                                        z22 = true;
                                        z25 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    c6368e.f20739x0 = z20;
                                    condition.signalAll();
                                    if (c6368e.f20740y0) {
                                        z26 = true;
                                    }
                                    z24 = z14;
                                    break;
                                }
                            } else {
                                z22 = z29;
                                z23 = z13;
                            }
                            if (this$0.getEnableLogThreads$lib_release()) {
                                long id3 = getId();
                                weakReference = mGLTextureViewWeakRef;
                                boolean z30 = c6368e.f20733r0;
                                abstractTextureViewSurfaceTextureListenerC6373j5 = this$0;
                                boolean z31 = c6368e.f20734s0;
                                z15 = z22;
                                boolean z32 = c6368e.f20735t0;
                                z16 = z23;
                                boolean z33 = c6368e.f20730o0;
                                z17 = z25;
                                boolean z34 = c6368e.f20731p0;
                                z18 = z26;
                                boolean z35 = c6368e.f20732q0;
                                z19 = z27;
                                int i16 = c6368e.f20736u0;
                                i12 = i14;
                                int i17 = c6368e.f20737v0;
                                i13 = i15;
                                boolean z36 = c6368e.f20739x0;
                                reentrantLock = reentrantLock2;
                                try {
                                    int i18 = c6368e.f20738w0;
                                    StringBuilder sb3 = new StringBuilder();
                                    condition2 = condition;
                                    sb3.append("waiting tid=");
                                    sb3.append(id3);
                                    sb3.append(" mHaveEglContext: ");
                                    sb3.append(z30);
                                    sb3.append(" mHaveEglSurface: ");
                                    sb3.append(z31);
                                    sb3.append(" mFinishedCreatingEglSurface: ");
                                    sb3.append(z32);
                                    sb3.append(" mPaused: ");
                                    sb3.append(false);
                                    sb3.append(" mHasSurface: ");
                                    sb3.append(z33);
                                    sb3.append(" mSurfaceIsBad: ");
                                    sb3.append(z34);
                                    sb3.append(" mWaitingForSurface: ");
                                    sb3.append(z35);
                                    sb3.append(" mWidth: ");
                                    sb3.append(i16);
                                    sb3.append(" mHeight: ");
                                    sb3.append(i17);
                                    sb3.append(" mRequestRender: ");
                                    sb3.append(z36);
                                    sb3.append(" mRenderMode: ");
                                    sb3.append(i18);
                                    String message9 = sb3.toString();
                                    AbstractC16544l.m18094g(message9, "message");
                                    if (AbstractC9141H2.f27918a) {
                                        Log.i("GLThread", message9);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } else {
                                condition2 = condition;
                                weakReference = mGLTextureViewWeakRef;
                                abstractTextureViewSurfaceTextureListenerC6373j5 = this$0;
                                reentrantLock = reentrantLock2;
                                z15 = z22;
                                z16 = z23;
                                z17 = z25;
                                z18 = z26;
                                z19 = z27;
                                i12 = i14;
                                i13 = i15;
                            }
                            condition2.await();
                            c6368e = this;
                            mGLTextureViewWeakRef = weakReference;
                            z21 = z6;
                            this$0 = abstractTextureViewSurfaceTextureListenerC6373j5;
                            z24 = z14;
                            z22 = z15;
                            z23 = z16;
                            z25 = z17;
                            z26 = z18;
                            z27 = z19;
                            i14 = i12;
                            i15 = i13;
                            reentrantLock2 = reentrantLock;
                        } catch (Throwable th3) {
                            th = th3;
                            reentrantLock = reentrantLock2;
                        }
                        try {
                            reentrantLock.unlock();
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    reentrantLock2.unlock();
                    if (objRemove != null) {
                        break;
                    }
                    if (z22) {
                        if (this$0.getEnableLogSurface$lib_release() && AbstractC9141H2.f27918a) {
                            AbstractC15256t.m16482t("GLThread", "egl createSurface");
                        }
                        C19341c1 c19341c4 = c6368e.f20725C0;
                        AbstractC16544l.m18091d(c19341c4);
                        if (c19341c4.m20442g()) {
                            reentrantLock2.lock();
                            try {
                                c6368e.f20735t0 = true;
                                condition.signalAll();
                                reentrantLock2.unlock();
                                z22 = false;
                                if (z23) {
                                    C19341c1 c19341c5 = c6368e.f20725C0;
                                    AbstractC16544l.m18091d(c19341c5);
                                    EGLContext eGLContext = (EGLContext) c19341c5.f61259r0;
                                    AbstractC16544l.m18091d(eGLContext);
                                    gl2 = eGLContext.getGL();
                                    abstractTextureViewSurfaceTextureListenerC6373j4 = (AbstractTextureViewSurfaceTextureListenerC6373j) ((WeakReference) c19341c5.f61254Y).get();
                                    if (abstractTextureViewSurfaceTextureListenerC6373j4 != null) {
                                        int i19 = AbstractTextureViewSurfaceTextureListenerC6373j.f20744I0;
                                        i10 = abstractTextureViewSurfaceTextureListenerC6373j4.f20750F0;
                                        if ((i10 & 3) != 0) {
                                            if ((i10 & 1) != 0) {
                                                i11 = 1;
                                            } else {
                                                i11 = 0;
                                            }
                                            if ((i10 & 2) != 0) {
                                                c6370g = new C6370g();
                                            } else {
                                                c6370g = null;
                                            }
                                            gl2 = GLDebugHelper.wrap(gl2, i11, c6370g);
                                        }
                                    }
                                    AbstractC16544l.m18093f(gl2, "gl");
                                    z23 = false;
                                } else {
                                    z22 = z22;
                                }
                                if (z6) {
                                    if (this$0.getEnableLogRenderer$lib_release()) {
                                        AbstractC15256t.m16482t("GLThread", "onSurfaceCreated");
                                    }
                                    abstractTextureViewSurfaceTextureListenerC6373j3 = (AbstractTextureViewSurfaceTextureListenerC6373j) mGLTextureViewWeakRef.get();
                                    if (abstractTextureViewSurfaceTextureListenerC6373j3 != null) {
                                        interfaceC6371h3 = abstractTextureViewSurfaceTextureListenerC6373j3.f20745A0;
                                        if (interfaceC6371h3 == null) {
                                            AbstractC16544l.m18091d(c6368e.f20725C0);
                                            interfaceC6371h3.mo4420a();
                                        }
                                    }
                                    z6 = false;
                                }
                                if (z25) {
                                    if (this$0.getEnableLogRenderer$lib_release()) {
                                        message4 = "onSurfaceChanged(" + i14 + ", " + i15 + Separators.RPAREN;
                                        AbstractC16544l.m18094g(message4, "message");
                                        if (!AbstractC9141H2.f27918a) {
                                            AbstractC15256t.m16482t("GLThread", message4);
                                        }
                                    }
                                    abstractTextureViewSurfaceTextureListenerC6373j2 = (AbstractTextureViewSurfaceTextureListenerC6373j) mGLTextureViewWeakRef.get();
                                    if (abstractTextureViewSurfaceTextureListenerC6373j2 != null) {
                                        interfaceC6371h2 = abstractTextureViewSurfaceTextureListenerC6373j2.f20745A0;
                                        if (interfaceC6371h2 == null) {
                                            interfaceC6371h2.mo4422c(i14, i15);
                                        }
                                    }
                                    z25 = false;
                                }
                                if (this$0.getEnableLogRendererDrawFrame$lib_release()) {
                                    long id4 = getId();
                                    z10 = z23;
                                    StringBuilder sb4 = new StringBuilder();
                                    z11 = z24;
                                    sb4.append("onDrawFrame tid=");
                                    sb4.append(id4);
                                    message3 = sb4.toString();
                                    AbstractC16544l.m18094g(message3, "message");
                                    if (!AbstractC9141H2.f27918a) {
                                        AbstractC15256t.m16482t("GLThread", message3);
                                    }
                                } else {
                                    z10 = z23;
                                    z11 = z24;
                                }
                                abstractTextureViewSurfaceTextureListenerC6373j = (AbstractTextureViewSurfaceTextureListenerC6373j) mGLTextureViewWeakRef.get();
                                if (abstractTextureViewSurfaceTextureListenerC6373j != null) {
                                    interfaceC6371h = abstractTextureViewSurfaceTextureListenerC6373j.f20745A0;
                                    if (interfaceC6371h == null) {
                                        interfaceC6371h.mo4421b();
                                    }
                                }
                                c19341c1 = c6368e.f20725C0;
                                AbstractC16544l.m18091d(c19341c1);
                                egl10 = (EGL10) c19341c1.f61255Z;
                                AbstractC16544l.m18091d(egl10);
                                if (egl10.eglSwapBuffers((EGLDisplay) c19341c1.f61256o0, (EGLSurface) c19341c1.f61257p0)) {
                                    iEglGetError = 12288;
                                } else {
                                    EGL10 egl11 = (EGL10) c19341c1.f61255Z;
                                    AbstractC16544l.m18091d(egl11);
                                    iEglGetError = egl11.eglGetError();
                                }
                                if (iEglGetError != 12288) {
                                    if (iEglGetError != 12302) {
                                        message2 = AbstractC9227W.m9798a(iEglGetError, "eglSwapBuffers");
                                        AbstractC16544l.m18094g(message2, "message");
                                        if (!AbstractC9141H2.f27918a) {
                                            AbstractC15256t.m16482t("GLThread", message2);
                                        }
                                        reentrantLock2.lock();
                                        z12 = true;
                                        c6368e.f20731p0 = true;
                                        condition.signalAll();
                                        reentrantLock2.unlock();
                                    } else {
                                        z12 = true;
                                        if (this$0.getEnableLogSurface$lib_release()) {
                                            message = "egl context lost tid=" + getId();
                                            AbstractC16544l.m18094g(message, "message");
                                            if (!AbstractC9141H2.f27918a) {
                                                Log.i("GLThread", message);
                                            }
                                        }
                                        z24 = true;
                                    }
                                    if (z26) {
                                        z27 = z12;
                                        z22 = z22;
                                        z21 = z6;
                                        z23 = z10;
                                        z26 = false;
                                    } else {
                                        z22 = z22;
                                        z21 = z6;
                                        z23 = z10;
                                    }
                                } else {
                                    z12 = true;
                                }
                                z24 = z11;
                                if (z26) {
                                    z27 = z12;
                                    z22 = z22;
                                    z21 = z6;
                                    z23 = z10;
                                    z26 = false;
                                } else {
                                    z22 = z22;
                                    z21 = z6;
                                    z23 = z10;
                                }
                            } catch (Throwable th5) {
                                reentrantLock2.unlock();
                                throw th5;
                            }
                        } else {
                            reentrantLock2.lock();
                            try {
                                c6368e.f20735t0 = true;
                                c6368e.f20731p0 = true;
                                condition.signalAll();
                                reentrantLock2.unlock();
                                z21 = z6;
                            } catch (Throwable th6) {
                                reentrantLock2.unlock();
                                throw th6;
                            }
                        }
                        th = th;
                        reentrantLock = reentrantLock2;
                        reentrantLock.lock();
                        try {
                            m6982f();
                            m6981e();
                            throw th;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                    if (z23) {
                        C19341c1 c19341c6 = c6368e.f20725C0;
                        AbstractC16544l.m18091d(c19341c6);
                        EGLContext eGLContext2 = (EGLContext) c19341c6.f61259r0;
                        AbstractC16544l.m18091d(eGLContext2);
                        gl2 = eGLContext2.getGL();
                        abstractTextureViewSurfaceTextureListenerC6373j4 = (AbstractTextureViewSurfaceTextureListenerC6373j) ((WeakReference) c19341c6.f61254Y).get();
                        if (abstractTextureViewSurfaceTextureListenerC6373j4 != null) {
                            int i110 = AbstractTextureViewSurfaceTextureListenerC6373j.f20744I0;
                            i10 = abstractTextureViewSurfaceTextureListenerC6373j4.f20750F0;
                            if ((i10 & 3) != 0) {
                                if ((i10 & 1) != 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if ((i10 & 2) != 0) {
                                    c6370g = new C6370g();
                                } else {
                                    c6370g = null;
                                }
                                gl2 = GLDebugHelper.wrap(gl2, i11, c6370g);
                            }
                        }
                        AbstractC16544l.m18093f(gl2, "gl");
                        z23 = false;
                    } else {
                        z22 = z22;
                    }
                    if (z6) {
                        if (this$0.getEnableLogRenderer$lib_release() && AbstractC9141H2.f27918a) {
                            AbstractC15256t.m16482t("GLThread", "onSurfaceCreated");
                        }
                        abstractTextureViewSurfaceTextureListenerC6373j3 = (AbstractTextureViewSurfaceTextureListenerC6373j) mGLTextureViewWeakRef.get();
                        if (abstractTextureViewSurfaceTextureListenerC6373j3 != null) {
                            interfaceC6371h3 = abstractTextureViewSurfaceTextureListenerC6373j3.f20745A0;
                            if (interfaceC6371h3 == null) {
                                AbstractC16544l.m18091d(c6368e.f20725C0);
                                interfaceC6371h3.mo4420a();
                            }
                        }
                        z6 = false;
                    }
                    if (z25) {
                        if (this$0.getEnableLogRenderer$lib_release()) {
                            message4 = "onSurfaceChanged(" + i14 + ", " + i15 + Separators.RPAREN;
                            AbstractC16544l.m18094g(message4, "message");
                            if (!AbstractC9141H2.f27918a) {
                                AbstractC15256t.m16482t("GLThread", message4);
                            }
                        }
                        abstractTextureViewSurfaceTextureListenerC6373j2 = (AbstractTextureViewSurfaceTextureListenerC6373j) mGLTextureViewWeakRef.get();
                        if (abstractTextureViewSurfaceTextureListenerC6373j2 != null) {
                            interfaceC6371h2 = abstractTextureViewSurfaceTextureListenerC6373j2.f20745A0;
                            if (interfaceC6371h2 == null) {
                                interfaceC6371h2.mo4422c(i14, i15);
                            }
                        }
                        z25 = false;
                    }
                    if (this$0.getEnableLogRendererDrawFrame$lib_release()) {
                        long id5 = getId();
                        z10 = z23;
                        StringBuilder sb5 = new StringBuilder();
                        z11 = z24;
                        sb5.append("onDrawFrame tid=");
                        sb5.append(id5);
                        message3 = sb5.toString();
                        AbstractC16544l.m18094g(message3, "message");
                        if (!AbstractC9141H2.f27918a) {
                            AbstractC15256t.m16482t("GLThread", message3);
                        }
                    } else {
                        z10 = z23;
                        z11 = z24;
                    }
                    abstractTextureViewSurfaceTextureListenerC6373j = (AbstractTextureViewSurfaceTextureListenerC6373j) mGLTextureViewWeakRef.get();
                    if (abstractTextureViewSurfaceTextureListenerC6373j != null) {
                        interfaceC6371h = abstractTextureViewSurfaceTextureListenerC6373j.f20745A0;
                        if (interfaceC6371h == null) {
                            interfaceC6371h.mo4421b();
                        }
                    }
                    c19341c1 = c6368e.f20725C0;
                    AbstractC16544l.m18091d(c19341c1);
                    egl10 = (EGL10) c19341c1.f61255Z;
                    AbstractC16544l.m18091d(egl10);
                    if (egl10.eglSwapBuffers((EGLDisplay) c19341c1.f61256o0, (EGLSurface) c19341c1.f61257p0)) {
                        EGL10 egl12 = (EGL10) c19341c1.f61255Z;
                        AbstractC16544l.m18091d(egl12);
                        iEglGetError = egl12.eglGetError();
                    } else {
                        iEglGetError = 12288;
                    }
                    if (iEglGetError != 12288) {
                        if (iEglGetError != 12302) {
                            message2 = AbstractC9227W.m9798a(iEglGetError, "eglSwapBuffers");
                            AbstractC16544l.m18094g(message2, "message");
                            if (!AbstractC9141H2.f27918a) {
                                AbstractC15256t.m16482t("GLThread", message2);
                            }
                            reentrantLock2.lock();
                            z12 = true;
                            try {
                                c6368e.f20731p0 = true;
                                condition.signalAll();
                                reentrantLock2.unlock();
                            } catch (Throwable th7) {
                                reentrantLock2.unlock();
                                throw th7;
                            }
                        } else {
                            z12 = true;
                            if (this$0.getEnableLogSurface$lib_release()) {
                                message = "egl context lost tid=" + getId();
                                AbstractC16544l.m18094g(message, "message");
                                if (!AbstractC9141H2.f27918a) {
                                    Log.i("GLThread", message);
                                }
                            }
                            z24 = true;
                        }
                        if (z26) {
                            z27 = z12;
                            z22 = z22;
                            z21 = z6;
                            z23 = z10;
                            z26 = false;
                        } else {
                            z22 = z22;
                            z21 = z6;
                            z23 = z10;
                        }
                    } else {
                        z12 = true;
                    }
                    z24 = z11;
                    if (z26) {
                        z27 = z12;
                        z22 = z22;
                        z21 = z6;
                        z23 = z10;
                        z26 = false;
                    } else {
                        z22 = z22;
                        z21 = z6;
                        z23 = z10;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    reentrantLock = reentrantLock2;
                }
            }
            ((Runnable) objRemove).run();
            z21 = z6;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6978b() {
        return this.f20730o0 && !this.f20731p0 && this.f20736u0 > 0 && this.f20737v0 > 0 && (this.f20739x0 || this.f20738w0 == 1);
    }

    /* JADX INFO: renamed from: c */
    public final void m6979c() {
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j = this.f20727E0;
        ReentrantLock reentrantLock = abstractTextureViewSurfaceTextureListenerC6373j.f20761w0;
        Condition condition = abstractTextureViewSurfaceTextureListenerC6373j.f20762x0;
        reentrantLock.lock();
        try {
            this.f20728Y = true;
            condition.signalAll();
            while (!this.f20729Z) {
                try {
                    condition.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6980d(int i10) {
        if (i10 < 0 || i10 > 1) {
            throw new IllegalArgumentException("renderMode");
        }
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j = this.f20727E0;
        ReentrantLock reentrantLock = abstractTextureViewSurfaceTextureListenerC6373j.f20761w0;
        reentrantLock.lock();
        try {
            this.f20738w0 = i10;
            abstractTextureViewSurfaceTextureListenerC6373j.f20762x0.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6981e() {
        InterfaceC6366c interfaceC6366c;
        if (this.f20733r0) {
            C19341c1 c19341c1 = this.f20725C0;
            AbstractC16544l.m18091d(c19341c1);
            if (((AbstractTextureViewSurfaceTextureListenerC6373j) c19341c1.f61260s0).getEnableLogEgl$lib_release()) {
                String message = "finish() tid=" + Thread.currentThread().getId();
                AbstractC16544l.m18094g(message, "message");
                if (AbstractC9141H2.f27918a) {
                    AbstractC15256t.m16482t("EglHelper", message);
                }
            }
            if (((EGLContext) c19341c1.f61259r0) != null) {
                AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j = (AbstractTextureViewSurfaceTextureListenerC6373j) ((WeakReference) c19341c1.f61254Y).get();
                if (abstractTextureViewSurfaceTextureListenerC6373j != null && (interfaceC6366c = abstractTextureViewSurfaceTextureListenerC6373j.f20748D0) != null) {
                    EGL10 egl10 = (EGL10) c19341c1.f61255Z;
                    EGLDisplay eGLDisplay = (EGLDisplay) c19341c1.f61256o0;
                    EGLContext eGLContext = (EGLContext) c19341c1.f61259r0;
                    C7296c c7296c = (C7296c) interfaceC6366c;
                    if (egl10 == null || !egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                        String message2 = "display:" + eGLDisplay + " context: " + eGLContext;
                        AbstractC16544l.m18094g(message2, "message");
                        if (AbstractC9141H2.f27918a) {
                            AbstractC15256t.m16465c("DefaultContextFactory", message2);
                        }
                        if (((AbstractTextureViewSurfaceTextureListenerC6373j) c7296c.f23104Z).getEnableLogThreads$lib_release()) {
                            String message3 = "tid=" + Thread.currentThread().getId();
                            AbstractC16544l.m18094g(message3, "message");
                            if (AbstractC9141H2.f27918a) {
                                Log.i("DefaultContextFactory", message3);
                            }
                        }
                        throw new RuntimeException(AbstractC9227W.m9798a(egl10 == null ? -1 : egl10.eglGetError(), "eglDestroyContex"));
                    }
                }
                c19341c1.f61259r0 = null;
            }
            if (((EGLDisplay) c19341c1.f61256o0) != null) {
                EGL10 egl11 = (EGL10) c19341c1.f61255Z;
                AbstractC16544l.m18091d(egl11);
                egl11.eglTerminate((EGLDisplay) c19341c1.f61256o0);
                c19341c1.f61256o0 = null;
            }
            this.f20733r0 = false;
            AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j2 = (AbstractTextureViewSurfaceTextureListenerC6373j) this.f20727E0.f20760v0.f42000Z;
            ReentrantLock reentrantLock = abstractTextureViewSurfaceTextureListenerC6373j2.f20761w0;
            reentrantLock.lock();
            try {
                abstractTextureViewSurfaceTextureListenerC6373j2.f20762x0.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6982f() {
        if (this.f20734s0) {
            this.f20734s0 = false;
            C19341c1 c19341c1 = this.f20725C0;
            AbstractC16544l.m18091d(c19341c1);
            if (((AbstractTextureViewSurfaceTextureListenerC6373j) c19341c1.f61260s0).getEnableLogEgl$lib_release()) {
                String message = "destroySurface()  tid=" + Thread.currentThread().getId();
                AbstractC16544l.m18094g(message, "message");
                if (AbstractC9141H2.f27918a) {
                    AbstractC15256t.m16482t("EglHelper", message);
                }
            }
            c19341c1.m20443i();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        setName("GLThread " + getId());
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j = this.f20727E0;
        boolean enableLogThreads$lib_release = abstractTextureViewSurfaceTextureListenerC6373j.getEnableLogThreads$lib_release();
        C13287b c13287b = abstractTextureViewSurfaceTextureListenerC6373j.f20760v0;
        if (enableLogThreads$lib_release) {
            String message = "starting tid=" + getId();
            AbstractC16544l.m18094g(message, "message");
            if (AbstractC9141H2.f27918a) {
                Log.i("GLThread", message);
            }
        }
        try {
            m6977a();
        } catch (InterruptedException unused) {
        } finally {
            c13287b.m14911v(this);
        }
    }
}
