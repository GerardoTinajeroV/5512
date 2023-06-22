package  {
	import flash.display.MovieClip;
	import flash.events.Event;

	
	public class Setup extends MovieClip {
		private var Suelo_new: Suelo= new Suelo();  
		static var Protagonista_new: Protagonista = new Protagonista(); 
		static var Antagonista_new: Antagonista = new Antagonista();
		static var puntos: Number = 0; 
		static var puntos_box_new: puntos_box = new puntos_box(); 
		
		

		public function Setup() {
			// constructor code
			///trace("hola mundo");
			
			
			addChild(Suelo_new);
			addChild(Protagonista_new); 
			addChild(Antagonista_new);
			addChild(puntos_box_new); 
			
			Suelo_new.y =388; 
			Suelo_new.x =275; 
			
			Protagonista_new.y=350;
			Protagonista_new.x=275;
			
			Antagonista_new.y=80
			Antagonista_new.x=275;
			
			puntos_box_new.y=15;
			puntos_box_new.x=180; 
			puntos_box_new.puntostxt.text = String(puntos); 
			this.addEventListener(Event.ENTER_FRAME, atualiza_puntos);
			
			
		
		}
			public function atualiza_puntos(e: Event){
				puntos_box_new.puntostxt.text = String(puntos); 
			}
			}

	}
	

